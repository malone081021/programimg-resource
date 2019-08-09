package com.malone.hello;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.malone.hello")
//@MapperScan({"com.malone.hello.mapper","com.malone.hello.customer.mapper"})
@MapperScan({"com.malone.hello.mapper"})
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

}
