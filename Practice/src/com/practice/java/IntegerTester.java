/**
 * 
 */
package com.practice.java;

/**
 * @author Velmurugan Date 25-Jun-2019 | Time 2:57:40 pm This class is created
 *         to understand the basics of octal & HexaDecimal integer in Java
 */
public class IntegerTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int octalValue = 07;
		int octalValue2 = 010;
		int hexaValue1 = 0xA;

		System.out.println("Octal 07 = " + (octalValue)); // output is : 7
		System.out.println("Octal 07 + 1 = " + (++octalValue)); // output is : 8
		System.out.println("Octal 010 = " + (octalValue2)); // output is : 8
		System.out.println("hexaValue 0xA = " + (hexaValue1)); // output is : 10
	}

}
