package com.hanu.java.practice;

import com.hanu.java.practice.model.abc;
import com.hanu.java.practice.model.abcd;
import com.hanu.java.practice.model.abcde;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Hanumantharao Bitragunta
 */
public class optional_class_demo {

    public static void main(String[] args) {
        // TODO
/*
        //Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");
        //Optional.empty() creates an empty Optional object
        Optional<String> nothing = Optional.empty();
        System.out.println(GOT.map(String::toLowerCase));
        System.out.println(nothing.map(String::toLowerCase));
        Optional<Optional<String>> anotherOptional = Optional.of(Optional.of("BreakingBad"));
        System.out.println("Value of Optional object"+anotherOptional);
        System.out.println("Optional.map: "
                +anotherOptional.map(gender -> gender.map(String::toUpperCase)));
        //Optional<Optional<String>>    -> flatMap -> Optional<String>
        System.out.println("Optional.flatMap: "
                +anotherOptional.flatMap(gender -> gender.map(String::toUpperCase)));*/

        abcde abcde = new abcde();
        abcde.setAbcde1("abcde1");
        abcde.setAbcde2("abcde2");

        abcd abcd = new abcd();
        abcd.setAbcd1("abcd1");
        abcd.setAbcd2("abcd2");
//        abcd.setAbcde(abcde);

        abc abc = new abc();
//        abc.setAbc1("abc1");
        abc.setAbc2("abc2");
        abc.setAbcd(abcd);

        boolean res = Optional.ofNullable(abc.getAbc1()).isPresent();
        System.out.println(res);

        boolean resp  = Optional.ofNullable(abc).isPresent() &&
                        Optional.ofNullable(abc.getAbcd()).isPresent() &&
                        Optional.ofNullable(abc.getAbcd().getAbcde()).isPresent();

        System.out.println(resp);

        Stream.iterate(1, count->count+1)
                .filter(number->number%3==0)
                .limit(6)
                .forEach(System.out::println);
    }
}

