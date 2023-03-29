package org.java_gyan.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        List<Integer> copyListUsingCollections= new ArrayList<>(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        /*
        method1
         */
        List copyList=new ArrayList<>(list);
        System.out.println(list);
        System.out.println(copyList);

         /*
        method2
         */
        Collections.copy(copyListUsingCollections,list);
        System.out.println(list);
        System.out.println(copyListUsingCollections);


    }
}
