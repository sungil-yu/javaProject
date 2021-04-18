package com.company.arrays;

import java.util.Arrays;

public class ToString {

    public static void main(String[] args) {

        //배열의 내용 출력

        int[] arr = {1, 2, 3,};
        //배열의 주소값을 스트링으로 출력
        System.out.println(arr.toString());

        //배열의 들어 있는 값을 알기 위해서는 Arrays.toString()을 사용

        System.out.println(Arrays.toString(arr));
    }
}
