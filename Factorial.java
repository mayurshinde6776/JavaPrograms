//write a java program to find factorial of given number by user.

import java.util.Scanner;
public class Factorial
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to find factorial");
int num=sc.nextInt();
int fact=1;
for(int i=1;i<=num;i++)
{
  fact=fact*i;
}
System.out.println("Factorial of " +num +"is :" +fact);
}
}
//Thank you
  
