package main;

public class RuleThirtyYesThread {
	private int[][] sampleGrid;
	private int arrSize;
	final int THREAD_COUNT = 10;   // number of threads
	
	public RuleThirtyYesThread(int arrSize) {
		sampleGrid = new int[arrSize][arrSize];
		this.arrSize = arrSize;
	}
	
	/**
	 * Used to make the first generation of the cellular automata
	 * 
	 */
	public void makeFirstGen() {
		for (int i = 0; i < arrSize; i++){
			if (i == arrSize / 2) {
				sampleGrid[0][i] = 1;
			} else {
				sampleGrid[0][i] = 0;
			}
			System.out.print(sampleGrid[0][i]);
  		}
		System.out.println();
	}
	
	/**
	 * Used to print the final 2D array
	 * 
	 */

	public void printer() {
		makeFirstGen();
		int slice, fraction, leftover;
		if (arrSize < THREAD_COUNT) {
			slice = arrSize;
		} else {
			slice = THREAD_COUNT;
		}
		// create 10 CountDivisorsThread as workers
        RuleThirtySegments[] worker = new RuleThirtySegments[slice];
		fraction = arrSize / slice;
		leftover = arrSize % slice;
		
		for (int i = 0; i < arrSize - 1; i++) {
			int begin = 0;
			for (int j = 0; j < slice; j++) {
				if (j < leftover) {
					// initialize the tasks of our workers by assigning them to chunks of work
					worker[j] = new RuleThirtySegments(sampleGrid, begin, fraction + 1, i);
					// Determine the range of ints for the next thread.
					begin += fraction + 1;
					//System.out.println("HELLO" + begin);
				} else {
					// initialize the tasks of our workers by assigning them to chunks of work
					//System.out.println("begin: " + begin);
					//System.out.println("fraction : " + fraction);
					worker[j] =  new RuleThirtySegments(sampleGrid, begin, fraction, i);
					// Determine the range of ints for the next thread.
					begin += fraction;
				}
				// start our workers by calling start() method
				worker[j].start();
				while (worker[j].isAlive()) {
	                try {
	                    worker[j].join();
	                } catch (InterruptedException e) {
	                    System.err.println("thread interrupted: " + e.getMessage());
	                }
	            }
			}
			for(int k = 0,  l = 0; k < worker.length; k++) {
                for (int val: worker[k].getPresent()) {
                    sampleGrid[i+1][l] = val;
                    System.out.print(val);
                    l++;
                }
            }
            System.out.println();
		}
	}
}
