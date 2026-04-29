package mycoutrygame;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class SoloGame extends GameSession{
    private Player singlePlayer;

    public SoloGame(Country targetCountry, Map<String, Country> countryMap, String playerName) {
        super(targetCountry, countryMap);
        this.singlePlayer = new Player(playerName);
    }

    /**
     * Executes the main gameplay loop for a single player until the country is guessed.
     */
    @Override
    public void play() {
        System.out.println("\n--- Solo Mode ---");
        System.out.println("I have selected a country! Type 'hint' if you get stuck.");
        boolean gameEnded = false;

        while (!gameEnded) {
            System.out.print(singlePlayer.getName() + ", enter your guess [or 'history', 'hint', 'give up']: ");
            String input = scanner.nextLine().trim();
            gameEnded = processGuess(singlePlayer, input);
        }
    }
}
