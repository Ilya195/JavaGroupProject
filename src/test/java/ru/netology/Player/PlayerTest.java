package ru.netology.Player;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Game.Game;
import ru.netology.GameStore.GameStore;
import ru.netology.NotGameCatalog.NotGameCatalog;

public class PlayerTest {

    @Test
    public void shouldSumGenreIfOneGame() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        Player player = new Player("Петр");
        player.installGame(game);
        player.play(game, 3);

        int expected = 3;
        int actual = player.sumGenre(game.getGenre());
        assertEquals(expected, actual);
    }

    // другие ваши тесты


    @Test
    public void installGame() {
        GameStore store = new GameStore();
        //Game game1 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        //Game game2 = store.publishGame("Супер Марио", "Аркады");
        Game game = store.publishGame("Алладин", "Аркады");

        Player player = new Player("Иван");
        //player.installGame(game1);
        //player.installGame(game2);
        player.installGame(game);
        player.play(game,5);

        int expected = 5;
        int actual = player.sumGenre(game.getGenre());

        assertEquals(expected,actual);

    }


    @Test
    public void mostPlayerByGenre() {
        GameStore store = new GameStore();
        Game game1 = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = store.publishGame("Супер Марио", "Аркады");
        Game game3 = store.publishGame("Алладин", "Аркады");

        Player player = new Player("Петр");

        player.play(game1, 5);
        player.play(game2,9);
        player.play(game3,6);
        String searchGenre = "Аркады";

        String expected = "Супер Марио";
        String actual = store.getMostPlayer();
        Assertions.assertEquals(expected,actual);
    }
}

