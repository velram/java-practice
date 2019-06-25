/**
 * 
 */
package com.practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author JJPL278
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
		
		List<Integer> studentIds = new ArrayList<Integer>();
		int[] studentAges = {2893, 1, 389, 3, 2, 6,7};

		for(int loopIndex = 1; loopIndex< 10; loopIndex++){
			studentIds.add(loopIndex);
        }
		
		//studentIds.stream().filter(predicate)
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		//get count of empty string
		long count = strings.stream().filter(tempString -> !tempString.isEmpty()).count();
		
		System.out.println("Non Empty string count is : " + count);
		
	}
}
