package javatictactoe;

public class JavaTicTacToe {

	private static Game theGame;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Java Tic Tac Toe!");
		
		theGame = new Game();
		
		theGame.start();
		while(theGame.isRunning()) {
			
		}
		
		System.out.println("Thanks for playing Java Tic Tac Toe!");
	}

}
