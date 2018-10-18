package display;

import dicegame.Display;

public class ConsoleDisplay implements Display {

	/* (non-Javadoc)
	 * @see dicegame.Display#displayDiceValue(int)
	 */
	@Override
	public void displayDiceValue(int diceRollValue) {
		System.out.println("Dice roll..");
		System.out.println("The value is " + diceRollValue);
	}
	
	/* (non-Javadoc)
	 * @see dicegame.Display#displayEntryText()
	 */
	@Override
	public void displayEntryText(int valMax) {
		System.out.println("Guess the dice value on next roll (1-" 
				+ valMax
				+ "): ");
	}

	/* (non-Javadoc)
	 * @see dicegame.Display#displayPlayAgainText()
	 */
	@Override
	public void displayPlayAgainText() {
		System.out.println("play again ? ('y' for a new play)");
	}

	/* (non-Javadoc)
	 * @see dicegame.Display#displaySuccessText()
	 */
	@Override
	public void displaySuccessText() {
		System.out.println("Well done!");
	}
	
}
