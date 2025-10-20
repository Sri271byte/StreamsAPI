package com.Employee;

import java.security.Identity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Logical {
	
	public static void main(String[] args) {
		
        // Remove all spaces using Java 8 Streams
	
		        String input = "Java 8 Stream API Example";

	 String result = input.chars() // Create an IntStream
		 .filter(c -> c != ' ') // Filter out space characters
		   .mapToObj(c -> String.valueOf((char) c)) // Convert int to String
		   .collect(Collectors.joining()); // Join all characters back to a string

		        System.out.println(result); // Output: Java8StreamAPIExample
		    }}
		

	



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
		                .map(list -> list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst()            
		                .orElse(null)) // in case sublist is empty
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
	
	
	
	 class EvenNumberPrinterWithStreams {           // Define the class

	      public static void main(String[] args) {          // Entry point of the program
	//OUTPUT : (2)(4)(6)(8) , Total even numbers: 4

	          List<int[]> pairs = Arrays.asList(            // Create a List of integer arrays (pairs)
	              new int[]{1, 2},           // First pair: (1, 2)
	              new int[]{3, 4},                          // Second pair: (3, 4)
	              new int[]{5, 6},                          // Third pair: (5, 6)
	              new int[]{7, 8}                           // Fourth pair: (7, 8)
	          );

	          long evenCount = pairs.stream()               // Start a stream from the list of int[] pairs
	              .flatMapToInt(pair -> Arrays.stream(pair)) // Convert each int[] pair into a stream of integers
	              .filter(num -> num % 2 == 0)              // Keep only even numbers (divisible by 2)
	              .peek(num -> System.out.print("(" + num + ")")) // Print each even number in brackets
	              .count();                                 // Count how many even numbers there were

	          System.out.println("\nTotal even numbers: " + evenCount); // Print the total count of even numbers
	      }
	  }
	   
     class WordFrequencyJava8 {
 	    public static void main(String[] args) {
 	        // Step 1: Input array
 	       String[] arr = {"home", "svs", "home", "svs", "svs"};
 	    	
 	    	//Integer  [] arr = {1,2,3,4,2,4,3,2,4,5,2};	    
Map<String, Long> freqMap = Arrays.stream(arr) .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
 	        
 	        System.out.println(freqMap);

 	    }
 	}
//---------------------------------------------------------------------------------------------------------        
     class Main {
    	    public static void main(String[] args) {
    	    	
    	        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 22);
    	        List<Integer> list2 = Arrays.asList(2, 25, 5, 4, 3);

    	        List<Integer> result = Stream.concat(list1.stream(), list2.stream())
    	                .filter(i -> String.valueOf(i).startsWith("2"))
    	                .collect(Collectors.toList());

    	        System.out.println(result);
    	    }
    	}
     
     


     class SortNumbersKeepSpecialChars {
        public static void main(String[] args) {
            List<String> input = Arrays.asList("4", "@", "3", "#", "2", "1");

            // Step 1: Extract and sort numeric values
            List<String> sortedNumbers = input.stream()
                .filter(s -> s.matches("\\d+"))
                .sorted(Comparator.comparingInt(Integer::parseInt))
                .collect(Collectors.toList());   

            // Step 2: Rebuild result keeping special characters in place
            Iterator<String> numberIterator = sortedNumbers.iterator();

            List<String> result = input.stream()
                .map(s -> s.matches("\\d+") ? numberIterator.next() : s)
                .collect(Collectors.toList());

            System.out.println("Sorted output: " + result);
        }
    }
     
     class SortNumbersKeepSpecials {
    	    public static void main(String[] args) {
    	        Character[] input = {'5','3','@','&','8','1','!'};

    	        // Step 1: Extract only digits and sort them
    	        List<Character> sortedDigits = Arrays.stream(input)
    	                .filter(Character::isDigit)
    	                .sorted()
    	                .collect(Collectors.toList());

    	        // Step 2: Iterator for sorted digits
    	        Iterator<Character> digitIterator = sortedDigits.iterator();

    	        // Step 3: Replace digits in original positions with sorted digits
    	        Character[] output = Arrays.stream(input)
    	                .map(ch -> Character.isDigit(ch) ? digitIterator.next() : ch)
    	                .toArray(Character[]::new);

    	        // Print result
    	        System.out.println(Arrays.toString(output));
    	    }
    	}
     
     
     class CountAExample2 {
    	    public static void main(String[] args) {
    	        String[] input = {"ram", "ramalayam", "srikanth"};

    	        long count = Arrays.stream(input).mapToLong(s -> s.chars()
    	                .filter(ch -> ch == 'a' || ch == 'A')
    	                 .count()).sum();

    	        System.out.println("Count of 'a': " + count);
    	    }
    	}
     
     
     class TestOne{
    	 public static void main(String[] args) {
    		
    		  
    	
    			        List<Object> emp = Arrays.asList(1, "10", 200, "22", 10000, "111", 2000, null);

    			        List<String> startWith = emp.stream()
    			            .map(obj -> String.valueOf(obj))                   // Convert all objects (including null) to String
    			            .filter(e -> e.startsWith("1"))                    // Keep only those starting with "1"
    			            .collect(Collectors.toList());                     // Collect into a List

    			        System.out.println(startWith);
    			    }
    	}
     
     class GroupByLength {
 	    public static void main(String[] args) {
 	        List<String> input = Arrays.asList("a", "bb", "ccc", "dd");

 	        Map<Integer, List<String>> grouped = input.stream()
 	                .collect(Collectors.groupingBy(String::length));
 	        System.out.println(grouped);

 	       grouped.forEach((len, group) -> System.out.println(len + " = " + group));
 	    }
 	}
  
     
     class print4{
   	  public static void main(String[] args) {
   		
   		  List<Integer> Arr = Arrays.asList(1,2,3,4,5);
   		  List<Integer> s= Arr.stream().filter(e->e==4).collect(Collectors.toList());
   		  System.out.println(s);
   	}
     }
    
     class Main1 {
 	    public static void main(String[] args) {
 	        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

 	        // Using lambda expression
 	        names.forEach(name -> System.out.println(name));
 	    }
 	}
  
  
   class Main3 {
 	    public static void main(String[] args) {
 	        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "grape");

 	        long count = fruits.stream()
 	                .filter(fruit -> fruit.startsWith("a"))
 	                .count();

 	        System.out.println(count); // 2
 	    }
 	}
 

	
	