package decorator;

public class Board implements BoardUseCase {

	public static final Board INSTANCE = new Board();
	private int viewCount;

	private Board() {
		this.viewCount = 0;
	}

	@Override
	public String read() {
		addView();
		return "게시물을 읽습니다.";
	}

	@Override
	public String write() {
		return "게시물을 작성합니다.";
	}

	public int readView() {
		return this.viewCount;
	}

	public void addView() {
		this.viewCount++;
	}
}
