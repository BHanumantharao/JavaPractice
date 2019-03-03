package com.hanu.java.practice.streams;

import com.hanu.java.practice.Constants;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Hanumantharao Bitragunta
 */
public class streams_demo {

    // A Stream is a pipeline of functions that can be evaluated

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        /*
        *   1. Map - map to intList
        *   2. Filter - filter the data
        *   3. Sorted - sort the data
        *
        * */


        /*
        *   map: The map method is used to map the items in the intList
        *       to other objects according to the Predicate passed as argument.
        * */
        List squares = intList.stream()             // creating stream
                                .map(i -> i*i)      // generate square
                                .collect(Collectors.toList());  // collect the result as list
        System.out.println(squares); // o/p - [1, 4, 9, 16, 25, 36, 49, 64, 81]


        /*
        *  filter: The filter method is used to select elements as per the Predicate passed as argument.
        *
        * */

        List filteredData = Constants.stringList.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());
        System.out.println("Names list after filter which start with A: "+filteredData);


        /*
        *   sorted: The sorted method is used to sort the stream.
        *
        * */
        List sortedList = Constants.stringList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list: "+sortedList);

        /*
        *   1. A stream consists of source followed by zero or more intermediate methods combined together (pipelined) and
        *       a terminal method to process the objects obtained from the source as per the methods described.
        *   2. Stream is used to compute elements as per the pipelined methods without altering the original value of the object.
        * */

    }
}
