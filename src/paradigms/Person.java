package paradigms;

public class Person {
	//instance variable
	private String name;
	private String gender;
	
	//Constructor create an Object to class Person
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	//Getter and setter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	
	public static void main (String args []) {
		Person john =  new Person("John Jacobs","Male");
		Person donna =  new Person("Donna Duncan","Female");
		
		System.out.println(john.getName());
		System.out.println(john.getGender());
		System.out.println(donna.getName());
		donna.setName("Xhuljana");
		System.out.println(donna.getName());
		
	}

}


