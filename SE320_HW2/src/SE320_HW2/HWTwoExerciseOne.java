/*
 * Created by William Reimer
 * Work for exercise one. Purpose is to modify original code to 
 * use an array rather than array list, and check array size (double array
 * size if needed) Comes with a main that includes test cases to show
 * proof of success.
 */

package SE320_HW2;

public class HWTwoExerciseOne<E> {
	 private E[] array;
	 private int size;
	 private static final int DEFAULT_CAPACITY = 5;
	 
	 
	public HWTwoExerciseOne() {
		 this.array = (E[]) new Object[DEFAULT_CAPACITY];
	     this.size = 0;
	}
    
    public int getSize() {
    	return size;
    }
    
    public E peek() {
    	return array[size - 1];
    }
    
    public void push(E o) {
    	  if (size == array.length) {
              resizeArray();
          }
          array[size++] = o;
    }
    
    public E pop() {
    	E o = array[size--];
    	return o;
    }
    
    public boolean isEmpty() {
    	return size == 0;
    }
    
    //doubles array size when array capacity exceeded
    public void resizeArray() {
        int newArraySize = array.length * 2;
        E[] newArray = (E[]) new Object[newArraySize];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
    
   
    //Converts the array to string (readable) form
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("stack: [");
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }


    //Contains test cases
    public static void main(String args[]) {
    	
    	  HWTwoExerciseOne stack = new HWTwoExerciseOne<>();
    	  
    	  //Test values
    	  stack.push(1);
    	  stack.push(5);
          stack.push(10);
          stack.push(20);
          stack.push(50);
          stack.push(100);
          
          System.out.println(stack);
          
          //Tests functions of program
          stack.pop();
          
          System.out.println(stack);
          System.out.println(stack.isEmpty());
          System.out.println(stack.peek());
          System.out.println(stack.getSize());
    	
    }
    	   	
    		
}
