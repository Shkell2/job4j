//package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.condition.DummyBot.answer;

public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        assertThat(
                answer("Привет, бот"),
                is("Привет, умник!")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                answer("Пока"),
                is("До скорой встречи")
        );
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                answer("Сколько будет 2 + 2?"),
                is("Этот вопрос ставит меня в тупик!")
        );
    }
}
