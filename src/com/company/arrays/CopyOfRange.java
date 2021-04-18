package com.company.arrays;

import java.util.Arrays;

public class CopyOfRange {

    public static void main(String[] args) {

        //CopyOf는 from 이 0 으로 고정되기 때문에 복사할 원본배열의 시작위치를 정할 수 없지만
        //copyOfRange는 시작 부분과 끝 부분을 정하여 복사할 수 있다.

        int[] arr = {1, 2, 3, 4, 5};
        //copyOf 와 마찬가지로 초과될 경우 자료형에 맞게 초기값이 들어간다.
        int[] arr2 = Arrays.copyOfRange(arr, 1, 6);

        for (int i : arr2) {
            System.out.println(i);
        }


    }
}
