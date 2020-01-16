/**
 * Generate the co-primes from (1,1) to (m,n)
 * 
 * Hannah Freudenberger
 *
 */
public class CoPrimes {

	
//greatest common divsor 	

		
//set up for loops using row and col	
	public static void grid(int num1, int num2) {
		for(int row = num1; row >= 1; row--)
		{
			for(int col = 1; col <= num2; col++)
			{
				if(gcd(row, col) == 1)
				{
				System.out.print("*");
				
				}else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	public static int gcd(int num1, int num2)
	{
		while(num1 != num2)
		{
			if(num1 > num2)
				{
					num1 = num1 - num2;
				}
			else
				{
					num2 = num2 - num1;
				}
		}
		return num1;
	}
	
	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Must be passed two integer values > 0");
			
			System.exit(0);
		}
		
		 int num1 = Integer.parseInt(args[0]);
		 int num2 = Integer.parseInt(args[1]);
		
	
		grid(num1, num2);
		
		/**
		 * Provide the necessary logic to generate the co-prime 
		 * pairs from (1,1) to (m,n).
		 * 
		 * This will likely involve additional method(s)
		 */
	}


}

