package org.java_gyan;

import java.time.LocalDate;
import java.util.function.Predicate;

public class TestApp {

   public int value;

   public int hashCode()
   {
       return value^5;
   }

    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
    }
}

