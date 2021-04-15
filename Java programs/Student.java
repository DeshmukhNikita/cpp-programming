
class College{

static String collname ="PVG";// static variable
static  String add ="pune";


static void lib(){// static method
	System.out.println(" lib here:");
	

}
}




public class Student extends College{

public static void main(String args[])

{
	String name =" Ajay";
	int roll_no =3;
  System.out.println(name);
  System.out.println(roll_no);
  //College c= new College(); //if it is not declare static we hv to create obj
  //System.out.println(c.collname);
    System.out.println(collname);
  System.out.println(add);
  
 lib();
  


}
}