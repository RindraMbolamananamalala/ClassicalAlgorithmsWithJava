/**
 * 
 * @author Rindra Mbolamananamalala
 * The class dedicated to the Bubble Sort Algorithm implementation, a.k.a : the "Sinking Sort" algorithm.
 * "The bubbles are to me moved to the top of the water surface": 
 *  Here, a "Bubble" is considered as an element with a higher value, therefore, it should be put at the end of the 
 *  Collection.
 *  1) Iterating over the Array whose elements are to be sorted.  
 */

public class BubbleSort {
	public static int []sort(int []unsortedArray) {
		// Preparations of the result to return (the sorted array)
		int []result = unsortedArray;
		int dimension = unsortedArray.length;
		
		// The variable responsible for the determination of whether or not a permutation of element
		// has still occurred
		int swappingEventTemporaryVar;
		boolean doesASwappingEventStillOccur = false;
		do {
			doesASwappingEventStillOccur = false;
			for(int i = 1; i != dimension; ++i) {
				if(result[i] < result[i - 1]) {
					swappingEventTemporaryVar = result[i];
					result[i] = result[i - 1];
					result[i - 1] = swappingEventTemporaryVar;
					doesASwappingEventStillOccur = true;
				}
			}
		}while (doesASwappingEventStillOccur);
		return result;
	}
	
	public static void main(String []args) {
		int []testArray = new int[] {11, 1, 3, 2, 20, 25};
		int []sortedArray = sort(testArray);
		for(int i:sortedArray) {
			System.out.println(i);
		}
	}
}
