package com.company.stream.primitytype;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        //int
        IntStream intStream = IntStream.range(1, 5); //{1,2,3,4}
        IntStream intStreamClosed = IntStream.rangeClosed(1, 5); //{1,2,3,4,5}

        //long
        LongStream longStream = LongStream.<Long>builder()
                .add(3L)
                .build();

        //double
        DoubleStream doubleStream = DoubleStream.generate(() -> 3.0).limit(10);


        //불필요한 오토박싱이 일어나지 않습니다.
        //필요한 경우 boxed()메소드를 통하여 오토박싱을 할 수 있습니다.

        Stream<Integer> stream = intStream.boxed();



    }
}
