package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
        a = hw.Method3(5, -1, 1);
        a = hw.Method3(6, 1, 1);
        a = hw.Method3(4, 1, 1);
        a = hw.Method3(4, 1, -3);
        a = hw.Method3(4, 1, -1);
        a = hw.Method3(5, 1, -3);
        a = hw.Method3(6, 1, -3);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4()
    {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0, 0, 0, 0, 0);
        a = hw.Method4(1, 1, 0, 0, 0);
        a = hw.Method4(5, 5, 0, 1, 0);
        a = hw.Method4(1, 1, 0, 1, 0);
        a = hw.Method4(5, 5, 0, 0, 0);
        a = hw.Method4(5, 1, 0, 0, 0);
    }

    @Test
    public void testisTriangle()
    {
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isTriangle(0, 1, 1);
        a = hw.isTriangle(1, 0, 1);
        a = hw.isTriangle(1, 1, 0);
        a = hw.isTriangle(0, 0, 1);
        a = hw.isTriangle(0, 1, 0);
        a = hw.isTriangle(1, 0, 0);
        a = hw.isTriangle(0, 0, 0);
        a = hw.isTriangle(1, 1, 1);
        a = hw.isTriangle(2, 1, 1);
        a = hw.isTriangle(1, 2, 1);
        a = hw.isTriangle(1, 1, 2);
    }
    @Test
    public void testisBirthday() {
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isBirthday(1989, 1, 1);
        a = hw.isBirthday(2019, 10, 2);
        a = hw.isBirthday(2019, 10, 1);
        a = hw.isBirthday(1990, 13, 1);
        a = hw.isBirthday(1990, 0, 1);
        a = hw.isBirthday(1990, 8, 0);
        a = hw.isBirthday(1990, 8, 31);
        a = hw.isBirthday(1990, 6, 31);
        a = hw.isBirthday(2019, 11, 1);
        a = hw.isBirthday(2019, 0, 1);
        a = hw.isBirthday(2019, 8, 0);
        a = hw.isBirthday(2019, 8, 31);
        a = hw.isBirthday(2019, 6, 31);
    }
    @Test
    public void testminiCalculator() {
        HelloWorld hw = new HelloWorld();
        double a = hw.miniCalculator(1, 1, '+');
        a = hw.miniCalculator(1, 1, '-');
        a = hw.miniCalculator(1, 1, '*');
        a = hw.miniCalculator(1, 0, '/');
        a = hw.miniCalculator(1, 1, '/');
        a = hw.miniCalculator(1, 1, '&');
    }
}
