import exceptions.SortingException;

/**
 * 
 * @author Rindra Mbolamananamalala
 * The class dedicated to the Exchange Sort Algorithm implementation: 
 * 1) Compare the first element with all the above elements and make a swap when it is needed;
 * 2) Compare the second element with all the above elements and make a swap when it is needed;
 * ...
 * n-1) Compare the (n-1)<sup>-th</sup> element with the above element and make a swap if it is needed.
 */
public class ExchangeSort implements ISortingAlgorithm{	
	/**
	 * 
	 * Sorting all the (integers) elements contained within an input array following an ascending order with the <b>Exchange Sort</b> 
	 * algorithm (Numerical-Ascending order)
	 * @param unsortedArray The (input) array whose elements are to be sorted
	 * @return A sorted version of the unsorted array provided as a parameter (as an input)
	 * @throws When an Exception event happens when using the current Sorting Algorithm, 
	 * we let the dedicated class handle it 
	 */
	@Override
	public int[] sort(int[] unsortedArray) throws SortingException {
		try {
			// Preparations of the result to return (the sorted array)
			int []result = unsortedArray;
			int arrayDimension = result.length;
			// A particular variable necessary for the permutation of elements
			int swappingEventTemporaryVar;
						
			for(int i = 0; i != arrayDimension - 1; ++ i) {
				for(int j = i + 1; j != arrayDimension; ++ j) {
					if(result[i] > result[j]) {
						swappingEventTemporaryVar = result[i];
						result[i] = result[j];
						result[j] = swappingEventTemporaryVar;
					}
				}
			}
			return result;
		}catch (Exception ex) {
			// We let the dedicated class in charge of any Exception event
			throw new SortingException(unsortedArray, ex.getMessage());
		}
	}
	
	public static void main(String []args){
		int []arrayTest = new int[] {45, 10, 2, 3, 344, 1};
		try {
			int []test = new ExchangeSort().sort(arrayTest);
			for(int i:test) {
				System.out.println(i);
			}
		} catch (SortingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
