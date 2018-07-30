abstract class abst{
abstract void abc();
}
class ract extends abst{
void abc(){
System.out.println("Hello Muskan!");
}
public static void main(String args[])
{
abst obj=new ract();
obj.abc();
}
}
 