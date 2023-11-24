package SE320_HW5b_WR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class removeDuplicates {
	/**
	 * Requires: 
	 * Duplicate values are 1 index apart
	 * Example: [1,2,3,3,3,4,5] works
	 *          [1,2,3,4,3,5] does not
	 * No null values are present in the array
	 * No non-integer values 
	 * 
	 * @param lst
	 */
	public static void removeDuplicates(List lst) {
		if (lst == null || lst.size() == 0) return;
		List copy = new ArrayList(lst);
		Iterator elements = copy.iterator();
		Object pre = elements.next();
		while(elements.hasNext()) {
		Object nex = elements.next();
		if (pre.equals(nex)) lst.remove(nex);
		else pre = nex;
		}
		}
	
	public static void main(String args[]) {
		// Create a list from an array of integers
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0);
        list.add(3);
        list.add(3);
        list.add(5);
       

        // Print the list before removing duplicates
        System.out.println("List before removing duplicates: " + list);

        // Call the removeDuplicates method
        removeDuplicates(list);

        // Print the list after removing duplicates
        System.out.println("List after removing duplicates: " + list);

	}

}
