package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList <String> list = new ArrayList();
        Collections.addAll(list, "мама", "мыла", "раму");
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) list.add(i + 1, "именно");
            System.out.println(list.get(i));
        }
    }
}
