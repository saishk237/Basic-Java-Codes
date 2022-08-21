import java.util.Scanner;
public class Swap
{
	public static void swap(int n1, int n2)
	{
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After Swapping....");
		System.out.println("Num1: "+n1);
		System.out.println("Num2: "+n2);	
	}
	public static void main(String args[])
	{
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num1: ");
		num1=sc.nextInt();
		System.out.print("Enter Num2: ");
		num2=sc.nextInt();
		System.out.println("Before Swapping....");
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		swap(num1,num2);
	}
}

/*
OUTPUT:
C:\Users\saishk237\Desktop>java Swap
Enter Num1: 25
Enter Num2: 50
Before Swapping....
Num1: 25
Num2: 50
After Swapping....
Num1: 50
Num2: 25
*/
