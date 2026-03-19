package tests;


import algorithms.ISortingAlgorithm;
import exceptions.SortingException;
import algorithms.BubbleSort;


/**
 * @author Rindra Mbolamananamalala
 * The class dedicated to the testing (V&V) of any Sorting Algorithm-based model
 */
public class SortingAlgorithmTestsClass {
	public static void main(String []args) {
		
		int []arrayToSort = {5, 2, 9, 1, 5, 6}; 
		
		ISortingAlgorithm algorithmBasedModel;
		
		// Testing here a specific sorting algorithm
		algorithmBasedModel = new BubbleSort();
		
		try {
			int []sortedArray = algorithmBasedModel.sort(arrayToSort);
			for (int i : sortedArray) {
				System.out.print(i + " ");
			}
		} catch (SortingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
