class arrmul{
 public static void main(String args[])
{
int[] arr3=new int[10];
int[] arr1={3,5,6,8,9};
int[] arr2={2,3,8,9,6};
for(int i=0;i<5;i++)
     {
       arr3[i]=arr1[i]*arr2[i];
       System.out.println(""+arr3[i]+"");
      }
  }
}