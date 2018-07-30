import java.util.Scanner;
class salary{
public static void main(String args[])
{
int salary;
Scanner obj=new Scanner(System.in);
System.out.println("enter your salary");
salary=obj.nextInt();
if(salary>=14000)
{
System.out.println("you are saes manager in rdr infoech");
}
else if(salary>=1000&& salary<14000)
{System.out.println("you are tl in rdr infotech");
}
else if(salary<10000)
{System.out.println("you are sales execution in rdr infotech");
}
else
{
System.out.println("you are not employyee in rdr infotech");
}
}
}