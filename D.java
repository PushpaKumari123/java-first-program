package myfirstproject;
class Abcd
{
			String name="Muskan Rai";
			String father_name="Santosh Rai";
			String mother_name="Anuradha Rai";
			}
 class B extends Abcd
			{
	 int adhar_no=8284636;
		String pan_no="dbhj5546856";
		  
			}
 class C{
			int mobile_no=8479894;   
			String father_name="Santosh Rai";
			String mother_name="Anuradha Rai";
			}
 class D extends C
			{
			public static void main(String args[])
			{
			Abcd obj=new Abcd();
			B obj1=new B();
			System.out.println("your name:"+obj.name);
			System.out.println("your father's name:"+obj.father_name);
			System.out.println("your mother's name:"+obj.mother_name);
			System.out.println("your adhar no :"+obj1.adhar_no);
			System.out.println("your pan no :"+obj1.pan_no);
			}
			

	}

