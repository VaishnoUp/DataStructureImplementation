package com.techno.datastructure.stacks.hackerRankProblems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindBalancePattern {
   
    static String isBalanced(String s) {
        int length = s.length();
        boolean check = false;
        int limit = length/2;
        int pointer1,pointer2;
        pointer1 = pointer2 = 0;
        if(length%2 == 0){
         for (int k = 0; k <length; k++) {
    if ((s.charAt(pointer1) == '{') || (s.charAt(pointer1) == '(') || (s.charAt(pointer1) == '[') && pointer2 <= length -1) {
     pointer1++;
    } else {
     pointer1 = pointer1 - 1;
     pointer2 = pointer1 * 2 + 1;
      
    }
    for (int i = pointer1; i <= pointer2; i++) {

     if ((s.charAt(pointer1) == '{' && s.charAt(pointer2) == '}')
       || (s.charAt(pointer1) == '[' && s.charAt(pointer2) == ']')
       || (s.charAt(pointer1) == '(' && s.charAt(pointer2) == ')') && pointer1 <= limit - 1) {

      if (pointer1 == limit - 1) {
       return "YES";
      }
      pointer1++;
      pointer2--;

     } else {
      return "NO";
     }
    } 
   }
           
        }else{
            return "NO";
        }
  return "NO";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}