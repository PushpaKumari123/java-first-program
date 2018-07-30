class A{
String name="Muskan Rai";
String father_name="Santosh Rai";
String mother_name="Anuradha Rai";
}
class inherifull extends A
{
int adhar_no=8284636;
String pan_no="dbhj5546856";
public static void main(String args[])
{
inherifull obj=new inherifull();
System.out.println("your name:"+obj.name);
System.out.println("your father's name:"+obj.father_name);
System.out.println("your mother's name:"+obj.mother_name);
System.out.println("your adhar no :"+obj.adhar_no);
System.out.println("your pan no :"+obj.pan_no);
}
}