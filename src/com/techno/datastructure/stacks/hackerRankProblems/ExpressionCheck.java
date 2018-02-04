package com.techno.datastructure.stacks.hackerRankProblems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExpressionCheck {
 int stackPointer,size;
 char[] stackArray;
 
 public ExpressionCheck(int size){
  this.size = size;
  stackPointer = -1;
  stackArray = new char[size];
 }
 
 public void push(char c){
  if(stackPointer == size-1){
   System.out.println("stack is full....overflow");
  }else{
   stackPointer ++;
   stackArray[stackPointer] = c;
  }
 }
 
 public void pop(){
  if(stackPointer == -1){
   System.out.println("stack is empty....underflow");
  }else{
   stackArray[stackPointer] = '\0';
   stackPointer = stackPointer -1;
  }
  
 }
   
    static String isBalanced(String s) {
     ExpressionCheck sol = new ExpressionCheck(s.length());
     if(s != null){
      int length = s.length();
      if (length % 2 == 0) {
    for (int i = 0; i < length; i++) {
     if(((s.charAt(i) == '}') || (s.charAt(i) == ')') || (s.charAt(i) == ']')) && sol.stackPointer == -1){
      return "NO";
     }
     if ((s.charAt(i) == '{') || (s.charAt(i) == '(') || (s.charAt(i) == '[')) {
      sol.push(s.charAt(i));
     } else {
      if ((s.charAt(i) == '}') && (sol.stackArray[sol.stackPointer]) == '{') {
       sol.pop();
      } else if ((s.charAt(i) == ')') && (sol.stackArray[sol.stackPointer]) == '(') {
       sol.pop();
      } else if ((s.charAt(i) == ']') && (sol.stackArray[sol.stackPointer] == '[')) {
       sol.pop();
      }
     }
    }
    if(sol.stackPointer == -1){
     return "YES";
    }
   }
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