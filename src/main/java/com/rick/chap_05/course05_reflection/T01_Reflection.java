package com.rick.chap_05.course05_reflection;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

/**
 * @Author: Rick
 * @Date: 2022/10/13 22:56
 */
public class T01_Reflection {


    @Test
    public void getClassName1() {
        Random rand = new Random();
        Class cl = rand.getClass();
        System.out.println(cl);
        System.out.println(cl.getName());
    }

    @Test
    public void getClassName2() throws ClassNotFoundException {
        String className = "java.util.Random";
        Class cl = Class.forName(className);
        System.out.println(cl);
    }

    @Test
    public void getClassName3() {
        Class cl1 = Random.class;
        Class cl2 = int.class;
        Class cl3 = Double[].class;
        Class cl4 = int[].class;
        System.out.println(cl1 + "\n"
                + cl2 + "\n"
                + cl3 + "\n"
                + cl4);
    }

    @Test
    public void getConstructor() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        var className = "java.util.Random";
        Class cl = Class.forName(className);
        Object obj = cl.getConstructor().newInstance();
        System.out.println(obj);
    }


}
