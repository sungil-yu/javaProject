package com.company.arrays;

import java.util.Arrays;

public class DeepEquals {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {1, 2, 3}};
        int[][] arr2 = {{1, 2, 3}, {1, 2, 3}};


        //차이점은 다음과 같다. 다차원 배열을 동등성 비교를 할 경우 발생

        //물론 메모리 주소값은 다르다.
        System.out.println(arr == arr2);

        System.out.println(Arrays.equals(arr, arr2));
        System.out.println(Arrays.deepEquals(arr, arr2));

    }
}
