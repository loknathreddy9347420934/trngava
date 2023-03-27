import java.util.Scanner;
class Day3Program01
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter two numbers");
int num1=sc.nextInt();
int num2=sc.nextInt();
System.out.print(num1+"/"+num2+"="+num1/num2);
System.out.print(num1+"%"+num2+"="+num1%num2);
}
}
