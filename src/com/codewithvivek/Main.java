package com.codewithvivek;

import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Point point1 = new Point(1,2);
//        Point point2 = point1;
//        System.out.println(point2);
//        point1.x = 2;
//        System.out.println(point2);
//        String path = "C:\\Data\\info.txt";
//        System.out.println(path);
//        int[] numbers = {1, 3, 2, 5, 4 };
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
//        for(int i = 0; i<=numbers.length - 1; i++) {
//            System.out.println(numbers[i]);
//        }

        //multiDimesionalArray();
        //System.out.println(getSum(4,5));

        /** ===== Implicit casting ==========**/
        //byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;


    }
    private static int getSum(int n1, int n2) {
        return n1 + n2;
    }
    private static void multiDimesionalArray() {
        int[][] numbers = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        for (int i = 0; i <= numbers.length -1; i++) {
            //System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }
    }
}
