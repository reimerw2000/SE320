package SE320_HW1b_WR;

import java.util.*;



public class displayElementValue {

	public static void main(String args[]) {
	//Creating random object to allow creation of random numbers.
	Random random = new Random(); 
	
	//Value used to set limit on random number value(< 1000)
	int randomNumberLimit = 1000;
	//Value used to set array size(100)
	int arrayNumberLimit = 100;
	//Creating the array that will store the 100 random numbers
	int[] randomArr = new int[arrayNumberLimit];	
    
	//Scanner object to read user inputs.
    Scanner scanner = new Scanner(System.in);
	//boolean value to break out of the do-while loop if no exception
	boolean continueInput = true;
	
	//start of do-while loop
  	do {
  		try{
  			//puts random numbers into array one at a time
  			for (int i = 0; i < 100; i++) {
  				int randomInt = random.nextInt(randomNumberLimit);
  				randomArr[i] = randomInt;
  				}
  			//Asking the user for their desired index value
  			System.out.println("Please enter an index value between 0 and 99: ");
  			int indexValue = scanner.nextInt();
  			//Prints out the corresponding array value to the user selected index value
  			System.out.println("The number at your selected index: " + randomArr[indexValue] + "\n");
  			continueInput = false;
  			}
  		//exception that occurs when user enters integer less than 0 or greater than 99
  		catch (ArrayIndexOutOfBoundsException ex){
  			System.out.println("Incorrect input, your value is not between 0 and 99");
  			scanner.nextLine();
  		}
	}while(continueInput);
  	scanner.close();
    
    System.out.println("Full array (for comparison): " + Arrays.toString(randomArr) + "\n");
   
	}
}
