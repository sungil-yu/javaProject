package com.company.stream.file;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) throws IOException {

        //해당 파일의 각 라인을 스트링 타입의 스트림으로 만들어 줍니다.
        Stream<String> stream = Files.lines(Paths.get("text.txt"), StandardCharsets.UTF_8);


    }
}
