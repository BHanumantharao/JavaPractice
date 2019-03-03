package com.hanu.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Hanumantharao Bitraguntamvn
 */
public class Imperative_vs_declarative {

    public static void main(String[] args) {

        /*
         * Imperative Programming:   (what to do & how to do)
         *   you tell the compiler what you want to happen, step by step.
         *
         * */

        // Step - 1 : creating a result intList
        List<Integer> results = new ArrayList<>();
        // Step - 2: step through each number of intList
        for (int i : Constants.intList) {
            // step - 3 : Check the each number, if its even or add to add to list
            if (i % 2 == 0) {
                results.add(i);
            }
        }

        System.out.println("## Imperative result(even): " + results);

        // removing all elements in list (note required actually)
        results.removeAll(results);

        /*
         * Declarative Programming:    (what to do)
         *       you write code that describes what you want,
         *       but not necessarily how to get it (declare your desired results, but not the step-by-step):
         *
         * */

        results = Constants.intList.stream()             // lambda expression
                            .filter(num -> num % 2 != 0)
                            .collect(Collectors.toList());

        System.out.println("## Declarative result(odd): " + results);
    }
}
