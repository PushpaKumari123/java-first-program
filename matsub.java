class matsub{
public static void main(String args[]){
int[][] arr1={{3,2,1},{6,5,4},{9,8,7}};
int[][] arr2={{3,2,1},{6,5,4},{9,8,7}};
int[][] arr3=new int[10][10];
System.out.println("First matrix");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print("    "+arr1[i][j]);
}
System.out.println();
}
System.out.println("Second matrix");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print("    "+arr2[i][j]);
}
System.out.println();
}
System.out.println("subtraction of matrix");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
for(int k=0;k<3;k++)
{
arr3[i][j]=arr1[i][j]-arr2[i][j];
}

}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print("   "+arr3[i][j]);
}
System.out.println();
}
}
}