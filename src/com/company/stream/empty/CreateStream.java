package com.company.stream.empty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {

        //왜 비어져 있는 스트림이 필요할 까?
        //요소가 없을 때 null 대신 사용가능하다.

        List<String> list = new ArrayList<>();

        Stream<String> stream =  emptyStream(list);


    }

    public static Stream<String> emptyStream(List<String> list) {

        return list.isEmpty() ? Stream.empty() : list.stream();

    }
}
