package com.company.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BinarySearch {

    public static void main(String[] args) {

        //java.util 패키지에 존재함으로 import 필요

        //Arrays 클래스는 배열을 다루기위한 유용한 메서드들이존재 첫번 째 Binary Search

        int arr[] = new int[100];

        //오름차순으로 초기화  이진탐색은 오름차순이 필요
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }


        //메소드 설명중 두번 째 파라미터는 찾고 싶은 값이라고 되어 있음.  해당 값이있는 인덱스를 반환해주는 것
        int result =Arrays.binarySearch(arr, 30);

        System.out.println(result);
        System.out.println(arr[result]);

        //30번째 인덱스의 값을 원함. test



        //만약 정렬 되어 있지 않다면?

        Random random = new Random();
        Integer arr2[] = new Integer[100];

        //0이상 100이하의 난수 발생
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(100);
        }

        //강제로 20이라는 값을 삽입
        arr2[99] = 20;

        int result2 = Arrays.binarySearch(arr2, 20);

        // 99를 반환해야함.
        System.out.println(result2);

        //그 값은 20을 출력해야함
        System.out.println(arr2[result2]);

        //test 결과 에러 발생
     }


}
