package javatictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {
	private String name;
	private String piece;  

	public String takeTurn() {
		System.out.println(this.getName() + ", it's your turn. Where do you want to place your piece (1-9)?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = null;

        try {
			in = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "ERROR";
		}
        //TODO check for valid values
        return in;
	}
	
	public Player() {
		name = "NONE";
		piece = "NONE";
	}
	
	public Player(String newName, String newPiece) {
		name = newName;
		piece = newPiece;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the piece
	 */
	public String getPiece() {
		return piece;
	}

	/**
	 * @param piece the piece to set
	 */
	public void setPiece(String piece) {
		this.piece = piece;
	}
}
