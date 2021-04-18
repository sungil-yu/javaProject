package com.company.stream.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperationStream {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        //map은 값을 변환하기 위해 람다를 인자로 받는다.
        //새로운 스트림을 전달 받게 된다.
        Stream<String> stream = list.stream()
                .map(String::toLowerCase);
        System.out.println(Arrays.toString(stream.toArray()));


        //flat 맵은 중첩 구조를 제거할 수 있다.
        List<Student> students = new ArrayList<>();

        students.add(new Student(30, 40, 50));
        students.add(new Student(50, 44, 30));
        students.add(new Student(30, 20, 10));

        //학생 리스트를 가진 스트림을 생성
        students.stream()
                .flatMapToInt(student -> IntStream.of(student.getEng(), student.getKor(), student.getMath()))
                .average()
                .ifPresent(avg ->
                        System.out.println(Math.round(avg * 10)/10.0));
    }
}
