package abstraction;

public class SumNumber {
	public static void main (String args[]) {
		System.out.println("Sum is: "+getRangeSum(40,60));
	}


	/**
	 * Computes and returns the sum of all integers between two integers specified by lowerLimit
	 * and upperLimit parameters.
	 * @param lowerLimit The lowerLimit of the integer range
	 * @param upperLimit The upperLimit of the integer range
	 * @return The sum of all integers between lowerLimit and upperLimit range
	 */
	
/*	private static int getRangeSum(int lowerLimit, int upperLimit) {
		int sum = 0;
		int counter = lowerLimit;
		while(counter<=upperLimit) {
			sum +=counter;
			counter++;
		}

		return sum;
	}*/
	
	private static int getRangeSum(int lowerLimit, int upperLimit) {
		int sum = 0;
		int n = upperLimit - lowerLimit + 1;
		sum = n* (2*lowerLimit + (n-1))/2;
		return sum;
	}
	

}
