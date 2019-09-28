package tictactoe;

public class GameBean {
	
	String[] board = new String[9];
	String currentPlayer = "X";
	int turns = 0;
	
	
	public GameBean() {
		for(int i=0; i < board.length; i++) {
			board[i] = " ";
		}
	}
	
	public String getWinner() {
		for(int i =0; i<8; i++) {
			String winCase = "";
			switch(i) {
			case 0:
				winCase = board[0] + board[1] + board[2];
				break;
			case 1:
				winCase = board[3] + board[4] + board[5];
				break;
			case 2:
				winCase = board[6] + board[7] + board[8];
				break;
			case 3:
				winCase = board[0] + board[3] + board[6];
				break;
			case 4:
				winCase = board[1] + board[4] + board[7];
				break;
			case 5:
				winCase = board[2] + board[5] + board[8];
				break;
			case 6:
				winCase = board[0] + board[4] + board[8];
				break;
			case 7:
				winCase = board[2] + board[4] + board[6];
				break;
			}
			
			if(winCase.equals("XXX")) {
				return "X";
			}
			else if(winCase.equals("OOO")) {
				return "O";
			}
			
		}
		
		if(this.turns >= 9) {
			return "D";
		}
		
		return null;
	}
	
	public void setMove(int location) {
		board[location] = currentPlayer;
	}
	
	public String getMove(int location) {
		return board[location];
	}
	
	public boolean isValid(int location) {
		if(board[location].equals("X") || board[location].equals("O")) {
			return false;
		}
		return true;
	}
	
	public void setPlayer() {
		if(currentPlayer.equals("X")) {
			currentPlayer = "O";
		}
		else {
			currentPlayer = "X";
		}
	}
	
	public String getPlayer() {
		return currentPlayer;
	}
	
	public void setTurn() {
		turns++;
	}
	
	public int getTurn() {
		return turns;
	}
	
}


	

