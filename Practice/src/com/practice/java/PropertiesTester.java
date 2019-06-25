/**
 * 
 */
package com.practice.java;

import java.util.Properties;
import java.util.Set;

/**
 * @author JJPL278
 *
 */
public class PropertiesTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("id","123");
		properties.setProperty("name","Velmurugan");
		properties.setProperty("dept","CSE");

		  //Set<String> keys = properties.stringPropertyNames();
		  Set<String> keys = properties.stringPropertyNames();
		    for (String key : keys) {
		      System.out.println(key + " : " + properties.getProperty(key));
		    }
	}

}
