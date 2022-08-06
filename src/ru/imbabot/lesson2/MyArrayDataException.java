package ru.imbabot.lesson2;

public class MyArrayDataException extends Exception{

    private String[][] arr;
    private int firstDimension;
    private int secondDimension;

    public MyArrayDataException(String[][]arr, int firstDimension, int secondDimension){
        super(String.format("Array contains symbols: " + "[" +firstDimension + "]" + "[" + secondDimension + "]"));
    }
}
