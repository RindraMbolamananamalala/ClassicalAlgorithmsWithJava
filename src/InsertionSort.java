import java.util.Iterator;

/**
 * 
 * @author Rindra Mbolamananamalala
 *
 */
public class InsertionSort {
	/**
	 * 
	 * Sort all the elements contained within an input array with the Insertion Sort algorithm 
	 * @param unsortedArray The (input)array the elements of which are to be sorted
	 * @return A sorted version of the unsorted array provided as a parameter (as an input)
	 */
	public static int []sort(int []unsortedArray) {
		int []result = unsortedArray;
		int arrayDimension = result.length;
		
		for(int i = 1; i != arrayDimension; ++ i) {
			int key = result[i];
			
			int j = i - 1;
			
			while (j >= 0 && key < result[j]) {
				result[j + 1] = result[j];
				j --;
			}
			result[j + 1] = key;
			
		}
		
		return result;
	}
	
	public static void main(String []args) {
		int []ex = new int[] {13, 11, 12, 7, 9, 23, 12};
		int []res = sort(ex);
		for (int i : res) {
			System.out.println(i);
		}
	}
}
