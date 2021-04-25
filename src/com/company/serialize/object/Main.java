package com.company.serialize.object;

import java.io.*;
import java.util.Arrays;
import java.util.Base64;

public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //io 패키지의 ObjectOutputStream 객체를 사용합니다.

        Member member = new Member("신진이", "sincostan@naver.com", 42, Arrays.asList(new Order("test")));

        byte[] serializeMember;

        try(ByteArrayOutputStream baos = new ByteArrayOutputStream()){
            try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(member);
                serializeMember = baos.toByteArray();
                System.out.println("serialize된 Member객체 "  + serializeMember);
            }
        }
        //Base64로 인코딩된 바이트배열 객체
        System.out.println("Base64로 인코딩된 바이트배열 객체 " + Base64.getEncoder().encodeToString(serializeMember));


        //base64 디코딩
        String base64Member = Base64.getEncoder().encodeToString(serializeMember);
        serializeMember = Base64.getDecoder().decode(base64Member);


        ByteArrayInputStream bais = new ByteArrayInputStream(serializeMember);
        ObjectInputStream ois = new ObjectInputStream(bais);

        Object objectMember = ois.readObject();
        Member member1 = (Member) objectMember;

        System.out.println(member1);


    }
}
