package org.example;

public class Main {
    public static void main(String[] args) {

        String[] a = {
                "hi", "welcome", "goodbye", "hello", "a", "c", "greetings",
                "j", "b", "s", "d", "f", "hello", "hi", "hello",
                "y", "t", "r", "e", "w", "q", "a", "v",
                "s", "c", "p", "i", "b", "m", "k"
        };

        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("hello")) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The first occurrence of the string \"hello\" is at index: " + index);
        } else {
            System.out.println("The string \"hello\" is not found in the array.");
        }

    }
}