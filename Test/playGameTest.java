import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class playGameTest {

    GameLibrary library = new GameLibrary();

    @Test
    void playGame() {
        String game = "Elden Ring";
        library.addGame(game);
        assertEquals(1, library.getGames().size());
        library.playGame(game);
        assertEquals("Elden Ring", library.playGame(game));
    }
}