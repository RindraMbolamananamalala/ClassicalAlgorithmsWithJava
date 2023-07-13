/**
 * 
 * @author Rindra Mbolamananamalala
 * a.k.a : "Sinking Sort" algorithm 
 */

public class BubbleSort {
	public static int []sort(int []unsortedArray) {
		// Preparations of the result to return (the sorted array)
		int []result = unsortedArray;
		int dimension = unsortedArray.length;
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
