package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2));
    }
    public static void main(String[] args) {
        double result = Math.round(distance(3, 12, 2, 25)*100.0)/100.0;
        System.out.println("The distance from point (3, 2) to point (12, 25) is: " + result);
    }
}
