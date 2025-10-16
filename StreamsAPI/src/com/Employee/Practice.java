package com.Employee;

import java.security.Identity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
	
	public static void main(String[] args) {
		
        // Remove all spaces using Java 8 Streams
	
		        String input = "Java 8 Stream API Example";

	 String result = input.chars() // Create an IntStream
		 .filter(c -> c != ' ') // Filter out space characters
		   .mapToObj(c -> String.valueOf((char) c)) // Convert int to String
		   .collect(Collectors.joining()); // Join all characters back to a string

		        System.out.println(result); // Output: Java8StreamAPIExample
		    }}
		

	

class SwapingTwoValuesWithOutUsingThirdVeriable{
	public static void main(String[] args) {
		


int a = 10;
int b = 20;

System.out.println("Before swaping -- a = " + a); // 20
System.out.println("Before swaping -- b = " + b); // 10

a = a + b;  // a = 30
b = a - b;  // b = 10
a = a - b;  // a = 20

System.out.println("After swaping --- a = " + a); // 20
System.out.println("After swaping --- b = " + b); // 10

}
}

class  SecondHighestRepeatedChar{
	public static void main(String[] args) {
		

String input = "srikanthsvsa";
//Print second highest repeated char
String result = input.chars() // Convert the input string into an IntStream of character codes
	        .mapToObj(c -> (char) c) // Cast each int to a char and box into Character
	        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group characters and count frequency -> Map<Character, Long>
	        .entrySet().stream() // Convert the map into a Stream of entries (character, count)
	        .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue())) // Sort by count in descending order
	        .skip(1) // Skip the most repeated character (first one)
	        .findFirst() // Take the next entry (second most repeated)
	        .map(e -> "Second most repeated: " + e.getKey() + " : " + e.getValue() ) // Format the result string
	        .orElse("No second most repeated character found."); // Default if not present

	System.out.println(result); // Print the result
	
	}
}
	
	
	class SecondHighestListofList{
		public static void main(String[] args) {
			
			 List<List<Integer>> lists = Arrays.asList(
		                Arrays.asList(2, 4, 3, 1),
		                Arrays.asList(6, 7, 8, 5),
		                Arrays.asList(11, 12, 10, 9)
		        );

		        // Find second highest in each sublist
		        List<Integer> secondHighestList = lists.stream()
		                .map(list -> list.stream()
		                        .sorted(Comparator.reverseOrder()) // sort descending
		                        .skip(1)                 // skip max
		                        .findFirst()            // get second highest
		                        .orElse(null))
		                .collect(Collectors.toList());

		        // Print the result
		        System.out.println(secondHighestList); // Output: [3, 7, 11]
		        
 // Find duplicates by name SELECT name, COUNT(*) AS count FROM employees GROUP BY name HAVING COUNT(*) > 1;
		        
// Find full details of duplicate employees  SELECT * FROM employees WHERE name IN ( SELECT name FROM employees GROUP BY name HAVING COUNT(*) > 1);
	
	}
	
	
	}
	
	class WordOccurrenceSentence {
	    public static void main(String[] args) {
	        String sentence = "Java Spring Boot Java SQL Java";
	        List<String> input = Arrays.asList("SQL", "Spring", "Java", "SQL", "Java", "SQL");
	        String sentence1 = "JavaSpringBootJavaSQLJava";

	
	
	Map<String,Long> WordOccurrenceSentence = Arrays.stream(sentence.split("\\s+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println("each word count : "+WordOccurrenceSentence);
	
    Map<String,Long> WordCount = input.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println("each word count : "+WordCount);
	
	Map<Character,Long> count = sentence1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println("count each char : "+ count);
	
             
	
	    }
	}
	
	
	
	
	
	