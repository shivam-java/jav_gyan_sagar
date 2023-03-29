package org.java_gyan.miscellenous;

import java.util.Arrays;

public class MainMethodOverLoading
{
    public static void main(String[] args) {
        System.out.println("actual method main");
        main(new char[1]);
    }
    public static void main(int[] args){

        System.out.println("Overloaded Integer array Main Method");

    }

    public static void main(char[] args){

        System.out.println("Overloaded Character array Main Method "+ Arrays.toString(args));

    }

    public static int main(double[] args){

        System.out.println("Overloaded Double array Main Method");
           return 0;
    }

    public static void main(float args){

        System.out.println("Overloaded float Main Method");

    }
}
