package CoreJavaTraining;

public class FirstClass {
	//Methods
	
	public String getData()
	{
		System.out.println("I am in Method");
		return "Helllo";
		
	}
	
	//Object are instances/ references of a class 
	
	static int a = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstClass fn = new FirstClass();
		fn.getData();
		
		secondclass sn =new secondclass();
		sn.setData();
		
		System.out.println(a);
		System.out.println("hi");
		System.out.println("Hello World");

	}

}
