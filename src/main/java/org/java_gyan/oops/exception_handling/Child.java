package org.java_gyan.oops.exception_handling;

public class Child extends Parent
{
    @Override
    void m1() throws Exception
    {
        super.m1();
    }

    @Override
    void m2() {
        System.out.println("i am from child class");
    }
}
