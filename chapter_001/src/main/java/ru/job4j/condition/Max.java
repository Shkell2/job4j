package ru.job4j.condition;

class Max {
    static int max(int first, int second) {
        boolean condition = (first > second);
        return condition ? first : second;
    }
}
