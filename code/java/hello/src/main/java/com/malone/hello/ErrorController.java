package com.malone.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class ErrorController {

    @GetMapping("/make")
    public void error(){
       throw  new RuntimeException("I am exception !!!!!!!!");
    }
}
