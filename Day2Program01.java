import java.util.Scanner;
class Day2Program01
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();//5
int i;//variable declaration
i=0;//initialization
while(i<=10)
{
System.out.println(num1+"*"+i+"="+num1*i);
i=i+1;
}//while loop
}
}