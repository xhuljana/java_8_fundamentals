package paradigms;

public class procedural_paradigm {
	public static void main (String args[]) {
		System.out.println("Sum is: "+addTen(15));
	}

	private static int addTen(int num) {
		int counter = 0;
		while (counter<10) {
			num++;
			counter++;
			
		}
		return num;
	}

}

