package com.corindiano.geeksforgeeks.recursion.p5;

class SumTriangle {
    private static void printArray(int[] array) {
        StringBuilder sb = new StringBuilder("[ ");

        for (int i=0; i<array.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(array[i]);
        }

        sb.append(" ]");
        System.out.println(sb.toString());
    }

    static void print(int[] array) {
        if (array.length == 1) {
            printArray(array);
            return;
        }

        int[] reduced = new int[array.length - 1];

        for (int j=0; j<array.length - 1; j++) {
            reduced[j] = array[j] + array[j+1];
        }

        print(reduced);
        printArray(array);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        SumTriangle.print(array);
    }
}