package org.java_gyan.collections.treeset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetVsTreeSet {

    public static void main(String[] args) {
        HashSet hashSet=new HashSet<>();
        TreeSet treeSet=new TreeSet();
        treeSet.add(12);
        treeSet.add(22);
        treeSet.add(32);
        treeSet.add(2);

        hashSet.add(12);
        hashSet.add(22);
        hashSet.add(32);
        hashSet.add(2);



        System.out.println(hashSet);
        System.out.println(treeSet);

        Object higher = treeSet.higher(22);
        System.out.println(higher);
        System.out.println("floor "+treeSet.floor(13));
        System.out.println("ceiling "+treeSet.ceiling(11));
        System.out.println(treeSet.headSet(22));

    }
}
