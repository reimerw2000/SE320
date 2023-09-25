package SE320_HW1_WR;
import java. util. *;

public class displaySum {
int a = 0;
int b = 0;

	//Method to add the two user defined integers together
	public static int add(int a, int b) {
		int c = 0;
		c = a + b;
		return c;
	}
	
	public static void main(String args[]) {
		//Scanner object to read user inputs.
		Scanner scanner = new Scanner(System.in);
		
		//boolean value to break out of the do-while loop if no exception
		boolean continueInput = true;
		
		//start of do-while loop
		do {
			try
			{
				//asks the user for the first integer value
				System.out.println("Please enter your first value: ");
				int a = scanner.nextInt();
				//asks the user for the second integer value
				System.out.println("Please enter your second value: ");
				int b = scanner.nextInt();
				//changes boolean from true to false when no exception occurs 
				continueInput = false;
				//calling method to add user defined values and storing result to int c
				int c = add(a,b);
				//printing out solution
				System.out.println("The result is: " + c);
			}
		
			//exception that occurs when user enters anything other than integer value
			catch (InputMismatchException ex)
			{
				//gives message to user to input differet value
				System.out.println("Incorrect input, an integer is required");
				//reads next line to disregard previous non-integer value user input
				scanner.nextLine();
			}
		}while(continueInput);
		
		scanner.close();
		
		
		
	}
}
