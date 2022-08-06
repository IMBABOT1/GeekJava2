package ru.imbabot.lesson2;

public class MyArraySizeException extends Exception{

    private String[][]arr;

    public MyArraySizeException(String[][] arr){
        super(String.format("Invalid arr size " +  "[" + arr.length + "]" + "[" + arr[0].length + "]"));
    }
}
