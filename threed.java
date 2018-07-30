class threed
{
public static void main(String args[])
{
int[][][] arr={{{1,2,3},{4,5,6},{5,6,7}},{{5,6,7},{2,8,9},{2,3,5}}};
for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
for(int k=0;k<3;k++)
{
arr[i][j][k]=i+j+k;
System.out.print(" "+arr[i][j][k]);
}
System.out.println(" ");
}
System.out.println(" ");
}
}
}