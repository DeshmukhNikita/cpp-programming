public class Calculator{

public static void main(String args[])
{

	int a=10,b=5;
	
	System.out.println("Addition is:" +(a+b));
	System.out.println("Addition is:" +(a-b));
	System.out.println("Addition is:" +(a*b));
	System.out.println("Addition is:" +(a/b));
	System.out.println("Addition is:" +(a%b));
	System.out.println("Addition is:" +(a>b));
	System.out.println("Addition is:" +(a<b));
	
	
	System.out.println("...........For Loop.........");
	
	int x=2;
	for(int i=1;i<=10;i++)
	{
		System.out.println(+x+"+"+i+ "=" +(x+i));
		
	}
	
	
	System.out.println("...........While Loop.........");
	
	int z=1;
	while(z<=10){
		
	System.out.println(+z);
	z++;
	}

	System.out.println("...........Switch case.........");
	
	int no=2;
	switch(1){
		
		case 1:
			System.out.println("...........While Loop.........");
			break;
			
		case 2:
		System.out.println("...........While Loop.........");
			break;
	}




}
}

