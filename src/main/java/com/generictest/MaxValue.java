package com.generictest;

public class MaxValue {
    public static void main(String[] args) {
        printMax(testMaximumInteger(200, 300, 500));
        printMax(testMaximumDouble(1.1, 1.2, 1.3));
        printMax(testMaximumString("Vaibhav", "Suraj", "Parag" ));
        Integer [] a = {100, 200, 400};
        Double [] b = {1.1,1.2,1.3};
        String [] c = {"Vaibhav", "Suraj", "Parag"};
    }
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for (int i=1; i<list.length; i++){
            if (list[i].compareTo(max) > 0)
                max = list[i];
        }
        return max;
    }
    public static int testMaximumInteger(Integer x, Integer y, Integer z){
        Integer max = x;
        if (y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
    public static double testMaximumDouble(Double x, Double y, Double z){
        Double max1 = x;
        if (y.compareTo(max1) > 0){
            max1 = y;
        }
        if (z.compareTo(max1) > 0){
            max1 = z;
        }
        return max1;
    }
    public static String testMaximumString(String first, String second, String third) {
        int max2 = first.length();
        String letter = first;
        if (second.length() > max2) {
            max2 = second.length();
            letter = second;
        }
        if (third.length() > max2) {
            max2 = third.length();
            letter = third;
        }
        printMax(letter);
        return letter;
    }
    private static void printMax(Integer max){
        System.out.println("Maximum number is : " + max);
    }
    private static void printMax(Double max1){
        System.out.println("Maximum number is : " + max1);
    }
    private static void printMax(String max2) {
        System.out.println(" Maximum number is : " + max2);
    }
}
