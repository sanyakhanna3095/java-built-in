import java.util.Scanner;

public class BasicCalculator {

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		
		//Choose among the four numbers to select which operation to perform
        	System.out.println("Choose an operation among the following options: ");
        	System.out.println("1 -> Addition");
        	System.out.println("2 -> Subtraction");
        	System.out.println("3 -> Multiplication");
        	System.out.println("4 -> Division");
		
		//Take user input
		System.out.print("Enter your choice: ");
        	int choice = sc.nextInt();
		
        	System.out.print("Enter first number: ");
        	double n1 = sc.nextDouble();
	
        	System.out.print("Enter second number: ");
        	double n2 = sc.nextDouble();

        	double result = 0;
        	switch (choice) {
            		case 1:
                		result = add(n1, n2);
                		break;
            		case 2:
                		result = subtract(n1, n2);
                		break;
            		case 3:
                		result = multiply(n1, n2);
                		break;
            		case 4:
                		result = divide(n1, n2);
                		break;
            		default:
                		System.out.println("Invalid choice!");
                		return;
        	}

        	System.out.println("The result is: " + result);
    	}

    	// Addition method
    	public static double add(double a, double b) {
        	return a + b;
    	}

    	// Subtraction method
    	public static double subtract(double a, double b) {
        	return a - b;
    	}

    	// Multiplication method
    	public static double multiply(double a, double b) {
        	return a * b;
    	}

    	// Division method
    	public static double divide(double a, double b) {
        	if (b == 0) {
        		System.out.println("Error: Division by zero is not allowed.");
            		return 0;
        	}
        	return a / b;
    	}
}


/*
I/P -> Choose an operation: 
1 -> Addition
2 -> Subtraction
3 -> Multiplication
4 -> Division
3
Enter first number: 4
Enter second number: 5

O/P -> The result is: 20.0
*/
