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
 
 class Staff extends Student1{
	 
	 String staffname =" Priya";
	 String Subname = "math";
	 void lib( String libname, int id){
		 System.out.println(" I am here in student library:"+libname + id);
	 }
		 
		 
}

 public class Test2{
	 	
public static void main(String args[])
{
	 String libname = " PVGLib";
 //Student1 std = new Student1();
  Staff std = new Staff();

System.out.println(std.id);
	System.out.println(std.name);
	System.out.println(std.collname);
	System.out.println(std.staffname);
	System.out.println(std.Subname);
	std.lib();
	std.lib(libname);
	std.lib("abc",8);
 
}
}
