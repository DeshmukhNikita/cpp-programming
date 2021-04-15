
//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

public class Sample1{
	
	public static void main(String args[])
	{
		
		int even=0,odd=0;
		
			for(int i=1;i<=10;i++)
			
			{
				if(i%2==0)
				{
					even= even+i;
					System.out.println(" Even number:" +i);
				}
			else
				{			
					odd= odd+i;
					System.out.println(" Odd number:" +i);
			
				}
		
			}
			
			System.out.println(" Sum of the even and odd number is");
			System.out.println(" sum of even number:" +even);
			System.out.println(" sum of odd  number:" +odd);
	}
		
		

}
