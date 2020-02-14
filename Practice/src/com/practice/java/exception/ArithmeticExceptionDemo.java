package com.practice.java.exception;

/**
 * @author Velmurugan Moorthy
 * A program to demo the use of the following blocks
 * * Try
 * * Catch
 * * Finally
 * * System.exit(0)
 */
public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        demoFinallyBlock();
        demoSystemExit();
    }

    /**
     * System.exit(0) will lead to
     * termination of program despite of any other code following
     */
    private static void demoSystemExit() {
        try{
            System.out.println("Hello "+ " " + (1/0) );
            System.out.println("Lot of other code after exception");
        }catch (ArithmeticException mathException){
            System.out.println("World!");
            System.exit(0);
        }
        finally {
            System.out.println("Inside finally block ");
        }
    }

    private static void demoFinallyBlock() {
        try{
            System.out.println("Lot of other code before exception");
            System.out.println("Hello "+ " " + (1/0) );
        }catch (ArithmeticException mathException){
            System.out.println("Exception occurred !");
        }
        finally {
            System.out.println("Inside finally block ");
        }
    }
}
