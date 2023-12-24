package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private final Map<String, List<Long>> list = new HashMap<>();

    public void add(String lastName, long number) {
        if (list.get(lastName) != null) {
            if (!list.get(lastName).contains(number)) {
                list.get(lastName).add(number);
            }
        } else {
            List<Long> numberList = new ArrayList<>();
            numberList.add(number);
            list.put(lastName, numberList);
        }

    }

    public void get(String lastName) {
        System.out.println(list.get(lastName));
    }
}
