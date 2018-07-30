class arrcp{
public static void main(String args[])
{
char[] a={'h','g','n','b'};
char[] b=new char[5];
String r=new String(a);
System.arraycopy(a,0,b,0,4);
for(int i=0;i<a.length;i++)
{
System.out.println(""+b[i]+"");
}
System.out.println(""+r+"");
}
}
