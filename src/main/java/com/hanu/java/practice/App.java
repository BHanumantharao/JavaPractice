package com.hanu.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{


    public static void main( String[] args )
    {
        List<Integer> list = new ArrayList<Integer>();
        Collections.frequency(list, 1);
        System.out.println( "Hello World!" );
    }
}
