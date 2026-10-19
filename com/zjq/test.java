package com.zjq;

/**
 * @Author: ZJQ
 * @DateTime: 2026/9/24 23:26
 **/
public class test {
    static int i = 0;
    public static void main(String[] args) {
        System.out.println(getNumber());
        System.out.println(i);
    }

    static int getNumber() {
        for (int j = 0; j < 10; j++) {
            i++;
        }
        return i++;
    }
}

class A {
    static {
        System.out.println("A");
    }
    A() {
        System.out.println("B");
    }
    {
        System.out.println("C");
    }
}
