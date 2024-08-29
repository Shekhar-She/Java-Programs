//input for user//
import java.util.Scanner;
class userarray
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int num[]=new int [5];
System.out.println("Enter the Array Elements:::");
for (int i=0;i<5;i++)
{
num[i]=obj.nextInt();
}
System.out.println("You Entered::");
for(int i=0;i<5;i++)
{
System.out.println("Enter Elements"+num[i]);
}
}
}