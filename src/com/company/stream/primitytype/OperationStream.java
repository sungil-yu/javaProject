package com.company.stream.primitytype;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperationStream {
    public static void main(String[] args) {

        //sorting

        //Comparator를 이용하며 인자없이 호출시 오름차순기준

        List<Integer> list = IntStream.of(5, 21, 321, 512, 2)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        System.out.println(list);


        //peek메소드는 Consumer를 인자로 받으며 Consumer는 특정 결과를 반환하지 않는함수형 인터페이스이다.
        int sum = IntStream.of(5, 21, 321, 512, 2)
                .peek(System.out::println)
                .sum();

        System.out.println(sum);

    }
}
