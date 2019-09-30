/**
 * 
 */
package com.practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Velmurugan Moorthy
 *
 */
public class StreamsTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamsTools streamTools = new StreamsTools();
		streamTools.demoStreamOperations();
	}

}

/**
 * 
 * @author Velmurugan
 * Date 25-Jun-2019 | Time 3:12:53 pm
 * 
 * Various ways to create Streams
 * 1. Stream.of()
 * 2. list.stream()
 * 3. Array.stream 
 */
class StreamsTools {
	
	public void demoStreamOperations() {
		
		//List<Integer> studentIds = Arrays.asList(2893, 1, 389, 3, 2, 6,7);
		
		//studentIds.stream().filter(predicate)
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		demoStreamFilterOperation(strings);
		demoStreamCollectOperation(strings);
		demoStreamForEach(strings);		
	}

	
	private void demoStreamForEach(List<String> strings) {
		
		System.out.println("\n======================================");
		System.out.println("Streams - For Each demo start\n");
		
		
		//Method #1 - using Lambda expression
		strings.forEach(string -> System.out.println(string));
		
		//Method #2 - Using "Method reference" approach
		strings.forEach(System.out :: println);
		
 
		
		System.out.println("\nStreams - For Each demo end");		
		System.out.println("======================================");
	}


	private void demoStreamCollectOperation(List<String> strings) {
		System.out.println("\n======================================");
		System.out.println("Streams - Collect operation demo start \n");
		List<String> nonEmptyStrings  = strings.stream().filter(currString -> !currString.isEmpty()).collect(Collectors.toList());
		nonEmptyStrings.stream().forEach(System.out :: println);
		System.out.println("\nStreams - Collect operation demo ends");
		System.out.println("======================================");
	}

	/**
	 * @param strings
	 */
	private void demoStreamFilterOperation(List<String> strings) {
		//get count of empty string
		System.out.println("\n======================================");
		System.out.println("Streams - Filter operation demo start \n");
		long count = strings.stream().filter(tempString -> !tempString.isEmpty()).count();
		
		System.out.println("Non Empty string count is : " + count);
		
		System.out.println("\nStreams - Filter operation demo end");
		System.out.println("======================================");
	}
}
