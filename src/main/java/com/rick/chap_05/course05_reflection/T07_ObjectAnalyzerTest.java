package com.rick.chap_05.course05_reflection;

import java.util.ArrayList;

/**
 * @Author: Rick
 * @Date: 2022/10/14 17:09
 */
public class T07_ObjectAnalyzerTest {

    public static void main(String[] args) throws IllegalAccessException {
        var squares = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            squares.add(i * i);
        }
        System.out.println(new T06_ObjectAnalyzer().toString(squares));
    }


}
