package practiceproblems;

class Robot {
   public void speak(String text) {
	   System.out.println(text);
   }
   
   public void move(String stateName, int zipcode) {
	   System.out.println("the Place i am moving to is: " + stateName + " and its zipcode: " + zipcode + ".");
   }
}

public class MethodParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robo1 = new Robot();
		
		//passing parameters through this method and comes out (prints out) from String text. 
		robo1.speak("Hi my name is Annet John, i am learning Java.");
		robo1.move("Florida", 32258);
		
		//another way - the 'introduction' variable acts like a label and refers to the String text.
		String introduction = "Hello there!";
		robo1.speak(introduction);
		
	
		
	}

}
