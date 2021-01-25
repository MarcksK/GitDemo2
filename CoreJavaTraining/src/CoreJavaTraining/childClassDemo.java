package CoreJavaTraining;

public class childClassDemo extends parentClassdemo{
	
	public void audiosystem()
	{
		System.out.println("New Audio");
	}
	public void engine()
	{
		System.out.println("New Engine");
	}
	
	
	
	public void colour()
	{
		
		System.out.println(colour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClassDemo cd = new childClassDemo();
		cd.colour();
		cd.brakes();
		cd.audiosystem();

	}

}
