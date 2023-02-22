package decorator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NotifyViewHandler implements InvocationHandler {

	Object target;

	public NotifyViewHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(target, args);
		Board board = (Board)target;
		if (result instanceof String && method.getName().equals("read")) {
			result += String.format("\n게시글 접근 순서 : %d번째", board.readView());
			return result;
		}
		return result;
	}
}
