package javatictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
	private Player playerOne;
	private Player playerTwo;
	private Player isUp;
	
	private Board theBoard;
	
	private boolean gameRunning = true;
	private boolean gameWon = false;
	
	public Game() {
		playerOne = null;
		playerTwo = null;
		theBoard = new Board();
	}
	
	public void start() {
		restart();
		setup();
		
		//player One goes first
		isUp = playerOne;
		
		while(! gameWon) {
			//determine player move
			boolean good = false;
			while(! good) {
				good = theBoard.goodMove(isUp.takeTurn(),isUp.getPiece());
			}
			
			//determine if winner
			if(theBoard.isWinner()) {
				//display winner msg
				System.out.println("We have a winner! " + isUp.getName() + " wins!");
				gameWon = true;
				return;
			}
			
			//determine if draw
			if(theBoard.isDraw()) {
				//display draw msg
				System.out.println("We have a draw!");
				gameWon = true;
			}
			
			//draw board
			theBoard.drawBoard();
			
			//sawp player
			if(isUp == playerOne) {
				isUp = playerTwo;
			}
			else {
				isUp = playerOne;
			}
			
			//gameWon = true;
		}
		
		gameRunning = false;
	}
	
	public boolean isRunning() {
		return gameRunning;
	}
	
	private void restart() {
		playerOne = null;
		playerTwo = null;
		theBoard = null;
		theBoard = new Board();
	}
	
	private void setup() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = null;
        
		System.out.println("Player 1 (X) name?");
        try {
			in = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			gameRunning = false;
			return;
		}
		playerOne = new Player(in,"X");
		
		System.out.println("Player 2 (O) name?");
        try {
			in = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			gameRunning = false;
			return;
		}
		playerTwo = new Player(in,"O");
		
		System.out.println("So it's " + playerOne.getName() + " playing the Xs versus " + playerTwo.getName() + " playing the Os!");
		theBoard.drawBoard();
	}
}
