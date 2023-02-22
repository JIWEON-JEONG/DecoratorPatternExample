package decorator;

public class NotifyViewBoard implements BoardUseCase {

	Board board;

	@Override
	public String read() {
		String result = board.read();
		result += String.format("\n게시글 접근 순서 : %d번째", board.readView());
		return result;
	}

	@Override
	public String write() {
		return board.write();
	}

	public NotifyViewBoard(Board board) {
		this.board = board;
	}
}
