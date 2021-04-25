package com.company.serialize.file.inputstream;

import java.io.*;
import java.net.URI;
import java.nio.file.Path;
import java.util.Arrays;

public class ExampleInputStream {

    public static void main(String[] args) {

        try {
            String path = ExampleInputStream.class.getResource("").getPath();
            System.out.println(path);

            BufferedReader reader = new BufferedReader(new FileReader(path+File.separator+"text.txt"));

            String str = reader.readLine();
            System.out.println(str.contains("\n"));

            BufferedReader si = new BufferedReader(new InputStreamReader(System.in));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
