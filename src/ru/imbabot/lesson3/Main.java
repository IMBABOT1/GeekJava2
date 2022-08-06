package ru.imbabot.lesson3;

import java.util.*;

public class Main {

    private static String[] words = new String[]{
            "a", "a", "a", "b", "b", "c", "d", "e", "f", "f", "g", "g", "z", "z", "x", "x"
    };

    private static Map wordsCount(){
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])){
                map.put(words[i], 1);
            }else if (map.containsKey(words[i])){
                map.put(words[i], map.get(words[i]) + 1);
            }
        }
        return map;
    }
    private static Set uniqueWords(){
        Set<String> set = new HashSet<>();
        for (int i = 0; i <words.length ; i++) {
            set.add(words[i]);
        }
        return set;
    }

    private static void countUniqueWords(){
        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length ; j++) {
                if (words[i].equalsIgnoreCase(words[j])){
                    count++;
                    words[j] = "";
                }
            }
            if (count == 1 && words[i] != ""){
                System.out.println(words[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(uniqueWords());
        System.out.println(wordsCount());
    }
}
