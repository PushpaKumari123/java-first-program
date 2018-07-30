class thismkey
{
int a,b;
void A(int a,int b)
{
this.a=a;
this.b=b;
System.out.println(""+a+" \n"+b+"");
}
public static void main(String args[])
{
thismkey obj=new thismkey();
obj.A(0,1);
}
}
