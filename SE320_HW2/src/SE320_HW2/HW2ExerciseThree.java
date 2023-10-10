/*
 * Created by William Reimer
 * Work for exercise three. Purpose is to use assertions to notify user if value
 * is out of range
 */
package SE320_HW2;

import java.util.Scanner;

public class HW2ExerciseThree {
	
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);

	  System.out.print("Enter a number between 0 and 10: ");
	  int userInput = scanner.nextInt();

	  assert userInput < 10 : "The entered number is out of range";
	  assert userInput > 10 : "The entered number is out of range";
	        
	  System.out.println("The voter's age is " + userInput);
	  }
	}

