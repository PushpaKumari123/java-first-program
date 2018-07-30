class ret{
int add(int a,int b)
{
return(a+b);
}
String Name(String name)
{
return name;
}
}
class returntest{
public static void main(String args[])
{
ret obj=new ret();
System.out.println(""+obj.add(5,20));
System.out.println(""+obj.Name("Muskan"));
}
}