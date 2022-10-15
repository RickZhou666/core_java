package com.rick.chap_05.course05_reflection;

import org.junit.Test;

import java.net.URL;
import java.util.Random;

/**
 * @Author: Rick
 * @Date: 2022/10/14 09:47
 */
public class T02_Resource {

    @Test
    public void getResource(){
        Class cl = Random.class;
        URL url = cl.getResource("about.gif");
    }
}
