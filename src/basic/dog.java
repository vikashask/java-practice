package basic;

public class dog {
	   String breed;
	   int age;
	   String color;

	   void barking() {
		   System.out.println("Passed barking");
	   }

	   void hungry() {
		   System.out.println("Passed hungry");
	   }

	   void sleeping() {
		   System.out.println("Passed sleeping function");
	   }
	   public static void main(String []args) {
		      // Following statement would create an object myPuppy
		   dog dogObj = new dog();
		   dogObj.sleeping();
//		   hungry();
//		   System.out.println(dogObj.sleeping());
		   System.out.println("Passed sleeping");   
		   }
	   
	}