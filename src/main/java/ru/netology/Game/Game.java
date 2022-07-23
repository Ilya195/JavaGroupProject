<<<<<<< HEAD:src/main/java/Game.java

=======
package ru.netology.Game;

import ru.netology.Player;
>>>>>>> ea396c15870a2226dc63c703f75537cd4854bb44:src/main/java/ru/netology/Game/Game.java

import java.util.Objects;
import ru.netology.GameStore.GameStore;

public class Game {
    private final String title;
    private final String genre;
    private final GameStore store;


    public Game(String title, String genre, GameStore store) {
        this.title = title;
        this.genre = genre;
        this.store = store;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public GameStore getStore() {
        return store;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Game game = (Game) o;
<<<<<<< HEAD:src/main/java/Game.java
        return Objects.equals(title, game.title)&&
        Objects.equals(genre, game.genre) &&
        Objects.equals(store, game.store);
=======
        return Objects.equals(title, game.title) &&
                Objects.equals(genre, game.genre) &&
                Objects.equals(store, game.store);
>>>>>>> ea396c15870a2226dc63c703f75537cd4854bb44:src/main/java/ru/netology/Game/Game.java
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, store);
    }
}