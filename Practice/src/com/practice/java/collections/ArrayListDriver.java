package com.practice.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Velmurugan Moorthy
 * 09.01.2020
 * Practice the basics of ArrayList
 */
public class ArrayListDriver {
    public static void main(String[] args) {

        ArrayListDemo arrayListDemo = new ArrayListDemo();
        arrayListDemo.invokeArrayListOperations();
    }
}

class ArrayListDemo{

    public void invokeArrayListOperations(){

        List<Integer> sampleNumbers = new ArrayList<>();

        /* addAll() operation adds all the elements from input collection
         * to the existing collection
         */
        sampleNumbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println("List is : "+sampleNumbers);

        //Add operation without index simply appends element at the last index
        sampleNumbers.add(10);
        System.out.println("List is : "+sampleNumbers);

        /*
         * Add operation with index, inserts element at the given index
         * & shifts the existing element by one index (expensive operation)
         */
        sampleNumbers.add(8,9);
        System.out.println("List is : "+sampleNumbers);
    }
}