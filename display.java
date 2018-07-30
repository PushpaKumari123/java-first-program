class mathex{
void que()
{
int a=10;
int b=11;
class ret{
int remainder()
{
return a%b;
}
int quotient()
{
return a/b;
}
int multiply()
{
return a*b;
}
}
ret obj=new ret();
System.out.println(""+obj.remainder());
System.out.println(""+obj.quotient());
System.out.println(""+obj.multiply());
}
}
class display{
public static void main(String args[])
{
mathex obj1=new mathex();
obj1.que();
}
}