package com.hanu.java.practice.lambda;

import com.hanu.java.practice.Constants;

/**
 * @author Hanumantharao Bitragunta
 */

/*class consumerimple implements Consumer<Integer> {

    @Override
    public void accept(Integer i) {
        System.out.print(i);
    }
}*/

public class consumer_i_lambda {
    public static void main(String[] args) {
        /* # Imperative */
//        consumerimple impl = new consumerimple();
//        impl.accept(1);

        /* Declarative */
         /*Consumer consu = new Consumer<Integer>() {
             @Override
             public void accept(Integer i) {
                 System.out.print(i);
             }
         };
        Constants.intList.forEach(consu); */


        /*Consumer<Integer> consu = (Integer i) -> { System.out.print(i); };
        Constants.intList.forEach(consu);*/

        Constants.intList.forEach(i -> { System.out.print(" "+i); });

    }

}
