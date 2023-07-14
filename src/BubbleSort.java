/**
 * 
 * @author Rindra Mbolamananamalala
 * The class dedicated to the Bubble Sort Algorithm implementation, a.k.a : the "Sinking Sort" algorithm.
 * "The bubbles are to me moved to the top of the water surface": 
 *  Here, a "Bubble" is considered as an element with a higher value, therefore, it should be put at the end of the 
 *  Collection.
 *  1) Iterating over the Array whose elements are to be sorted;  
 *  2) If a "Bubble" element is found, moving the latter to the "end" of the collection.
 */
public class BubbleSort {
	/**
	 * Sorting all the (integers) elements contained within an input array following an ascending order with the <b>Bubble Sort</b> 
	 * algorithm (Numerical-Ascending order)
	 * @param unsortedArray The (input) array whose elements are to be sorted
	 * @return A sorted version of the unsorted array provided as a parameter (as an input)
	 */
	public static int []sort(int []unsortedArray) {
		// Preparations of the result to return (the sorted array)
		int []result = unsortedArray;
		int dimension = unsortedArray.length;
		
		// The variable responsible for the determination of whether or not a permutation of element
		// has still occurred, initialized with the value FALSE
		boolean doesASwappingEventStillOccur = false;
		// A particular variable necessary for the permutation of elements
		int swappingEventTemporaryVar;
		// Iterating over the Array which elements are to be sorted, and moving the "Bubble" element up 
		// if one is found
		do {
			doesASwappingEventStillOccur = false;
			for(int i = 1; i != dimension; ++i) {
				if(result[i] < result[i - 1]) {
					// the actual permutation
					swappingEventTemporaryVar = result[i];
					result[i] = result[i - 1];
					result[i - 1] = swappingEventTemporaryVar;
					// so, a permutation has actually occurred...
					doesASwappingEventStillOccur = true;
				}
			}
		}while (doesASwappingEventStillOccur);
		return result;
	}
}
