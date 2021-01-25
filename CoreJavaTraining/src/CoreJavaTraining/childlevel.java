package CoreJavaTraining;

//function overloading
//either argument count should be differnt or argument data type

public class childlevel extends childClassDemo{
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public void getData(int a, int b)
	{
		System.out.println(b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childlevel cl = new childlevel();
		cl.getData(2);
		cl.getData("Hello");
		cl.getData(5, 8);
				

	}

}
