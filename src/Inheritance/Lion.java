package Inheritance;

public class Lion extends animal {
	
	private String food = "meats";
	 public static void main(String[] args) {
		 
		 //create a lion object 
		 Lion lion = new Lion();
		 
		 // call the predator method from the animal class on lion object
		 lion.Predator();
		 
		 System.out.println("*" + lion.Type + "*"+ " which means it eat: " + "*" +lion.food+ "*" + ". Also its class is :" +"*"+ lion.Class + "*" );
	 }
	
}
