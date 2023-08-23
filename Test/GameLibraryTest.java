import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLibraryTest {

    GameLibrary library = new GameLibrary();

    @Test
    void displayGameLibraryTest() {
        String game = "Call Of Duty";
        library.addGame(game);
        assertEquals(game, library.displayGameLibrary());
    }
}