import decorator.Board;
import decorator.NotifyViewBoard;

public class Main {
	public static void main(String[] args) {
		Board board = Board.INSTANCE;
		board.addView();
		NotifyViewBoard notifyViewBoard = new NotifyViewBoard(board);
		notifyViewBoard.read();
	}
}
