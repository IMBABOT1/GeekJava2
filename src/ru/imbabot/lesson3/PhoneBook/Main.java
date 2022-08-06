package ru.imbabot.lesson3.PhoneBook;

public class Main {

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add(new Person("first", 880000000));
        book.add(new Person("first", 880000101));
        book.add(new Person("second", 888888));


        System.out.println(book.get("first"));


    }
}
