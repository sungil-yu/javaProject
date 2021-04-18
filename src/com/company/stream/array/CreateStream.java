package com.company.stream.array;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        //일반적인 배열 스트림을 만든다.
        String[] str = {"a", "b", "c"};

        Stream<String> stringStream = Arrays.stream(str);
        Stream<String> stringStreamOfRange = Arrays.stream(str,0,1);




    }
}
