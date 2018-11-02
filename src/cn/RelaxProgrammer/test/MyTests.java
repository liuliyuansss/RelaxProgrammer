package cn.RelaxProgrammer.test;

import org.junit.Test;

import java.util.Random;

public class MyTests {
    @Test
    public void Tests1(){
        System.out.println("*************************************************************************************************");
        System.out.println("欢迎进入测试方法");
        int number=new Random().nextInt(10000);
        System.out.println(number);
    }
}
