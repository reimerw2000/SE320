package SE320_HW4_WR;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {
	
    public static void main(String[] args) {
    	
        // Create first set
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        // Create second set
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        // Cloning sets
        Set<String> clonedSet1 = new LinkedHashSet<>(set1);
        Set<String> clonedSet2 = new LinkedHashSet<>(set2);

        // Find the union of the sets
        Set<String> unionSet = new LinkedHashSet<>(clonedSet1);
        unionSet.addAll(clonedSet2);

        // Find the difference of the sets
        Set<String> differenceSet = new LinkedHashSet<>(clonedSet1);
        differenceSet.removeAll(clonedSet2);

        // Find the intersection of the sets
        Set<String> intersectionSet = new LinkedHashSet<>(clonedSet1);
        intersectionSet.retainAll(clonedSet2);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + unionSet);
        System.out.println("Difference: " + differenceSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}

