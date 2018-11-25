package paradigms;

public class functional_paradigm {
	public static void main (String args[]) {
		System.out.println("Sum is: "+add(15,10));
	}

	private static int add(int num, int counter) {
		if (counter == 0) {
			return num;
		} 
		else {
			return 1+ add(num,counter-1);
		}
	}

}

