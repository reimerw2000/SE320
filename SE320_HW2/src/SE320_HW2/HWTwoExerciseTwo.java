/*
 * Created by William Reimer
 * Work for exercise two. Purpose is to remove duplicate values from an array. 
 * Test case in main
 */


package SE320_HW2;

import java.util.ArrayList;

public class HWTwoExerciseTwo {
	
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       //Test values
       list.add(14);
       list.add(24);
       list.add(14);
       list.add(42);
       list.add(25);
 
       ArrayList<Integer> newList = removeDuplicates(list);
 
       System.out.print(newList);
 }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
    	
    	 ArrayList<E> nonDuplicateList = new ArrayList<>();
    	 
    	 //Outer for loop that runs through array and collects values
    	 for(int i = 0; i < list.size(); i++) {
    		 E array = list.get(i);
    		 boolean isDuplicate = false;
    		 //Inner for loop that checks if any two values are equal to each other
    		 for (int j = 0; j < i; j++) {
    			 if (list.get(j).equals(array)) {
    				 //If duplicate = true, the loop is broken, and the value is not added
    				 isDuplicate = true;
    				 break;
    			 }
    		 }
    		 //If duplicate != true, value is added to array
    		 if (!isDuplicate) {
    			 nonDuplicateList.add(array);
    		 }
    	}

        return nonDuplicateList;
    	}
    	 
    }


