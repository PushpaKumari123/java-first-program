class incpara
{
void A(int a)
{
System.out.println(a);
}
void A(double a,double b)
{
System.out.println(a+b);
}
void A(int a,double b,int c)
{
System.out.println(a+b+c);
}
public static void main(String args[])
{
incpara obj=new incpara();
obj.A(5);
obj.A(5,10);
obj.A(5,5,10);
}
}