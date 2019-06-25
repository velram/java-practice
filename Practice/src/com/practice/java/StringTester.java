/**
 * 
 */
package com.practice.java;

/**
 * @author JJPL278
 *
 */
public class StringTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String nullString = "Velmurugan" + "";
		String saslJaasConfig = "org.apache.kafka.common.security.plain.PlainLoginModule required "
				+ "username=\"token\" password=\"" + "KECerKxGO73ghlFGKeu61A1HcbNoqGTAwhU_nRWWJYZ-" + "\";";
		//System.out.println("Null string is :"+nullString+":");
		System.out.println("saslJaasConfig : " + saslJaasConfig);
	}

}
