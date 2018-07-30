class fibonacci
{
public static void main(String args[])
{
int a=10,t1=0,t2=1;
System.out.println("first"+a"term");
for(int i=1;i<=a;++i)
{
System.out.print(t1+"\t,");
int sum=t1+t2;
t1=t2;
t2=sum;
}
}
}