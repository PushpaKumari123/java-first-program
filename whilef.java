import java.util.Scanner;
class whilef{
public static void main(String args[])
{
int ch;
Scanner obj=new Scanner(System.in);
while(true)
{
System.out.println("enter your choice");
System.out.println("enter 1 or 2choice");
ch=obj.nextInt();
switch(ch)
{
case 1:
System.out.println("your name is kha");
break;
case 2:
System.out.println("ypur name is div");
break;
default:
System.out.println("enter right choice");
}
}
}
}