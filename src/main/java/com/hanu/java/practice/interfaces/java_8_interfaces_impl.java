package com.hanu.java.practice.interfaces;

/**
 * @author Hanumantharao Bitragunta
 */
public class java_8_interfaces_impl implements java_8_interfaces, java_8_interface_2 {


    /*
    *  Third rule: when a class implements two interfaces where both have common method
    *  we should override & the overridden method only will execute first
    *  because class level methods have high priority, then default methods have low priority.
    *
    * */
    @Override
    public void SayGreeting() {
        // Overridden method
        System.out.println("class level overridden default method");
    }

    // we can use same method name but we can't override this from Interface
    private static void SayBye() {
        System.out.println("class level static method");
    }

    public static void main(String[] args) {
        java_8_interfaces_impl impl = new java_8_interfaces_impl();
        impl.welcome();
        impl.SayGreeting();

        java_8_interfaces_impl.SayBye();


        java_8_interfaces.SayBye();
    }
}
