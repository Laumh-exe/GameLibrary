import java.util.Scanner;

public class TextUI {

    Scanner scanner;
    public TextUI() {
    scanner = new Scanner(System.in);
    }

        public void displayMessage(String msg) {
            System.out.println(msg);
        }
        public String getInput(String msg){
            System.out.println(msg);
            return scanner.nextLine();
        }
    }
