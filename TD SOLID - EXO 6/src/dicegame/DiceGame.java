package dicegame;

public class DiceGame implements IDiceGame{

	private Dice dice;
	private Input input;
	private Display display;
	
	public DiceGame(Dice dice, Input input, Display display) {
		super();
		this.input = input;
		this.dice = dice;
		this.display = display;
	}

	@Override
	public void start() {
		do {
			playOneRound();
		} while (input.readChar() == 'y');
	}

	public void playOneRound() {
		int userChoice;
		do {
			display.displayEntryText(dice.getNbFaces());
			userChoice = input.readInt();
		} while (userChoice < 1 || userChoice > dice.getNbFaces());
		
		int diceRollValue = getRandomDiceValue();
		display.displayDiceValue(diceRollValue);
		
		if (userChoice == diceRollValue)
			display.displaySuccessText();
		display.displayPlayAgainText();
	}

	public int getRandomDiceValue() {
		dice.roll();
		return dice.getTopValue();
	}

	

}
