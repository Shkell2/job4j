package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int value = 140;
        int rubleToEuro = rubleToEuro(value);
        System.out.println(value + " rubles are " + rubleToEuro + " euro.");
        int dollar = rubleToDollar(value);
        System.out.println(value + " rubles are " + dollar + " dollars.");
        int evroRuble = euroToRuble(value);
        System.out.println(value + " evro are " + evroRuble + " rubles.");
        int dollarRuble = dollarToRuble(value);
        System.out.println(value + " dollars are " + dollarRuble + " rubles.");
// тестируем
        System.out.println("OUR TEST... ");
        int in = 140;
        int expected1 = 2;
        int out1 = rubleToEuro(in);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 evro. Test result : " + passed1);

        float expected2 = 2;
        float out2 = rubleToDollar(in);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2 dollars. Test result : " + passed2);

        float expected3 = 9800;
        float out3 = euroToRuble(in);
        boolean passed3 = expected3 == out3;
        System.out.println("140 evro are 9800 rubles. Test result : " + passed3);

        float expected4 = 8400;
        float out4 = dollarToRuble(in);
        boolean passed4 = expected4 == out4;
        System.out.println("140 dollars are 8400 rubles. Test result : " + passed4);
    }
}
