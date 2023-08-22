import java.util.ArrayList;

public class GameLibrary {
    private ArrayList<String> games;
    private TextUI ui;
    public GameLibrary() {
        ArrayList<String> games = new ArrayList<>();
        ui = new TextUI();
    }

    public void displayGameLibrary() {
        for(String game: games) {
            ui.displayMessage(game);
        }
    }
}
