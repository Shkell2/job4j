package ru.job4j.calculator;

/**
 * Calculator
 * @author Roman Kurilov (darkromik@mail.ru)
 *
 */
public class Calculator {
    /**
     * Calculate Add.
     * @param first - first parametr.
     * @param second - second parametr.
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }
    /**
     * Calculate Div.
     * @param first - first parametr.
     * @param second - second parametr.
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }
    /**
     * Calculate Mulriply.
     * @param first - first parametr.
     * @param second - second parametr.
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }
    /**
     * Calculate Subtrack.
     * @param first - first parametr.
     * @param second - second parametr.
     */
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}
