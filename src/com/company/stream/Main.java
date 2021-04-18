package com.company.stream;

import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {

        //Stream Builder를 통해 해당 스트림에 원하는 값을 직접 넣을 수 있다.

        Stream<String> stringStream = Stream.<String>builder()
                .add("a")
                .add("b")
                .build();

        //Stream generate() 는 Supplier<T>에 해당하는 람다로 값을 넣을 수 있다.
        //Supplier 인자는 없고 리턴값만 있는 함수형 인터페이스 이다.
        Stream<String> stream = Stream.generate(() -> {
            return "gen";
        }).limit(10);
        //이때 생성되는 Stream 크기는 무한하기 때문에 limit메소드로 크기를 지정해 중야 한다.


        //Stream iterate()메소드는 초기 값과 초기 값을 다루는 람다를 이용해 스트림을 생성합니다.

        Stream<Integer> integerStream = Stream.iterate(10, n -> n + 1).limit(10);





    }
}
