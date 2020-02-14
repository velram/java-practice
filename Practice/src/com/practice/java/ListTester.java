/**
 * 
 */
package com.practice.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Velmurugan
 * Aim : To verify the size of the array list after adding nulls
 */
public class ListTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println("Before adding | Total names : "+names.size());
		names.add(null);
		names.add(null);
		names.add(null);
		
		System.out.println("After adding | Total names : "+names.size());
		
		
		List<Integer> inputList = new ArrayList<Integer>();
		inputList.add(10);
		inputList.add(20);
		inputList.add(5);
		inputList.add(30);
		inputList.add(4);
		inputList.add(20);
		inputList.add(60);
		int prev = inputList.get(0); 
		int next = 0; 
		
		for(int loopIndex = 0; loopIndex < inputList.size(); loopIndex++) {
			 
			
		}
	}

}
