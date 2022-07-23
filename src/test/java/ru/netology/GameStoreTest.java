package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GameStoreTest {

    GameStore store = new GameStore();

    @Test
    public void shouldAddGame() {

        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }

    @Test
    public void getMostPlayer() {

        store.addPlayTime("Петр", 18);
        store.addPlayTime("Александр", 14);
        store.addPlayTime("Василий", 21);

        String expected = "Василий";
        String actual = store.getMostPlayer();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void showGetMostPlayerEqualsZero() {

        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        store.addPlayTime("Василий", 0);

        String actual = store.getMostPlayer();
        String expected = "Василий";
        assertEquals(expected, actual);
    }

    @Test
    public void showGetMostPlayerReturnNull() {

        String actual = store.getMostPlayer();
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    public void showReturnNullGetMostPlayerNegativeValue() {

        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        store.addPlayTime("Петр", -1);

        String actual = store.getMostPlayer();
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    public void showReturnFalseAddGames() {

        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = new Game("Контра", "Шутер", store);

        assertFalse(store.containsGame(game2));
    }

    @Test
    public void showReturnFalseContainsGame() {

        Game game2 = new Game("Контра", "Шутер", store);

        assertFalse(store.containsGame(game2));
    }



    @Test
    public void shouldRegisteredAddPlayTime() {

        store.addPlayTime("Петр", 2);
        store.addPlayTime("Петр", 1);

        String actual = store.getMostPlayer();
        String expected = "Петр";
        assertEquals(expected, actual);
    }

    @Test
    public void showGetMostPlayerEquallyOne() {

        store.addPlayTime("Петр", 1);

        String actual = store.getMostPlayer();
        String expected = "Петр";
        assertEquals(expected, actual);
    }

    @Test
    public void showGetSumPlayedTime() {

        store.addPlayTime("Петр", 5);
        store.addPlayTime("Александр", 3);
        store.addPlayTime("Василий", 8);

        int actual = store.getSumPlayedTime();
        int expected = 16;
        assertEquals(expected, actual);
    }

    @Test
    public void showReturnZeroGetSumPlayedTime() {

        int actual = store.getSumPlayedTime();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void showGetSumZeroPlayedTime() {

        store.addPlayTime("Петр", 0);
        store.addPlayTime("Александр", 0);
        store.addPlayTime("Василий", 0);

        int actual = store.getSumPlayedTime();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void showGetSumOnePlayedTime() {

        store.addPlayTime("Петр", 0);
        store.addPlayTime("Василий", 1);
        store.addPlayTime("Александр", 0);

        int actual = store.getSumPlayedTime();
        int expected = 1;
        assertEquals(expected, actual);
    }
}
