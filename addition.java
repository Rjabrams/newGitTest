// addition algorithm in java
// tester file for github



import java.util.Scanner;

public class Addition{
		
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int firstNumber = 0;, secondNumber = 0;
	int sum;

	System.out.println("Enter First Number:");
	firstNumber = input.nextInt();
	System.out.println("Enter Second Number:");
	secondNumber = input.nextInt();

	sum = firstNumber + secondNumber;

	System.out.println("Sum of the two number is:" + sum);
	}
}
