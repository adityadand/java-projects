import java.util.Scanner;
class addval
{
	// adding 2 no with input
public static void main(String[] args)
{   
	System.out.println("addition of 2 programm in java");
	int no1,no2,sum;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first no");
	no1=sc.nextInt();
	System.out.println("enter the second no");
	no2=sc.nextInt();
	sum=no1+no2;
	System.out.println("the outpuut is"+sum);
}
}