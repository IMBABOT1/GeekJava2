package ru.imbabot.lesson3.PhoneBook;

import java.util.List;

public class Person {

    private String name;
    private int phone;

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }


    public Person(String name, int phone){
        this.name = name;
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + phone * 31;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Person)){
            return false;
        }
        Person p = (Person) obj;

        return this.name.equals(p.name) && this.phone == p.phone;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", " + "Phone: " + phone;
    }
}
