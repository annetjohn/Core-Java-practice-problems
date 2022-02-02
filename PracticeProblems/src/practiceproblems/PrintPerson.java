package practiceproblems;


class Person{
	String name; 
	int age; 
	
	void speak() {
		System.out.println("Hi my name " + name + " and my age is: " + age);
	}
	
	int calulateYearsToRetirement() {
		int yearsLeft = 65 - age; 
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	String getName()
	{
		return name; 
	}
	
}
public class PrintPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person person1 = new Person();
       
       person1.name = "Annet";
       person1.age = 26;
       
       person1.speak();
       
       int years = person1.calulateYearsToRetirement();
       
       System.out.println("Years till retiremets " + years);
       
       int age = person1.getAge();
       String name = person1.getName();
      
       System.out.println("Name is " + name);
       System.out.println("Age is " + age);
       
       
	}

}
