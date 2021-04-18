package com.company.stream.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStream {

    private List list;
    private Set set;
    private Collection collection;

    public static void main(String[] args) {

        //컬렉션 인터페이스들은 default 메소드인 stream()을 사용한다.
        List<String> list = Arrays.asList("a", "b", "c");

        //stream
        Stream<String> stringStream = list.stream();
        Stream<String> paralleStream = list.parallelStream();




    }
}
