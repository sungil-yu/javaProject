package com.company.stream.collection;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ResultStream {

    public static void main(String[] args) {

        //Collector 타입의 인자를 받아 처리하는 collect는 또다른 종료 메소드입니다.

        List<Student> studentList = Arrays.asList(
                new Student(20, 30, 40),
                new Student(60, 30, 40),
                new Student(10, 30, 40),
                new Student(40, 30, 40)
        );


        //스트림에서 작업한 결과를 담은 리스트로 반환
        List<Integer> korList = studentList
                .stream()
                .map(student -> student.getKor()) //학생 국어점수만  뽑은 스트림을 반환하고
                .collect(Collectors.toList()); // 해당 스트림은 list형태로 만들고 종료시킨다.

        System.out.println(korList);


        //joining을 통해 하나의 스트링으로 이어 붙일 수도 있다.

        String joining = studentList
                .stream()
                .map(st -> String.valueOf(st.getEng()))
                .collect(Collectors.joining(",", "<", ">"));

        System.out.println(joining);

        //숫자로 할수 있는 평균 최대 등 한번에 객체를 리턴해주는 summarizingInt()가 존재합니다.

        IntSummaryStatistics summaryStatistics =
                studentList
                        .stream()
                        .collect(Collectors.summarizingInt(Student::getKor));

        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getAverage());
        System.out.println(summaryStatistics.getCount());
        System.out.println(summaryStatistics.getMin());


    }
}
