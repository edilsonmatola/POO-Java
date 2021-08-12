package com.ashok.sample;
 
import java.util.Arrays;
 
public class Test {
   public static void main(String[] args) {
      String[] testArray = { "Hai", "This", "is", "Ashok" };
      String str = Arrays.toString(testArray);
      str = str.substring(1, str.length()-1).replace(",", "");
      System.out.println(str);
   }
}
 