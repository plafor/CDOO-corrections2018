package dicegame;

public abstract class Dice {

	private int nbFaces;
	private int topValue;
	
	public Dice(int nbFaces) {
		super();
		topValue = 1;
		this.nbFaces = nbFaces;
	}

	public int getTopValue() {
		return topValue;
	}

	public void setTopValue(int topValue) {
		this.topValue = topValue;
	}

	public int getNbFaces() {
		return nbFaces;
	}
	
	public void roll() {
		setTopValue(((int)(Math.random()*getNbFaces())) + 1);
	}
}
