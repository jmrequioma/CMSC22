package main;

public class RuleThirtySegments extends Thread{
	private int begin;
	private int end;
	private int[] ancestor;
	private int[] present;
	private int spawn;
	
	public RuleThirtySegments(int[][] sampleGrid, int begin, int end, int spawn) {
		ancestor = new int[sampleGrid.length];
		//copy
		for (int i = 0; i < sampleGrid.length; i++) {
			ancestor[i] = sampleGrid[spawn][i];
		}
		this.begin = begin;
		this.end = end;
		this.spawn = spawn;
		
		this.present = new int[end];
				
	}
	
	/**
	 * Used to populate the given 2D array
	 * 
	 */
	
	public void populate() {
		for(int i = 0; i < end; i++){
			int left = (i + begin == 0)?0:ancestor[i + begin - 1];
			int middle = ancestor[i + begin];
			int right = (i + begin == ancestor.length - 1)?0:ancestor[i + begin + 1];
			if (left == 1 && middle == 1 && right == 1 || left == 1 && middle == 1 && right == 0 || left == 1 && middle == 0 && right == 1 || left == 0 && middle == 0 && right == 0) {
				present[i] = 0;
			} else {
				present[i] = 1;
			}
		}
	}
	
	public void run() {
		populate();
	}
	
	public int[] getPresent() {
		return present;
	}
}
