import java.util.Scanner;
class start
{
	// input and output operations of character
public static void main(String[] args)
{  //only one character
char ch;
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your character");
ch=sc.next().charAt(0);
System.out.println("your character is " +ch);
}
}