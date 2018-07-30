class sup{
int a=1000;
}
class er extends sup{
int a=100;
void display()
{
System.out.println(""+a);
System.out.println(""+super.a);
}
public static void main(String args[])
{
er obj=new er();
obj.display();
}
}