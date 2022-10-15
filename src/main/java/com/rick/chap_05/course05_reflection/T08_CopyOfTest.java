package com.rick.chap_05.course05_reflection;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: Rick
 * @Date: 2022/10/15 08:40
 */
public class T08_CopyOfTest {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

    }


    /**
     * This method attempts to grow an array by allocating a new array and copying all elements
     * @param a the array to grow
     * @param newLength the new length
     * @return a larger array that contains all elements of a. However, the returned
     * array has type Object[], not the same type as a
     */
    public static Object[] badCopyOf(Object[] a, int newLength) { // not useful
        // 如果一开始是Object类型，则不能强转为Employee类型
        var newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }


    /**
     * This method grows an array by allocating a new array of the same type and
     * copying all elements
     * @param a the array to grow, This can be an object array or a primitive type array
     * @param newLength
     * @return a larger array that contains all elements of a
     */
    public static Object goodCopyOf(Object a, int newLength) {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, length);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }


}
