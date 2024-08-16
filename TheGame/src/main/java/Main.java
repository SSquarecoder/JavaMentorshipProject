public class Main {
    public static void main(String[] args) {
        WelcomeScreen well = new WelcomeScreen();
        well.display();

        boolean validChoice = false;
        int level = 0;

        while (!validChoice) {
            validChoice = well.levelChoice();
            if (validChoice) {
                level = well.getChoice();
            } else {
                System.out.println("Invalid choice. Please choose a valid level.");
            }
        }

        if (level == 2) {
            BattleshipGame.main(args); // Start the Battleship game for level 2
        }
    }
}
