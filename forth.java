import java.util.Scanner;
class forth{
public static void main(String args[]){
int pola=1459;
int polb=1649;
String staa="up";
String stab="uk";
int ch;
Scanner obj=new Scanner(System.in);
System.out.println("to check the polution of up then click 1");
System.out.println("to check the polution of uk then click 2");
ch=obj.nextInt();
switch(ch)
{ 
case 1:
System.out.println("polution of up\t"+pola);
break;
case 2:
System.out.println("polution of uk\t"+polb);
break;
default:
System.out.println("you are not select 1 or 2");
}
}
}
