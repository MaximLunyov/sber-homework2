package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[10];

        array[0] = "Hello";
        array[1] = "World";
        array[2] = "Java";
        array[3] = "Hello";
        array[4] = "World";
        array[5] = "Learning";
        array[6] = "Development";
        array[7] = "Skills";
        array[8] = "Codding";
        array[9] = "Skills";

        Map<String, Integer> map = new HashMap<>();

        for (String s : array) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        System.out.println(map);
        System.out.println("");

        PhoneDirectory directory = new PhoneDirectory();
        directory.add("Петров", 889231832);
        directory.add("Иванов", 231345324);
        directory.add("Петров", 32131232);

        directory.get("Петров");

    }
}