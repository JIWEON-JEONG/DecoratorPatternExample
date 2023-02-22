package decorator;

public class Board implements BoardUseCase {

	public static final Board INSTANCE = new Board();
	private int viewCount;

	private Board() {
		this.viewCount = 0;
	}

	@Override
	public void read() {
		addView();
		System.out.println("게시물을 읽습니다.");
	}

	public int readView() {
		return this.viewCount;
	}

	public void addView() {
		this.viewCount++;
	}

}
