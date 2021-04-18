package com.company.arrays;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class AsList {

    public static void main(String[] args) {

        String[] str = {"abc", "def", "ghi"};
        //이때 반환값은 java.util.ArrayList가 아닌 java.util.Arrays.ArrayList이다
        List<String> as = Arrays.asList(str);

        //주소값을 복사하여 List타입의 배열을 생성하는 것같음. : List인터페이스의 기능을 이용하기 위해
        as.set(1, "gi");
        as.get(1);
        System.out.println(Arrays.toString(str));
        System.out.println(as);
        
        //원본 배열도 동일하게 수정이됨


    }
}
