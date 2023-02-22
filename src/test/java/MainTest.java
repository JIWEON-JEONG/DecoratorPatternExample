import java.lang.reflect.Proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import decorator.Board;
import decorator.BoardUseCase;
import decorator.NotifyViewHandler;

public class MainTest {

	Board board = Board.INSTANCE;

	@Test
	@DisplayName("NotifyViewHandler 정상 작동 테스트")
	void notifyViewHandlerTest() {
		//given
		board.addView();
		BoardUseCase boardUseCase = (BoardUseCase)Proxy.newProxyInstance(
			MainTest.class.getClassLoader(),
			new Class[] {BoardUseCase.class},
			new NotifyViewHandler(board)
		);

		//when
		String result = boardUseCase.read();

		//then
		Assertions.assertEquals("게시물을 읽습니다.\n게시글 접근 순서 : 2번째", result);
	}
}
