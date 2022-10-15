package com.rick.chap_05.course05_reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * This program shows how to invoke methods through reflection
 *
 * @Author: Rick
 * @Date: 2022/10/15 09:20
 */
public class T09_MethodTableTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method square = T09_MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    public static double square(double x) {
        return x * x;
    }

    public static void printTable(double from, double to, int n, Method f) throws InvocationTargetException, IllegalAccessException {
        System.out.println(f);

        double dx = (to - from) / (n - 1);
        for (double x = from; x <= to; x += dx) {
            double y = (double) f.invoke(null, x);

            /*
            *   %10.4f 保留小数点前10位，小数点后4位的long
            *   %n，行分隔符
            * */
            System.out.printf("%10.4f | %10.4f%n", x, y);
        }
    }
}
