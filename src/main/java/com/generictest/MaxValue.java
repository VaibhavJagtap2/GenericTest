package com.generictest;

public class MaxValue {
    public static void main(String[] args) {
        printMax(testMaximumInteger(200, 300, 500));
        Double [] a = {1.1,1.2,1.3};
        String [] b = {"Vaibhav", "Suraj", "Parag"};
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
    public String testMaximumString(String first, String second, String third) {
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
    private static void printMax(Double max){
        System.out.println("Maximum number is : " + max);
    }
    private static void printMax(String max) {
        System.out.println(" Maximum number is : " + max);
    }
}
