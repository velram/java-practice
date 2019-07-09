/**
 * 
 */
package com.practice.java;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @author Velmurugan Moorthy
 *
 */
public class Base64Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 // Getting encoder  
        Base64.Encoder encoder = Base64.getEncoder();  
        // Creating byte array  
		/*
		 * byte inputTextBytes[] = new String("Velmurugan").getBytes(); // encoding byte
		 * array byte encryptedInputBytes[] = encoder.encode(inputTextBytes);
		 * System.out.println("Encoded byte array: "+encryptedInputBytes); byte
		 * decodedBytes[] = new byte[encryptedInputBytes.length]; // Make sure it has
		 * enough size to store copied bytes int x =
		 * encoder.encode(inputTextBytes,decodedBytes); // Returns number of bytes
		 * written System.out.println("Encoded byte array written to another array: "
		 * +decodedBytes); System.out.println("Number of bytes written: "+x);
		 */
      
        // Encoding string  
        String inputString = "Velmurugan";
        String encodedString;
		try {
			encodedString = encoder.encodeToString("Velmurugan Moorthy".getBytes("utf-8"));
			System.out.println("Encoded string: "+encodedString);  
	        // Getting decoder  
	        Base64.Decoder decoder = Base64.getDecoder();  
	        // Decoding string  
	        String dStr = new String(decoder.decode(encodedString));  
	        System.out.println("Decoded string: "+dStr);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
          
	}

}
