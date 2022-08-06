package ru.imbabot.lesson2;

import java.util.Arrays;

public class Main {

    private static void method(String[][] arr) throws MyArrayDataException, MyArraySizeException  {
        if (arr.length != 4 || arr[0].length != 4){
            throw new MyArraySizeException(arr);
        }

        int result = 0;
        for (int i = 0; i <  arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (!arr[i][j].matches("[0-9]+")) {
                    throw new MyArrayDataException(arr, i, j);
                }
                result += Integer.parseInt(arr[i][j]);
            }
        }
    }


    public static void main(String[] args) {
        String[][] arr = new String[1][4];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] =  String.valueOf(0 + (int) (Math.random() * 100));
            }
        }

        arr[0][1] = "s";

        try {
            method(arr);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}
