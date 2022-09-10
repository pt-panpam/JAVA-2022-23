import java.lang.*;
import java.util.Scanner;
class Factorial
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter number to find factorial");
int num=sc.nextInt();
int i=1,f=1;
while(i<=num)
{
f=f*i;
i++;
}
System.out.println("Factorial="+f);
}
}
