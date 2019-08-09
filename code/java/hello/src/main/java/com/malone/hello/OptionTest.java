package com.malone.hello;

import java.util.Optional;

public class OptionTest {


    public static void main(String[] args) {
        Person p =  new Person();
        p.setName("xxxx");

        User user1 = new User();
        user1.setName(Optional.ofNullable(p).map(s -> s.getName()).orElse(null));

        User user2 = null;
      //  user2.setName(Optional.of(user2.getName()).isPresent().orElse(null));


        Optional<String> opt = Optional.of("baeldung");
        opt.ifPresent(name -> System.out.println(name.length()));
        System.out.println("user1: "+ user1.getName());

        System.out.print("user2:"+ user2.getName());
    }
    static class User {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static  class Person {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
