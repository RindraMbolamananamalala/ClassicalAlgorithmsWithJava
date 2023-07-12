
/**
 * 
 * @author Rindra Mbolamananamalala
 * The class dedicated to the Insertion Sort Algorithm implementation: 
 * 1) Iterating over the Array whose elements are to be sorted.
 * 2) Comparing the current element (Key) to its predecessors:
 * 		- If the Key is lower than its Predecessor, compare it to the predecessor' s predecessors;
 * 		- Move greater elements one position up to make space for the swapped element. 
 */
public class InsertionSort {
	/**
	 * 
	 * Sorting all the (integers) elements contained within an input array following an ascending order with the <b>Insertion Sort</b> 
	 * algorithm (Numerical-Ascending order)
	 * @param unsortedArray The (input) array whose elements are to be sorted
	 * @return A sorted version of the unsorted array provided as a parameter (as an input)
	 */
	public static int []sort(int []unsortedArray) {
		// Preparations of the result to return (the sorted array)
		int []result = unsortedArray;
		int arrayDimension = result.length;
		
		// Iterating over the Array..
		for(int i = 1; i != arrayDimension; ++ i) {
			// The current Key
			int key = result[i];
			
			// Iterating over the Predecessors, and proceeding to the permutation of elements if needed...
			int j = i - 1;
			while (j >= 0 && key < result[j]) {
				result[j + 1] = result[j];
				j --;
			}
			result[j + 1] = key;			
		}
		
		// the array is now sorted
		return result;
	}
}
