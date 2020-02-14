package com.practice.java.inheritance;

/**
 * @author Velmurugan Moorthy
 * A class to demo the mechanism of Inheritance
 *
 */
public class InheritanceDemo {
    public static void main(String[] args) {

        ParentClass sample = new ParentClass();
        //Passing parent class to the object - invokes parent class' method only
        System.out.println("Object contains only parent class");
        sample.foo();

        //Passing child class to the object - invokes child class' method only
        System.out.println("\nObject contains only child class");
        sample = new ChildClass();
        sample.foo();
    }
}
