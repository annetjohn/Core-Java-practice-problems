package practiceproblems;

class Frog{
	private String name; 
	private int age; 
	
	public void setName(String name) {
		//this keyword is referring to the instance variables which now private 
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//while using the 'get' - its a method called - get method. 
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

public class SetterThis {
	
	public static void main(String[] args) {
		// program to learn setter and this keyword. 
		
		Frog frog1 = new Frog();
		
		// this is setting variables for an instance variable. 
//		frog1.age = 27;
//		frog1.name = "Anney";
//		
		frog1.setName("Anney"); // you cant use this statement with a setter. 
		frog1.setAge(26);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		

	}

}
