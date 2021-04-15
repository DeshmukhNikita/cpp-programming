//Print StarPattern
/*i)
**********
**********
**********
**********
ii)
*
**
***
****
***** 
iii)
        *
       **
      ***
     ****
    *****
	*/

public class StarPattern{
	
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
			
		{ 
			for(int j=1;j<=10;j++)
				
			{
				System.out.print("*");
			}
			System.out.println("");
		
		}	

		System.out.println(" 2nd pattern");
		for(int x=1;x<=5;x++)
			
		{ 
			for(int y=1;y<=x;y++)
				
			{
				System.out.print("*");
			}
			System.out.println("");
		
		}

	}
		
}






	
	
	
	