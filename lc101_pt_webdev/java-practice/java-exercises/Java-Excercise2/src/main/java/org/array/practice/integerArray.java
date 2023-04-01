package org.array.practice;

public class integerArray {
    public static void main(stringArray[] args) {
        int[] intArray = {1, 1, 2, 3, 5, 8};

        for (int i : intArray) {
            if (intArray[i] == 1 || intArray[i] == 3 || intArray[i] == 5) {
                System.out.println(i);
            }
        }
    }
}