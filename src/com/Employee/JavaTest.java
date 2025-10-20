package com.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class JavaTest {
	  
    public static void main(String[] args) {
    	 //   OUTPUT :P : 1, r : 2, o : 1, g : 1, a : 1, m : 1
        String s = "Program";
        char[] ch = s.toCharArray();
        boolean[] b = new boolean[s.length()];

        System.out.println("Character Occurrences:");
        for (int i = 0; i < ch.length; i++) {
            if (b[i]) continue;     // Skip already counted characters
            int c = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    c++;
                    b[j] = true;     // Mark character as counted
                }
            }
            System.out.println(ch[i] + " : " + c);
        }}}
//-----------------------------------------------------------------------------------------------
 class ReverseWithSpacePreserved {
    public static void main(String[] args) {
		/*
		 * Input: I am Java Developer 
		 * Output: r ep olev eDavaJmaI
		 */
        String input = "I am Java Developer";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        // Mark spaces in result
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Fill characters in reverse order, skipping spaces
        int j = inputArr.length - 1;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] != ' ') {
                while (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArr[i];
                j--;
            }
        }

        System.out.println("Output: " + new String(result));
    }
}
//---------------------------------------------------------------------------------------------
 class StringReverse{
	 
	 public static void main(String[] args) {
		
		 String s = "ABCD";
		 String reverse="";

		 for(int i=0;i<s.length();i++){
		 reverse=s.charAt(i)+reverse;
		 }
		 System.out.println(reverse);
	}
 }
 //-------------------------------------------------------------------------------------------------
 class PrintFirstAndLastLetters{
	 public static void main(String[] args) {

			 String str= "SRIKANTH";

			 char first = str.charAt(0);
			 char last = str.charAt(str.length()-1);

			 System.out.println(first);
			 System.out.println(last);
	}
	 
 }
//----------------------------------------------------------------------------------------------------
 class CountDuplicates{
	 public static void main(String[] args) {
		 
//OUT PUT : [S=2, V=1,S=2, r=1, i=1, k=1,a=1, n=1,t=1, h=1, s=1]
                 String str= "SVSrikanths";

                 for(int i=0;i<str.length();i++){
	             int count=0; 
                 for(int j=0;j<str.length();j++){
	             if(str.charAt(i)==str.charAt(j)){ 
	            	 count++;
                 }
              }
                  System.out.println(str.charAt(i)+"="+ count++);
	}}}
 //---------------------------------------------------------------------------------------------
 class ReplaceIntegervalues{
	 public static void main(String[] args) {
		
 // OUT PUT : 0V1rikanths
	          String str =  "SVSrikanths";

	          char c[] =str.toCharArray();
           	  int c1=0;

	          for(int i=0;i<str.length();i++){ 
              if(c[i]== 'S') {
    	      System.out.print(c1);
    	      c1++;
    
	          }else{
    	            System.out.print(str.charAt(i));
	 }}}}
 //------------------------------------------------------------------------------------------------------------
	 class TwoArraysCommonElements{
		 public static void main(String[] args) {
			
		       int [] array1 = {1,3,7,9,8};
		       int [] array2 = {5,9,1,10,11};
		       

               for(int i=0;i<array1.length;i++) {
               for(int j=0;j<array2.length;j++){
               if (array1[i]==array2[j]) { 
            	   System.out.println("Comman elements:"+ array1[i]); 
            	   }
               }}}}
               
 //--------------------------------------------------------------------------------------------------------------
class HeighestAndLowestElements{
	public static void main(String[] args) {

              int arr[] =  {1,4,3,8,2,9,10};
              int max = arr[0];
              int min = arr[0]; 
              for(int i=0;i<arr.length;i++){ 
	          if(max<arr[i]){
	        	 max=arr[i]; 
	          }
	          if(min>arr[i]){
	        	 min=arr[i];
	          
	          }}
                System.out.println("Min "+min); 
                System.out.println("Max "+max);

}}
//--------------------------------------------------------------------------------------------------------------------
class FibonacciRecursion {
     // FibonacciRecursion series using recursion:0 1 1 2 3 5 8 13 21 34 
    // Step 1: Recursive method to calculate the nth FibonacciRecursion number
    public static int fibonacci(int n) {
        if (n <= 1)  // Base case
            return n;
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int terms = 10; // Step 2: How many FibonacciRecursion numbers to print

        System.out.println("Fibonacci series using recursion:");
        for (int i = 0; i < terms; i++) { // Step 3: Loop through and print each term
            System.out.print(fibonacci(i) + " ");
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Count{
	 public static void main(String[] args) {
		   //OUTPUT : No of 1s are 4, No of 0s are 3
		    List<Integer> numbers2 = Arrays.asList(1,1,0,1,0,0,1);
		    Integer sum = numbers2.stream().reduce(0, Integer::sum);
		    System.out.println("No of 1s are "+sum);
		    System.out.println("No of 0s are "+(numbers2.size()-sum));			
	} }
//---------------------------------------------------------------------------------------------------------------
class CountCharacterOccurence{
    public static void main(String[] args){
    	//OUTPUT : Number of occurence of 'a' in Java is java again java again = 10
        String s = "Java is java again java again";
        char c = 'a';
        int count = s.length() - s.replace("a", "").length();
        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
    }}
//--------------------------------------------------------------------------------------------------------------
 class ReverseWordsSimple {
    public static void main(String[] args) {
    	//OUTPUT : [juice, pizza, pasta, sandwich]
        String input = "sandwich pasta pizza juice";

        List<String> words = Arrays.asList(input.split(" "));
        Collections.reverse(words); // Reverse in-place

       System.out.println(words); // Print each word
    }}
//----------------------------------------------------------------------------------------------------------------------- 
 class NullFinder {
	    public static void main(String[] args) {
	        List<String> fruits = Arrays.asList("Apple", "Gpapes", null, " ", "Mango");
	        
	        //OUTPUT : Found null value

	        fruits.stream()
	              .filter(item -> item == null)
	              .forEach(item -> System.out.println("Found null value"));
	    }
	}
		
	//---------------------------------------------------------------------------------------------------------------------- 
	  class NullIndexFinder {
		    public static void main(String[] args) {
		    	
		    	// OUTPUT : Null found at index: 2
		        List<String> fruits = Arrays.asList("Apple", "Gpapes", null, " ", "Mango");

		        for (int i = 0; i < fruits.size(); i++) {
		            if (fruits.get(i) == null) {
		                System.out.println("Null found at index: " + i);
		            }
		        }
		    }
		}

//-------------------------------------------------------------------------------------------------------
      class ReversePairing {
   	    public static void main(String[] args) {
   	    	//OUT PUT : 1,3 2,2 0,5
   	        int[] input = {1, 2, 0, 4, 5, 2, 3};

   	        for (int i = 0; i < input.length / 2; i++) {
   	            int left = input[i];
   	            int right = input[input.length - 1 - i];
   	            System.out.println(left + "," + right);
   	        }
   	    }
   	}
  //----------------------------------------------------------------------------------------------------------
		 

 
 
 class comap{
	 public static void main(String[] args) {
		

      ArrayList<Integer> al = new ArrayList<>();
      al.add(1);
      al.add(2);
      al.add(3);
      al.add(4);
      al.add(5);
      al.add(6);
      al.add(7);
      al.remove(3);
      al.remove(5);
      al.get(5);// java.lang.IndexOutOfBoundsException
       
      System.out.println(al);
 
	 }
 }
 
 //--------------------------------------------------------------------------------------------------------------
 class Test1 {
	public static void main(String[] args) {
		
		
		String s1="ABC";
		String s2="XYZ";
		
		s1 =s1+s2;
		s2= s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
//-----------------------------------------------------------------------------------------------------

class MapFlatMapSimple {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
            "I love Java",
            "Java Streams are powerful",
            "Map and FlatMap difference"
        );

        System.out.println("=== Using map() ===");
        sentences.stream()
                 .map(sentence -> sentence.split(" "))
                 .forEach(array -> System.out.println(Arrays.toString(array)));

        System.out.println("\n=== Using map() + flatMap() ===");
        sentences.stream()
                 .map(sentence -> sentence.split(" "))
                 .flatMap(Arrays::stream)
                 .forEach(System.out::println);
    }
}
//--------------------------------------------------------------------------------------------------------------
class Permutations {
    public static void main(String[] args) {
        String str = "ABC";
        List<String> result = new ArrayList();
        permute("", str, result);

        // Print results
        result.forEach(System.out::println);
    }

    private static void permute(String prefix, String remaining, List<String> result) {
        if (remaining.isEmpty()) {
            result.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                permute(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1),
                        result);
            }
        }
}}
//--------------------------------------------------------------------------------------------------------------------------------
 
 
 
class SwapingTwoValuesWithOutUsingThirdVeriablee{
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
//--------------------------------------------------------------------------------------------------------
 
 
//------------------------------------------------------------------------------------------------------------
	class PrintFirstAndLastSameTypeOfElements{
		public static void main(String[] args) {
			// OutPut : aba,xyx,zzz
			List<String> names = Arrays.asList("aba","cv","xyx","zzz");
			names.stream().filter(x -> x.length() > 0 && x.endsWith(String.valueOf(x.charAt(0))))
			     .forEach(System.out::println);
		}}
//--------------------------------------------------------------------------------------------------------------
	  class MoveZerosRight {
		    public static void main(String[] args) {
		    	//OUT PUT : [0, 0, 0, 1, 1, 1, 1]
		        List<Integer> input = Arrays.asList(1,1,0,1,0,0,1);

		        List<Integer> result = Stream.concat(input.stream().filter(n -> n == 0),
		                                             input.stream().filter(n -> n != 0)
		        ).collect(Collectors.toList());
		        System.out.println(result);
		    }}
//----------------------------------------------------------------------------------------------------------------	  
	  class LetterCountWithOutG{
		  public static void main(String[] args) {
			String word = "Today is good day";
			Map<Character,Long> letterCount = word.chars()//convert the string to intstream
			   .filter(c-> c!='g' && c!='G')	//filter out g		   
			   .filter(Character::isLetter)    // keep only letters
			   .mapToObj(c->(char) c )         //convert Int to charcter
			   .collect(Collectors.groupingBy(c-> c,Collectors.counting())); //collect into map
			
	           System.out.println("Letter count withOut G : "+letterCount);
		}} 
//-------------------------------------------------------------------------------------------------------------------
	  class PrintLastStringValue{
		   public static void main(String[] args) {
			
			   List<String> names = Arrays.asList("srikanth","svs","pavan","Ram");
			   String result = names.stream().skip(names.size()-1).findFirst().get();
			   System.out.println(result);
		   }}
	//[--------------------------------------------------------------------------------------------  
	   class FindTheSecondHighestValueAndRemoveDuplicates{ 
		   public static void main(String[] args) {
			   
			List<Integer> ar = Arrays.asList(3,3,2,3,1);  
			Integer k =  ar.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
			System.out.println(k);	   
		}}
	   //----------------------------------------------------------------------------------
	       class ReversePairing1 {
	    	    public static void main(String[] args) {
	    	    	//OUT PUT : 1,3 2,2 0,5
	    	        int[] input = {1, 2, 0, 4, 5, 2, 3};

	    	        for (int i = 0; i < input.length / 2; i++) {
	    	            int left = input[i];
	    	            int right = input[input.length - 1 - i];
	    	            System.out.println(left + "," + right);
	    	        }}}
	//----------------------------------------------------------------------------
 

	         class WordFrequency {
	            public static void main(String[] args) {
	                // Step 1: Define the input array of words
	                String[] arr = {"home", "svs", "home", "svs", "svs"};

	                // Step 2: Create a HashMap to store word frequencies
	                Map<String, Integer> freqMap = new HashMap<>();

	                // Step 3: Loop through each word in the array
	                for (String word : arr) {
	                    // Step 4: Update the frequency count in the map
	                    freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
	                }

	                // Step 5: Loop through the map entries and print the frequencies
	                for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
	                    System.out.println(entry.getKey() + ": " + entry.getValue());
	                }}}
 
//---------------------------------------------------------------------------------------  

	         class exceptionnn {
	        	 public static void main(String[] args) {
	        	 	

	        	          List<String> list = new ArrayList<>();
	        	          list.add("A");
	        	          list.add("B");

	        	          for (String item : list) {
	        	              if (item.equals("B")) {
	        	                  list.remove(item);  // ConcurrentModificationException
	        	              }
	        	          }}}
	         
//------------------------------------------------------------------------------------------------- 
	         

	         
	         //---------------------------------------------------------------------------------------------------------------  
	              class Singleton {                     // Define the Singleton class

	        	    private static Singleton instance;       // Static variable to hold the single instance
	        	    private Singleton() {                    // Private constructor prevents instantiation from outside
	        	        // Optional: initialization code
	        	    }

	        	    public static synchronized Singleton getInstance() {  // Public method to return the instance
	        	        if (instance == null) {                            // If instance is not created yet
	        	            instance = new Singleton();                    // Create the instance
	        	        }
	        	        return instance;                                   // Return the single instance
	        	    }

	        	    public void showMessage() {                // Example method to test the singleton
	        	        System.out.println("Hello from Singleton!");
	        	    }
	        	    
	        	    	public static void main(String[] args) {
	        	    	      
	        	    	  Singleton obj1 = Singleton.getInstance();
	        	    	          System.out.println(obj1);
	        	    	  Singleton obj2= Singleton.getInstance();
	        	    	          System.out.println(obj2);
	        	    	  Singleton obj3= Singleton.getInstance();
	        	    	          System.out.println(obj3);
	        	      }
	        	    	 
	        	}
	        //-----------------------------------------------------------------------------------------------------
	            
	             class DeadlockExample {
	                     // Two shared resources (locks)
	                private static final Object Lock1 = new Object();
	                private static final Object Lock2 = new Object();

	                public static void main(String[] args) {
	                    Thread thread1 = new Thread(() -> {
	                        synchronized (Lock1) {                                // Thread 1 locks Lock1
	                            System.out.println("Thread 1: Holding Lock1...");

	                            try { Thread.sleep(100); } catch (Exception e) {} // Wait to increase chance of deadlock

	                            System.out.println("Thread 1: Waiting for Lock2...");
	                            synchronized (Lock2) {                            // Thread 1 tries to lock Lock2
	                                System.out.println("Thread 1: Acquired Lock2!");
	                            }}
	                    });

	                    Thread thread2 = new Thread(() -> {
	                        synchronized (Lock2) {                                // Thread 2 locks Lock2
	                            System.out.println("Thread 2: Holding Lock2...");

	                            try { Thread.sleep(100); } catch (Exception e) {} // Wait to increase chance of deadlock

	                            System.out.println("Thread 2: Waiting for Lock1...");
	                            synchronized (Lock1) {                            // Thread 2 tries to lock Lock1
	                                System.out.println("Thread 2: Acquired Lock1!");
	                            }}
	                    });

	                    thread1.start();  // Start Thread 1
	                    thread2.start();  // Start Thread 2
	                }
	            }
	        //--------------------------------------------------------------------------------------------------------------
	          
	                class PairSum {

	                   public static void findPairSum(int[] arr, int targetSum) {
	                       Map<Integer, Integer> numMap = new HashMap<>(); // Stores number and its index

	                       for (int i = 0; i < arr.length; i++) {
	                           int currentNum = arr[i];
	                           int complement = targetSum - currentNum;

	                           if (numMap.containsKey(complement)) {
	                               System.out.println("Pair found: (" + complement + ", " + currentNum + ")");
	                               // If you need indices: System.out.println("Pair found at indices: (" + numMap.get(complement) + ", " + i + ")");
	                           }
	                           numMap.put(currentNum, i); // Store the current number and its index
	                       }}

	                   public static void main(String[] args) {
	                	   //OUT PUT : Pair found: (1, 7) Pair found: (5, 3) Pair found: (2, 6)
	                       int[] numbers = {1, 5, 7, -1, 5, 3, 2, 6};
	                       int target = 8;
	                       findPairSum(numbers, target);
	                   }
	               }

	               //--------------------------------------------------------------------------------------
 
