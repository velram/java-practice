/**
 * 
 */
package com.practice.java;

/**
 * @author Velmurugan
 * To understand the basic working mechanism of 
 * String StringPool and "intern()" method concept
 */
public class StringPoolTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringObject = new String("Velmurugan");
		String stringObject2 = new String("Velmurugan");
		String stringObject3 = new String("Velmurugan");
		String stringObject4 = new String("Velmurugan");
		
		String stringLiteral = "Velmurugan";
		String stringLiteral2 = "Velmurugan";
		String stringLiteral3 = "Velmurugan";
		String stringLiteral4 = "Velmurugan";
		
		
		System.out.println("Two literals (1 & 2) are equal : " + (stringLiteral == stringLiteral2));
		System.out.println("Two literals (3 & 4) are equal : " + (stringLiteral3 == stringLiteral4));
		
		System.out.println("\nBefore calling intern() | String literal1 and object are equal : " + (stringLiteral == stringObject));
		System.out.println("Before calling intern() | String literal2 and object3 are equal : " + (stringLiteral2 == stringObject3));
		stringObject.intern();
		System.out.println("\nAfter calling intern() | String literal and object are equal : " + (stringLiteral == stringObject));
		
		System.out.println("\nString literal and stringObject.intern() are equal : " + (stringLiteral == stringObject.intern()));
		System.out.println("stringObject and stringObject2 are equal : " + (stringObject == stringObject2));
	}

}
