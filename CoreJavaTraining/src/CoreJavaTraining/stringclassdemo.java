package CoreJavaTraining;

public class stringclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//in Java a string is a class 
		//two ways of defining a string 
		/*1. String literal 
		2.By creating objects of string*/
		
		String a = "javatraining";
		//Sring b = "hello";
		//String ab =  new String("hello"); //with a string class
		//String b = new String("hello");
		System.out.println(a.charAt(2));
		
		System.out.println(a.indexOf("e"));
		
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(	a.concat("rahul teaches"));

	} 

}
