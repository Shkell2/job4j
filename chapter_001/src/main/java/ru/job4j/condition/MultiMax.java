package ru.job4j.condition;

class MultiMax {
    int max(int first, int second, int third) {
        boolean selection = (first > second);
        int temp = selection ? first : second;
        selection = (temp > third);
        return selection ? temp : third;
    }
}
