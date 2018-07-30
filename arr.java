class abc{
int a,b;
abc(int a,int b)
{
a=a;
b=b;
System.out.println(""+a+""+b+"");
}
}
class arr{
public static void main(String args[])
{
abc[] a;
a=new abc[5];
a[0]=new abc(5,6);
a[1]=new abc(10,8);
}
}