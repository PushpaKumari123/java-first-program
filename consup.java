class sup{
String name;
void sup(String name)
{
this.name=name;
System.out.println(""+name);
}
}
class consup extends sup{
String name;
void sup(String name)
{
this.name=name;
System.out.println(""+name);
}
void display()
{
sup("Muskan");
super.sup("Santosh");
}
public static void main(String args[])
{
consup obj=new consup();
obj.display();
}
}