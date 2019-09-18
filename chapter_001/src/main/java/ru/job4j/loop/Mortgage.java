package ru.job4j.loop;

public class Mortgage {
    int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount>0)
        {
            amount = (amount*(0.01*percent+1)-salary);
            year++;
        }
        return year;
    }
}
