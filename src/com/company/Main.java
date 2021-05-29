package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = {7, 8, 6, 4, 3, 2, 17, 12, 9, 21};
        int index = 0;
        for (; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println("");

        transformMassive(array);

        for (index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");

        }
    }

    public static void transformMassive(int array[]) {
        int rightIndex = array.length - 1;
        int leftIndex = 0;
        int newLeft = 0;
        int newRight = 0;
        for (; rightIndex != leftIndex && rightIndex - leftIndex != -1; leftIndex++, rightIndex--) {
            newLeft = array[leftIndex];
            newRight = array[rightIndex];
            array[leftIndex] = newRight;
            array[rightIndex] = newLeft;
        }
    }
}
