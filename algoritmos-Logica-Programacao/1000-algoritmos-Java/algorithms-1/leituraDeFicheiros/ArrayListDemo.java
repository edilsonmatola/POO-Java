package com.tutorialspoint;

import java.util.ArrayList;

public class ArrayListDemo {
   public static void main(String[] args) {

      // create an empty array list with an initial capacity
      ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

      // use add() method to add elements in the list
      arrlist.add(15, 15);
      arrlist.add(22, 22);
      arrlist.add(30, 30);
      arrlist.add(40, 40);

      // adding element 25 at third position
      arrlist.add(2, 25);

      // let us print all the elements available in list
      for (Integer number : arrlist) {
         System.out.println("Number = " + number);
      }  
   }
}