package com.company.stream.util;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamConcat {

    public static void main(String[] args) {

        //두개의 스트림을 concat을 통해 연결할 수있다.

        Stream<String> stream1 = Stream.of("Java", "HTML", "CSS");
        Stream<String> stream2 = Stream.of("JavaScript", "React", "Spring");

        Stream<String> concat = Stream.concat(stream1, stream2);

        System.out.println(Arrays.toString(concat.toArray()));

    }
}
