package input;

import java.io.IOException;
import java.util.Scanner;

import dicegame.Input;

public class KeyboardInput implements Input {

	private Scanner reader = new Scanner(System.in);
	
	public char readChar() {
		return (char) reader.next().charAt(0);
	}

	public int readInt() {
		return reader.nextInt(); 
	}
}
