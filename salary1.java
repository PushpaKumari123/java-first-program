interface ary
{
void farmer();
void partunemployment();
void unemployment();
}
import java.util.Scanner;
class salary implements ary{
int sal;
Scanner obj=new Scanner(System.in);
System.out.println("Enter your salary per year:");
sal=obj.nextInt();
if(sal=50000)
{
void farmer()
{
System.out.println("you are farmer ");
}
}
else if(sal=>10000 && sal<=50000)
{
void partunemployment()
{
System.out.println("you are partially unemployment");
}
}
else{
void unemployment()
{
System.out.println("you are unemployment");
}
}
public static void main(String args[])
{
salary obj=new salary();
obj.farmer();
obj1.partunemployment();
obj2.unemployment();
}
}