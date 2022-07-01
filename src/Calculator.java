import java.util.Scanner;

public class Calculator {
	
	static void add(int num1, int num2) {
		System.out.printf("%d + %d = %d \n", num1, num2, num1 + num2);
		
	}
	
	static void subtraction(int num1, int num2) {
		System.out.printf("%d - %d = %d \n", num1, num2, num1 - num2);
	}
	
	static void multipication(int num1, int num2) {
		System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);
	}
	
	static void division(int num1, int num2) {
		System.out.printf("%d / %d = %d \n", num1, num2, num1 / num2);
	}
	
	public static void main(String [] args) {
		System.out.println("This should work");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first number.");
		int num1= input.nextInt();
		
		System.out.println("Enter your second number.");
		int num2 = input.nextInt();
		
		add(num1, num2);
		subtraction(num1, num2);
		multipication(num1, num2);
		division(num1, num2);
		
	}


}


//Create a Java Calculator Class that does the following five commands:
//An add method that takes in two integer numbers and adds them together the call to that method would look like this: add(int num1, int num2)
//A subtraction method that takes in two integers and subtracts them from one another would look like this: subtract( int num1, int num2)
//A multiplication method that takes in two integer numbers and multiplies them together the call to that method would look like this: multiply(int num1, int num2)
//A division method that takes in two integer numbers and divides them the call to that method would look like this: divide(int num1, int num2)
//A square method that takes in one integer and squares it: square(int num1, int num2)