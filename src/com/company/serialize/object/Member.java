package com.company.serialize.object;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.List;


//Serializable 인터페이스를 상속받은 객체는 직렬화할 수 있는 기본 조건을 가짐.
public class Member implements Serializable {

    private String name;
    private String email;
    private int age;
    private List<Order> orderList;
    public Member() {
    }

    public Member(String name, String email, int age, List<Order> orderList) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", orderList=" + orderList +
                '}';
    }
}
