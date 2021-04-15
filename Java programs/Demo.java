
//1. A year is leap, if it is divisible by 4 and 400. But, not by 100.
/*public class Demo
{
    public static void main(String[] args)  
    {  
		int year=2020;
		
		  if(((year%4==0)&&(year%100!=0))||(year%400==0)){ 
			
			System.out.print(" year is leap");
		
		  }
		  else{
			  			System.out.print(" not leap year ");
		  }
    }  
}  */


//2. It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.  
/*public class Demo
{
    public static void main(String[] args)  
    {
      int mark=49;
	  
	  if(mark>=80 && mark<100)
	  {
		  System.out.println(" He got +A");
	  }
	   else if(mark>=75 && mark<80)
	  {
		  System.out.println(" He got A");
	  }
	   else if(mark>=65 && mark<70)
	  {
		  System.out.println(" He got B");
	  }
	  else if(mark>=50 && mark<65)
	  {
		  System.out.println(" He got c");
	  }
	  else if(mark>=45 && mark<50)
	  {
		  System.out.println(" He got d");
	  }
	  else
	  {
		  System.out.println(" failed:");
	  }
	}
}*/


//3. Program to check POSITIVE, NEGATIVE or ZERO:

/*public class Demo{
	
	public static void main(String args[])
	{
		int num = -0;
		if(num>0)
		{
			System.out.println("Num is Positive");
		}
	  else if(num<0){

			System.out.println("Num is Negative");
		}
		else
		{
			System.out.println("Num is zero");
		}			
}

}*/
//4. Java Program to demonstrate the use of Nested If Statement.    
public class Demo{
	
	public static void main(String args[])
	{
		int age=25;    
		int weight=48;    
		
		
		if(age>=200)
		{
			if(weight >90)
			{
				System.out.println(" weight is greater than 90:");
			}
		 else
			 {
				System.out.println(" weight is less than 90:");
			}
		}
		
		else
			{
				System.out.println(" age is greate than 22");
			}
					
			
	}
}



	