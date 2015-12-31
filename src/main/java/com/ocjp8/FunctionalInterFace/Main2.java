package com.ocjp8.FunctionalInterface;
import java.util.function.IntSupplier;

public class Main2 {
  public static void main (String[] args) {
    IntSupplier f = () -> {
        return 0;
    };
    System.out.println("value is " + f.getAsInt());
  }
} 