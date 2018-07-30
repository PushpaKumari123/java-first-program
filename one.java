class finlone{
String name;
final void next()
{
System.out.println(name);
}
}
class one extends finlone{
void display()
{
System.out.println("Hello Muskan!");
}
public static void main(String args[])
{
one obj=new one();
obj.display();
}
}