package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = false;
        int temp = 0;
        for (int i=2; i<=num; i++) {
            if ((num % i) == 0) {
                temp++;
            }
            if (temp<=1) {
                prime=true;
            }
            else {
                prime=false;
                break;
            }
        }
        return prime;
    }
}
