import java.util.concurrent.ConcurrentHashMap;

import dicegame.Dice;
import dicegame.DiceGame;
import dicegame.DiceWith6Faces;
import dicegame.DiceWith8Faces;
import dicegame.Display;
import dicegame.IDiceGame;
import dicegame.Input;
import display.ConsoleDisplay;
import input.KeyboardInput;

public class DiceGameLauncher {

	public static void main(String[] args) {
		Dice aDice = new DiceWith8Faces();
		
		Input anInput = new KeyboardInput(); 
		Display aDisplay = new ConsoleDisplay();
		
		IDiceGame game = new DiceGame(aDice, anInput, aDisplay);
		
		game.start();
	}

}
