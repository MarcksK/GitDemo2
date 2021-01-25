package demopack;

public class nestedloopsone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nested loops works- 
		
		int k=1;
		for(int i=0; i<4; i++) //(outer for loop) this loop will loop 4 times 
		{
			//System.out.println("outer loop started");
			for (int j=1; j<=4-i; j++) //inner loop 
			{
				System.out.print(k);
				System.out.print("\t"); // creating a space 
				k++;
			}
			
			System.out.println("");
		}
		

	}

}

/* 1 2 3 4
  5 6 7
  8 9 
  10 */
