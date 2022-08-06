package ru.imbabot.lesson3.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private HashMap<String, List<Person>> map;

    public PhoneBook(){
        map = new HashMap<>();
    }

    void add(Person p){
        List<Person> list = map.get(p.getName());
        if (list == null){
            list = new ArrayList<>();
            map.put(p.getName(), list);
        }
        list.add(p);
    }

    List get(String name){
        List<Person> list = new ArrayList<>();
        for (Map.Entry<String, List<Person>> map1 : map.entrySet()){
            if (map1.getKey().equals(name)){
                list = map1.getValue();
            }
        }
        return list;
    }
}
