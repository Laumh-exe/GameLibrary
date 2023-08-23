import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class GameLibrary {
    private ArrayList<String> games;
    private TextUI ui;
    public GameLibrary() {
        ArrayList<String> games = new ArrayList<>();
        ui = new TextUI();
    }


    public String displayGameLibrary() {
        String gamesList = "";
        for(String game: games) {
            gamesList += game + "\n";
        }
        return gamesList;
    }
    public void playGame(){

    }
    public void addGame(){

    }
    public void removeGame(){

    }
    public void displayMenu() {
        while(true) {
            int option =  parseInt(ui.getInput("1) Display Games\n2) Play Game\n3) Add Game\n4) Remove game"));
            switch (option) {
                case 1:
                    displayGameLibrary();
                    break;
                case 2:
                    playGame();
                    break;
                case 3:
                    addGame();
                    break;
                case 4:
                    removeGame();
                    break;
                default:
                    ui.displayMessage("Please type a number to select an option from the list");
            }
        }
    }
}
