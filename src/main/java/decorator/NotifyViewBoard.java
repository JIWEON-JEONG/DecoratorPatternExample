package decorator;

public class NotifyViewBoard implements BoardUseCase {

	Board board;

	@Override
	public void read() {
		board.read();
		System.out.println(board.readView() + "번째로 게시물을 읽었습니다.");
	}

	public NotifyViewBoard(Board board) {
		this.board = board;
	}
}
