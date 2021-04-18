package com.company.arrays;

import java.util.Arrays;
import java.util.Random;

public class CopyOf {


    public static void main(String[] args) {

        Random random = new Random();


        //새로운 배열을 생성 즉 동일성이 다르다.
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        int[] arr2 = Arrays.copyOf(arr, arr.length);

        boolean arrEqual = arr == arr2;
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arrEqual);

        // copyOf 는 1.6에 추가 및 만약 지정된 범위가 파라미터로 넘겨진 배열보다 값이 크다면 배열 요소 타입에 맞게 기본값으로 채워짐

        //expect 30으로 지정하고 21~30까지는  0으로 채워져야함.

        int arr3[] = Arrays.copyOf(arr, 30);

        for (int i : arr3) {
            System.out.println(i);
        }


    }
}
