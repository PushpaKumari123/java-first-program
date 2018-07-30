class A{
int c,d;
void ab(int a,int b)
{
c=a;
d=b;
}
void display()
{
System.out.println(""+c+"  "+d+"");
}
}
class B{
public static void main(String args[])
{
A obj=new A();
obj.ab(5,10);
obj.display();
}
}