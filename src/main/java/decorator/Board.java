package decorator;

public class Board implements BoardUseCase{
	public static final Board INSTANCE = new Board();

	private Board() {
	}

	@Override
	public void read() {
		System.out.println("게시물을 읽습니다.");
	}

	@Override
	public void write() {
		System.out.println("게시물을 작성합니다.");
	}
}
