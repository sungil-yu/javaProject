package com.company.arrays;

import java.util.Arrays;

public class Equals {

    public static void main(String[] args) {

        //전달받은 배열이 같은지?
        //객체인 경우 동일성과 동등성 비교는 차이가 있다.
        //동일성은 객체가 동일한지 ==
        //동등성은 객체의 속성값이 동일한지 equals

        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        //배열을 비교하기 위해서도 마찬가지며 equals는 주소 값이아닌 동등성만을 비교한다.
        //동일성 배열의 주소값은 서로 다르다.
        System.out.println(arr == arr2);

        //동등성 하지만 특정 속성의 값들은 동일하다.
        System.out.println(Arrays.equals(arr, arr2));


        //이것은 1차원 배열에만 해당된다 deepEquals은 다차원 배열에 대한 동등성 비교다.

        //java에서는 Object라는 클래스는 최상위  부모클래스여서 다음과 같이비교해도 될 것같지만 equals()를 오버라이드 하지않는다면 동등성을 보장하지 못한다.
        System.out.println(arr.equals(arr2));

        //다만 String literal과 new String은 메모리 주소공간의 차이이다.
        String a = "hi";
        String b = "hi";

        //주소공간이 같고
        System.out.println(a == b);

        //동등성 또한 같다.
        System.out.println(a.equals(b));

    }
}
