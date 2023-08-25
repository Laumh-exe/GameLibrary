import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class GameLibrary {

    private ArrayList<String> games;
    private TextUI ui;
    public GameLibrary() {
        this.games = new ArrayList<>();
        this.ui = new TextUI();
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
    public void addGame(String game){
        games.add(game);
    }
    public void removeGame(String game){
        games.remove(game);
    }

    public ArrayList<String> getGames() {
        return games;
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
                    String game = ui.getInput("What game do you want to add?");
                    addGame(game);
                    break;
                case 4:
                    String game = ui.getInput("What game do you want to remove?");
                    removeGame(game);
                    break;
                default:
                    ui.displayMessage("Please type a number to select an option from the list");
            }
        }
    }
}
