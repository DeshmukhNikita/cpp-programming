class college{
 String collname ="PVG";
 void lib()
 {
	 System.out.println(" Lib here:");
 }
 
}
 class Student1 extends college
{
	int id =2;
	 String name="Ajay";
	 
	 void lib( String libname){//method overloading
		 
	 System.out.println(" I am here in student library:"+libname);
 }
		 
}

 public class Test{
	 	
public static void main(String args[])
{
	 String libname = " PVGLib";
 Student1 std = new Student1();
 
	System.out.println(std.id);
	System.out.println(std.name);
	System.out.println(std.collname);
	std.lib();
	std.lib(libname);
 
}
}
