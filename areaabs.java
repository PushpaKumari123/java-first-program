abstract class area{
abstract void circle();
abstract void rectangle();
abstract void square();
}
class areaabs extends area{
int c;
double n;
double m=3.14;
int a=5;
int b=6;
void circle(){
n=m*a*a;
System.out.println(""+n);
}
void rectangle(){
c=a*b;
System.out.println(""+c);
}
void square(){
c=a*a;
System.out.println(""+c);
}
public static void main(String args[])
{
area obj=new areaabs();
obj.circle();
obj.rectangle();
obj.square();
}
}
 