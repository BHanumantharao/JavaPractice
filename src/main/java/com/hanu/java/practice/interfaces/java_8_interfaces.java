package com.hanu.java.practice.interfaces;

/**
 * @author Hanumantharao Bitragunta
 */
public interface java_8_interfaces {

    // Java - 7
    // all methods in interfaces all are - public abstract
    // we can declare methods but couldn't define methods



    // Java - 8
    // we can declare & define methods

    /*
     *   If you have any method in this interface which overrides 'object' class, It will causes error
     *   ex: equalss
     *   default void equals(Object o){}
     *   Default method 'equals' overrides a member of 'java.lang.Object'
     *
     *   but it works with as abstract method
     *   ex: boolean equals();
     * */

    /*
     *  1) Default methods can be overridden in implementing class, while static cannot.
     *  2) Static method belongs only to Interface class,
     *       so you can only invoke static method on Interface class, not on class implementing this Interface
     *   3) Both class and interface can have static methods with same names, and neither overrides other!
     *
     * */

    /*
        static method in interface:
            You can call it directly (ex: java-8_interfaces.staticMethod())
            Sub-class will not be able to override.
            Sub-class may have method with same name as staticMethod

        Default method in interface:
            You can not call it directly.
            Sub-class will be able to override it

        Advantage:
            static Method: You don't need to create separate class for utility method.
            default Method: Provide the common functionality in default method.
    */

    default void welcome(){ System.out.println("Hey, Welcome to Java8 new feature default method !!"); }

    default void SayGreeting(){ System.out.println("Hey flocks !! \n This is Java 8 'default' method from Interface !"); }

    static void SayBye() {
        System.out.println("Hey flocks !! \n This is Java 8 'static' method from Interface !");
    }

}
