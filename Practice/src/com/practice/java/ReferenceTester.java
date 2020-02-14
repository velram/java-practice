/**
 * 
 */
package com.practice.java;

/**
 * @author Velmurugan
 * This method is to verify the Object's pass by reference
 */
public class ReferenceTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sampleObject = new Sample();
		sampleObject.setSection("B");
		sampleObject.setDept("CSE");
		//sampleObject.populateSample(sampleObject);
		System.out.println("Sample object name : "+sampleObject.getName());
		System.out.println("Sample object id : "+sampleObject.getId());
	}

}

class Sample {
	
	private int id;
	private String name; 
	private String dept;
	private String section;
	
	public void populateSample(Sample pSample) {
	  pSample.setId(123);
	  pSample.setName("Velmurugan");;
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}

	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}

}
