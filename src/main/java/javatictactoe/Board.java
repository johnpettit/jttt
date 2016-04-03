package javatictactoe;

public class Board {
	private String winnerPiece;
	String [][] board;
	
	public Board() {
		this.clear();
	}
	
	public boolean goodMove(String pos, String piece) {
		Integer intPos = Integer.parseInt(pos);
		for(int x=0; x<3; x++) {
			for(int y=0;y<3;y++) {
				Integer curPos = y + 1 + (x*3);
				if(curPos == intPos) {
					if(board[x][y] == "X" || board[x][y] == "O") {
						System.out.println("That spot is taken already!");
						return false;
					}
					else {
						board[x][y] = piece;
						return true;
					}
				}
			}
		}
		System.out.println("End of Board!");
		return false;
	}
	
	public boolean isWinner() {
		//check for winner
		if(board[0][0] == "X" && board[0][1] == "X" && board[0][2] == "X") {
			this.winnerPiece = "X";
			return true;
		}
		if(board[1][0] == "X" && board[1][1] == "X" && board[1][2] == "X") {
			this.winnerPiece = "X";
			return true;
		}
		if(board[2][0] == "X" && board[2][1] == "X" && board[2][2] == "X") {
			this.winnerPiece = "X";
			return true;
		}
		if(board[0][0] == "X" && board[1][0] == "X" && board[2][0] == "X") {
			this.winnerPiece = "X";
			return true;
		}
		if(board[0][1] == "X" && board[1][1] == "X" && board[2][1] == "X") {
			this.winnerPiece = "X";
			return true;
		}
		if(board[0][2] == "X" && board[1][2] == "X" && board[2][2] == "X") {
			this.winnerPiece = "X";
			return true;
		}

		//check for winner
		if(board[0][0] == "O" && board[0][1] == "O" && board[0][2] == "O") {
			this.winnerPiece = "O";
			return true;
		}
		if(board[1][0] == "X" && board[1][1] == "X" && board[1][2] == "X") {
			this.winnerPiece = "X";
			return true;
		}
		if(board[2][0] == "X" && board[2][1] == "X" && board[2][2] == "X") {
			this.winnerPiece = "X";
			return true;
		}
		if(board[0][0] == "X" && board[1][0] == "X" && board[2][0] == "X") {
			this.winnerPiece = "X";
			return true;
		}
		if(board[0][1] == "X" && board[1][1] == "X" && board[2][1] == "X") {
			this.winnerPiece = "X";
			return true;
		}
		if(board[0][2] == "X" && board[1][2] == "X" && board[2][2] == "X") {
			this.winnerPiece = "X";
			return true;
		}
		
		return false;
	}
	
	//determine if draw
	//check each space
	//if we have 9 Xs and/or Os we have a draw
	public boolean isDraw() {
		//check for draw
		Integer counter = 1;
		for(int x=0; x<3; x++) {
			for(int y=0;y<3;y++) {
				if(board[x][y] == "X" || board[x][y] == "O") {
					counter++;
				}
			}
		}
		if(counter > 9) {
			return true;
		}
		return false;
	}
	
	public void drawBoard() {
		for(int x=0; x<3; x++) {
			for(int y=0;y<3;y++) {
				System.out.print("|");
				System.out.print(board[x][y]);
			}
			System.out.println("|");
		}
	}
	
	public void clear() {
		this.board = null;
		this.board = new String[3][3];
		
		Integer counter = 1;
		
		for(int x=0; x<3; x++) {
			for(int y=0;y<3;y++) {
				board[x][y] = counter.toString();
				counter++;
			}
		}
		this.winnerPiece = ".";
	}

	/**
	 * @return the winnerPiece
	 */
	public String getWinnerPiece() {
		return winnerPiece;
	}

	/**
	 * @param winnerPiece the winnerPiece to set
	 */
	public void setWinnerPiece(String winnerPiece) {
		this.winnerPiece = winnerPiece;
	}
}
