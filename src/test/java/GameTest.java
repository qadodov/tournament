import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    Player player1 = new Player(1, "Superman", 999);
    Player player2 = new Player(2, "Batman", 830);
    Player player3 = new Player(3, "Spider-Man", 785);
    Player player4 = new Player(4, "Wolverine", 988);
    Player player5 = new Player(5, "Captain America", 867);
    Player player6 = new Player(6, "Hulk", 999);
    Player player7 = new Player(7, "The Flash", 720);
    Player player8 = new Player(8, "Thor", 921);
    Player player9 = new Player(9, "Iron Man", 900);
    Player player10 = new Player(10, "The Joker", 777);

    Game game = new Game();

    @Test
    void shouldRegisterPlayer() {

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        game.register(player6);
        game.register(player7);
        game.register(player8);
        game.register(player9);
        game.register(player10);

        int expected = 10;
        int actual = game.players.size();

        assertEquals(expected, actual);
    }

    @Test
    void shouldHostRoundSecondPlayerWins() {

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        game.register(player6);
        game.register(player7);
        game.register(player8);
        game.register(player9);
        game.register(player10);

        int expected = 2;
        int actual = game.round("Batman", "Thor");

        assertEquals(expected, actual);
    }

    @Test
    void shouldHostRoundFirstPlayerWins() {

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        game.register(player6);
        game.register(player7);
        game.register(player8);
        game.register(player9);
        game.register(player10);

        int expected = 1;
        int actual = game.round("Superman", "Wolverine");

        assertEquals(expected, actual);
    }

    @Test
    void shouldHostRoundTie() {

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        game.register(player6);
        game.register(player7);
        game.register(player8);
        game.register(player9);
        game.register(player10);

        int expected = 0;
        int actual = game.round("Superman", "Hulk");

        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowException() {

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        game.register(player6);
        game.register(player7);
        game.register(player8);
        game.register(player9);
        game.register(player10);

        assertThrows(NotRegisteredException.class, () -> {game.round("Superman", "Deadpool");});
    }

}