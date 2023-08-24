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


}