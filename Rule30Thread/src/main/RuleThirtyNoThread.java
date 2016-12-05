package main;

import java.util.Scanner;

public class RuleThirtyNoThread {
	private int[][] sampleGrid;
	private int arrSize;
	
	public RuleThirtyNoThread(int arrSize) {
		sampleGrid = new int[arrSize][arrSize];
		this.arrSize = arrSize;
	}
	
	/**
	 * Used to make the first generation of the cellular automata
	 * 
	 */
	public void makeFirstGen() {
		for (int i = 0; i < arrSize; i++){
  			sampleGrid[0][i] = 0;
  		}
  		sampleGrid[0][arrSize / 2] = 1;   // start at middle
	}
	

	/**
	 * Used to populate the given 2D array
	 * 
	 */
	public void populate() {  		
  		//int left, middle, right;
		for(int i = 1; i < arrSize; i++){
			for(int j = 0; j < arrSize; j++){
				int left = (j == 0)?0:sampleGrid[i - 1][j - 1];
  				int middle = sampleGrid[i - 1][j];
  				int right = (j == arrSize - 1)?0:sampleGrid[i - 1][j + 1];
				if (left == 1 && middle == 1 && right == 1 || left == 1 && middle == 1 && right == 0 || left == 1 && middle == 0 && right == 1 || left == 0 && middle == 0 && right == 0) {
					sampleGrid[i][j] = 0;
				} else {
					sampleGrid[i][j] = 1;
				}
			}
		}
		//return givenArr;
	}
	
	

	/**
	 * Used to print the final 2D array
	 * 
	 */
	public void printer() {
		makeFirstGen();
		populate();
		for(int i = 0; i < arrSize; i++){
  			for(int j = 0; j < arrSize; j++){
  				System.out.print(sampleGrid[i][j]);
  			}
  			System.out.println();
  		}
	}
}

