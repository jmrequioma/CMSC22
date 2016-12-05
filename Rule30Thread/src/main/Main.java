package main;

public class Main {
	public static void main(String args[]) {
		long startTime;
		long endTime;
		int gridSize = 1000;
		
		System.out.println("------------------------");
		System.out.println("Threaded");
		startTime = System.currentTimeMillis();
		RuleThirtyYesThread r = new RuleThirtyYesThread(gridSize);
		r.printer();
		endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time for Threaded Solution: " + (endTime - startTime) + " ms");

		System.out.println();

		System.out.println("------------------------");
		System.out.println("Non-Threaded");
		startTime = System.currentTimeMillis();
		RuleThirtyNoThread s = new RuleThirtyNoThread(gridSize);
		s.printer();
		endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time for Non-Threaded Solution: " + (endTime - startTime) + " ms");

	}
}