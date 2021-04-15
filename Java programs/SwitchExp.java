//1. Swtich simple example

/*public class SwitchExp{
	
	public static void main(String args[])
	
	{
		int num=5;
		
		switch(num){
			case 1: System.out.println("hi");
			break;
			case 2: System.out.println("hi");
			break;
			case 3: System.out.println("hi");
			break;
			default:
			System.out.println("All are Wrong");
			break;
		}	
	
	}

}*/

//2. where we are printing month name for the given number  

/*public class SwitchExp{
	
	public static void main(String args[])
	
	{
		int month=1;
		String months="";
		switch(month){
			case 1: months= "jan";
			break;
			case 2: System.out.println("Feb");
			break;
			case 3: System.out.println("March");
			break;
			case 4: System.out.println("April");
			break;
			case 5: System.out.println("May");
			break;
			case 6: System.out.println("june");
			break;
			case 7: System.out.println("July");
			break;
			case 8: System.out.println("Aug");
			break;
			case 9: System.out.println("Sep");
			break;
			case 10: System.out.println("Oct");
			break;
			case 11: System.out.println("Nov");
			break;
			case 12: System.out.println("Dec");
			break;
			default:
			System.out.println("All are Wrong");
			break;
		}	
		
		System.out.println(months);
	
	}

}*/

//Program to check Vowel or Consonant:
//If the character is A, E, I, O, or U, it is vowel otherwise consonant. It is not case-sensitive.


/*public class SwitchExp{
	
	public static void main(String args[])
	
	{
		char c='A';
		switch(c)
		{
		case 'A': System.out.println("vowel");
			
		case 'E': System.out.println("vowel");
	
		case 'I': System.out.println("vowel");
			break;
		case 'O': System.out.println("vowel");
			break;
		case 'U': System.out.println("vowel");
			break;
		case 'a': System.out.println("vowel");
			break;
		case 'e': System.out.println("vowel");
			break;
		case 'i': System.out.println("vowel");
			break;
		case 'o': System.out.println("vowel");
			break;
		case 'u': System.out.println("vowel");
			break;
			
			default: System.out.println(" Constant");
		}
		
	}
}*/

//Java Program to demonstrate the use of Java Switch  
//statement with String  
	

/*public class SwitchExp{
	
	public static void main(String args[])
	
	{
		String txt="Hello";
		
		int level=0;
		
		switch(txt){
			
			case "txt": level=1;
			break;
			case"Hello":level=2;
			break;
		}
		System.out.println(" level is:"+level);
	}
}*/

//Java Nested Switch Statement 

/*public class SwitchExp{
	
	public static void main(String args[])
	{

	 char txt='c';
	 int a=4;
	 
	 switch(a){
		 
		 case 1: System.out.println("math");
		 break;
		  
		case 2:
		switch(txt)
		 {
			case 'c':System.out.println("math");
		 break;
		 case'b': System.out.println("math");
		 break;
		 }
		 
		 case 4:
		 switch(txt)
		 {
		case 'c':System.out.println("math........");
		 break;
		 case'b': System.out.println("math");
		 break;
		 }
	 }
	}			
}*/
//Java Program to demonstrate the use of Enum  
//in switch statement  
public class SwitchExp{
public enum Day{s,m,t,w,th,f,sa}

public static void main(String args[])
{
	 Day[] DayNow = Day.values();    
           for (Day Now : DayNow)    
           {    
                switch (Now)    
				{
		case s: System.out.println("sun");
	
		case m: System.out.println("mon");
			break;
		case t: System.out.println("tue");	
		break;
		case w: System.out.println("wensday");	
		break;
		case th: System.out.println("thursday");
		break;
		case f: System.out.println("friday");	
		break;
		case sa: System.out.println("satt");	
		break;
	}		
	}
}
}	








































