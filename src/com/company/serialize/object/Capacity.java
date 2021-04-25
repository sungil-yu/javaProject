package com.company.serialize.object;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Capacity {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectMapper objectMapper = new ObjectMapper();

        Member member = new Member("sung", "naver", 24, new ArrayList<Order>());

        ByteArrayOutputStream bais = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bais);

        oos.writeObject(member);

        byte[] serializeMember = bais.toByteArray();

        System.out.println(serializeMember);
        System.out.printf("serializedMember (byte size = %s) \n", serializeMember.length);

        ByteArrayInputStream baisInput = new ByteArrayInputStream(serializeMember);
        ObjectInputStream ois = new ObjectInputStream(baisInput);

        Object objectMember = ois.readObject();
        Member member1 = (Member) objectMember;
        //JSON 용량 체크
        String memberJson = objectMapper.writeValueAsString(member1);
        System.out.println(memberJson);
        System.out.printf("json (byte size = %s) \n", memberJson.getBytes(StandardCharsets.UTF_8).length);




    }
}
