import java.lang.reflect.Proxy;

import decorator.Board;
import decorator.BoardUseCase;
import decorator.NotifyViewBoard;
import decorator.NotifyViewHandler;

public class Main {
	public static void main(String[] args) {
		Board board = Board.INSTANCE;
		board.addView();

		BoardUseCase boardUseCase = (BoardUseCase)Proxy.newProxyInstance(
			BoardUseCase.class.getClassLoader(),
			new Class[] {BoardUseCase.class},
			new NotifyViewHandler(board)
		);

		System.out.println(boardUseCase.read());
		System.out.println();
		System.out.println(boardUseCase.write());
	}
}
