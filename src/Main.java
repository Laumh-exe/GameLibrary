public class Main {
    public static void main(String[] args) {
        GameLibrary gameLibrary = new GameLibrary();

        gameLibrary.addGame("Baldurs Gate 3");
        gameLibrary.addGame("Elden Ring");
        gameLibrary.addGame("Shrek 2 The Video Game");
        gameLibrary.addGame("Half Life 3");

        gameLibrary.displayMenu();
    }
}