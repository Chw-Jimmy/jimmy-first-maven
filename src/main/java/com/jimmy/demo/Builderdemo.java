package com.jimmy.demo;

import lombok.Builder;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/*
 *@author: Administrator
 *@DATE: 2021/5/22
 *@description
 */
@Setter
@ToString
@Builder
public class Builderdemo {
    private String name;
    private int age;
}
class test{
    public static void main(String[] args) {
        Builderdemo test = Builderdemo.builder()
                .age(1)
                .name("jimmy")
                .build();
        System.out.println(test);
    }
}