package com.jimmy.demo;

import lombok.val;
import lombok.var;

import java.util.ArrayList;

/*
 *@authur: Administrator
 *@DATE: 2021/5/22
 *@description
 */
public class demo {
    public static void main(String[] args) {
        val testVal = new ArrayList<String>();
//        val 定义之后为常量，不能再次修改
        testVal.add("this is val");
        System.out.println(testVal);
        var testVar = new ArrayList<String>();
        testVar.add("this is var");
        System.out.println(testVar);
        Model model = new Model();
        model.setAge(10);
        int a = model.getAge();
        System.out.println(a);
    }
}
