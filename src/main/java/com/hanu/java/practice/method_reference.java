package com.hanu.java.practice;

/**
 * @author Hanumantharao Bitragunta
 */

interface myInter {
    static void printStr(String s){
        System.out.println("\t"+s);
    }
    default void greet(String str){
        System.out.println("\t Hello "+str);
    }
    void genEmail(String str);
}

class myInterImpl implements myInter {

    @Override
    public void genEmail(String name){
        System.out.println(name+"@gmail.com");
    }
}

public class method_reference {

    public static void main(String[] args) {


        // call by value
        for(String s : Constants.stringList){
            System.out.print("\t"+s);
        }
        // call by Method
        Constants.stringList.forEach(System.out::println);

        Constants.intList.forEach(System.out::print);

        // static methods should call with class name
        Constants.stringList.forEach(myInter::printStr);

        // non-static methods will access with object name
        myInterImpl impl = new myInterImpl();
        Constants.stringList.forEach(impl::greet);
        Constants.stringList.forEach(impl::genEmail);
    }
}
