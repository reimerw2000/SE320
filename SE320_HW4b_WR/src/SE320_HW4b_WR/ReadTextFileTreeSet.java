package SE320_HW4b_WR;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class ReadTextFileTreeSet {
	
    public static void main(String[] args) {
    	
    	//File Path (needs to be manually changed to your file path)
        String fileName = "C:/Users/William/eclipse-workspace/SE320_HW4b_WR/src/SE320_HW4b_WR/NonDuplicateWords.txt";

        // Create a TreeSet
        Set<String> nonDuplicateWords = new TreeSet<>();

        // Read words from the file and add them to the TreeSet
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into words 
            	//found info on https://www.geeksforgeeks.org/split-string-java-examples/
                String[] words = line.split("\\s+");

                // Add each word to the TreeSet
                for (String word : words) {
                    nonDuplicateWords.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display non-duplicate words in ascending order
        System.out.println("Non-duplicate words in ascending order:\n");
        for (String word : nonDuplicateWords) {
            System.out.println(word);
        }
    }
}
