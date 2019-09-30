package com.malone.hello.io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream("你好".getBytes());

        StringBuilder textBuilder = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader
                (inputStream, Charset.forName(StandardCharsets.UTF_8.name())))) {
            int c = 0;
            while ((c = reader.read()) != -1) {
                textBuilder.append((char) c);
            }
        }
        System.out.println(textBuilder.toString());
    }
}
