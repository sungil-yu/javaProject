package com.company.arrays;

import java.util.Arrays;

public class Fill {

    public static void main(String[] args) {

        //전달 받은 모든 배열의 모든 요소를 특정값으로 초기화 시켜준다.
        int arr[] = new int[10];
        Arrays.fill(arr,3);

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
