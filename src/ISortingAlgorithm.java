/**
 * 
 * @author Rindra Mbolamananamalala
 * The Interface describing all the functions that an implementation of a Sorting Algorithm must have.
 *
 */
public interface ISortingAlgorithm {
	/**
	 * 
	 * Sorting all the (integers) elements contained within an input array following an ascending order (Numerical-Ascending order)
	 * @param unsortedArray The (input) array whose elements are to be sorted
	 * @return A sorted version of the unsorted array provided as a parameter (as an input)
	 */
	abstract int []sort(int []unsortedArray);
}
