class bike{
public static class van{
void ru()
{
System.out.println("van is running");
}
}
}
public class run{
public static void main(String args[])
{
bike.van obj=new bike.van();
obj.ru();
}
}