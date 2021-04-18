package com.company.stream.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OperationStream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("korea", "japan", "china");

        //predicate는 boolean을 리턴하는 함수형 인터페이스로 평가식이들어가게 됩니다.

        //filter는 스트림내 요소중 평가식에 만족하는 요소만 골라 리턴합니다.
        Stream<String> stream = list.stream()
                .filter(n -> n.contains("ko"));

        System.out.println(Arrays.toString(stream.toArray()));

    }
}
