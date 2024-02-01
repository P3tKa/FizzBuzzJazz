package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            StringBuilder output = new StringBuilder();
            if (i % 3 == 0) {
                output.append("Fizz");
            }
            if (i % 5 == 0) {
                output.append("Buzz");
            }
            if (i % 7 == 0) {
                output.append("Jazz");
            }

            if (output.length() != 0) {
                result.add(output.toString());
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 20;
        List<String> result = fizzBuzz(n);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
