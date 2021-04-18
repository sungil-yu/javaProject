package com.company.stream.primitytype;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ResultStream {

    public static void main(String[] args) {


        //스트림 API는 다양한 종료 작업을 제공합니다.
        //비어 있는경우 초기값을 출력한다.
        long count = IntStream.of(1, 3, 4, 5, 6)
                .count();

        System.out.println(count);

        int sum = IntStream.of(1, 4, 5, 76, 87)
                .sum();
        System.out.println(sum);

        //다만 평균, 최소, 최대는 초기값이 없기 때문에 Optional값을 리턴한다.

        OptionalInt optionalInt = IntStream.of().max();
        OptionalInt optionalInt2 = IntStream.of().min();

        //스트림에서 ifPresent를 사용하여 Optional 객체를 리턴할 수 있습니다.




        /* reduce는 3가지 인수를 받습니다.
         *
         * 1. accumulator : 각 요소를 처리하는 계산 로직입니다. 중간 결과를 생성
         * 2. identity : 계산을 위한 초기값으로 스트림이 비어서 계산할 내용이없더라도 해당 값은 리턴
         * 3. combiner : 병렬 스트림에서 동작하며, 계산한 결과를 하나로 합칩니다.
         *  */

        // 인자가 한개인 경우
        OptionalInt reduce = IntStream.range(1, 5)
                .reduce((a,b) -> {
                    return Integer.sum(a, b);
                });

        //2개를 받는 경우
        int reduceTwoParam =
                IntStream.range(1, 4)
                        .reduce(10, Integer::sum);

        System.out.println(reduceTwoParam);


        //3개를 받는 경우

        Integer reduceParallel = Arrays.asList(1, 2, 3, 4)
                .parallelStream()
                .reduce(10,
                        Integer::sum,
                        (a, b) -> {
                            System.out.println("combiner");
                            return a + b;
                        });

        //accumulator는 10+1 , 10+2 , 10+3, 10+4 4번 동작합니다.
        //identity는 초기값으로 10입니다.
        //combiner는 3번 동작합니다. 12 + 13 , 25 + 14 + 39 + 11
        System.out.println(reduceParallel);


        //병렬 스트림은 무조건 sequential보다 좋은 것은 아니다. 추가적인 부가처리가 필요하기 때문이다.


    }
}
