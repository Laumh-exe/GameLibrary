import static org.junit.jupiter.api.Assertions.*;

class removeGame_test {

    GameLibrary library = new GameLibrary();

    @org.junit.jupiter.api.Test
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