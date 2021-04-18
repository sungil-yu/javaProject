package com.company.arrays;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        //sort 메소드는 전달받은 배열을 오름차순으로 정렬하여 리턴합니다.
        //이 메소드는 원본 배열을 수정합니다. **
        String[] arr = {"ㄱ", "ㄷ", "ㄴ"};

        System.out.println(arr);
        //return 값은 따로 존재하지 않는다.
        Arrays.sort(arr);

    }
}
