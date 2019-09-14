package ru.job4j.condition;

class Triangle {
    static boolean exists(double ab, double ac, double bc) {
        return (((ab+ac)>bc)&&((ac+bc)>ab)&&((ab+bc)>ac));
    }
}
