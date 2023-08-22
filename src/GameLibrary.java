import java.util.ArrayList;

public class GameLibrary {
    ArrayList<String> games;
    public GameLibrary() {
        ArrayList<String> games = new ArrayList<>();
    }

    public void displayGameLibrary() {
        for(String game: games) {
            ui.displayMessage(game + "\n");
        }
    }
}
