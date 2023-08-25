import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLibraryTest {

    GameLibrary library = new GameLibrary();

    @Test
    void addGameTest1() {
        String game = "Call Of Duty";
        library.addGame(game);
        assertEquals(1, library.getGames().size());
    }

    @Test
    void addGameTest2() {
        String game = "Call Of Duty";
        String game2 = "Battlefield";
        library.addGame(game);
        library.addGame(game2);
        assertEquals(2, library.getGames().size());
    }

    @Test
    void displayGameLibraryTest() {
        String game = "Call Of Duty";
        library.addGame(game);
        assertEquals(game+"\n", library.displayGameLibrary());
    }


    @Test
    void playGameTest() {
        String game = "Elden Ring";
        assertEquals("Now playing " + game, library.playGame(game));
    }

    @Test
    void removeGameTest() {
        String game = "Elden Ring";
        String game2 = "Vermintide";
        library.addGame(game);
        library.addGame(game2);
        assertEquals(2, library.getGames().size());
        library.removeGame(game);
        library.removeGame(game2);
        assertEquals(0,library.getGames().size());
    }


}