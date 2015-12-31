package com.ocjp8.FunctionalInterface;

public class Main1 {
  public static void main (String[] args) {
    MyFunctionalInterface f = (x) -> {
        System.out.println("value is " + x);
    };
    f.method(10);
  }
} 