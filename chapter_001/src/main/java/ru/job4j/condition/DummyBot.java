package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Этот вопрос ставит меня в тупик!";
        if ("Привет, бот".equals(question)) {
            rsl = "Привет, умник!";
        }
        else {
            if ("Пока".equals(question)) {
                rsl = "До скорой встречи";
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String result = answer("Привет, бот");
        System.out.println(result);
    }
}
