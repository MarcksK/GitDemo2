package CoreJavaTraining;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int a = 4;*/
		//if I want to store multiples values in a single container we use Arrays 
		
		int a[] = new int[5]; // declares and array and allocates memory
		a[0]=2;
		a[1]=5;
		a[2]=1;
		a[3]=9;
		a[4]=12; //initialized values into that array
		
		int b[] = {5,6,8,9,4,3,4}; // declare an array with a single step
		
		for (int i=0; i<b.length; i++)
		{
			
			System.out.println(b[i]); // retrieve values present in that array
		}
		
		
		
		
		

	}

}
