class A{
int c1,c2,c3,c4;
int a=10;
int b=5;
void add()
{
c1=a+b;
}
void sub()
{
c2=a-b;
}
void mul()
{
c3=a*b;
}
void div()
{
c4=a/b;
}
void display()
{
System.out.println(" Addition of a and b:"+c1);
System.out.println(" Sub. of a and b:"+c2);
System.out.println(" Mul. of a and b:"+c3);
System.out.println(" Dev. of a and b:"+c4);
}
}
class calculator{
public static void main(String args[])
{
A obj=new A();
obj.add();
obj.sub();
obj.mul();
obj.div();
obj.display();
}
}