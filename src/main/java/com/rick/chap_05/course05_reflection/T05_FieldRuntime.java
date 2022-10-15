package com.rick.chap_05.course05_reflection;

import com.rick.util.Emploee.Employee;

import java.lang.reflect.Field;

/**
 * @Author: Rick
 * @Date: 2022/10/14 16:32
 */
public class T05_FieldRuntime {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        var harry = new Employee("Harry Hacker", 50_000, 10, 1, 1989);
        Class cl = harry.getClass();
        // the class object representing Employee
        Field f = cl.getDeclaredField("name");
        // the name field of the Employee class
        f.setAccessible(true);
        Object v = f.get(harry);
        System.out.println(v);

        f.set(harry, "Rick Morty");
        System.out.println(harry.toString());
        // the value of the name field of the harry object, i.e.
        // the String object "Harry Hacker"
    }
}
