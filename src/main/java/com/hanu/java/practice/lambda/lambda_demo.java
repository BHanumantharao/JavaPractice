package com.hanu.java.practice.lambda;

import com.hanu.java.practice.Constants;

/**
 * @author Hanumantharao Bitragunta
 */

interface S {
    void print(String s);
//    void add(int a, int b);
}

/*class implcls implements S {
    @Override
    public void print(String s){
        System.out.println("\n \n Hey, "+s);
    }
}*/

public class lambda_demo {

    public static void main(String[] args) {
        // External forloop
        System.out.print("external for loop: ");
        for(int i = 0; i<= Constants.intList.size(); i++){
            System.out.print(" "+i);
        }

        System.out.print("\n external for-each loop: ");
        for (int i : Constants.intList) {
            System.out.print(" "+i);
        }


        // Internal for loop java-8
        System.out.print("\n Internal for loop - java8: ");
        Constants.intList.forEach(i -> System.out.print(" "+i));  // lambda expression

        S s;
//        S s1;
       /* s = new S(){
            @Override
            public void print(String s){
                System.out.print("\n \n Hello "+s);
            }
        };*/

        s = (str) -> { System.out.print("\n \n Hello "+str); };
//        s1 = (a, b) -> {System.out.print("\n addition "+a+b);};

        s.print("Hanu");
//        s1.add(1, 2);



    }

}
