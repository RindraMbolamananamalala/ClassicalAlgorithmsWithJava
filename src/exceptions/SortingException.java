package exceptions;

/**
 * 
 * @author Rindra Mbolamananamalala
 * The class dedicated to the implementation of the Exception, specific to the Sorting Algorithms proposed
 * within this Project.
 */
public class SortingException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1784365450662151679L;
	
	/**
	 * 
	 * @param array The array concerned by the Exception
	 * @param exceptionMessage The message to display as an additional information 
	 */
	public SortingException(int []array, String exceptionMessage){
		super(
			"Cannot continue with the Sorting process of the Array"
				+ "\"" 
				+ array.toString()
				+ "\"" + ".\n"
				+ exceptionMessage
		);
	}
}
