package assignment.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParanthesisValidator {

	public static void main(String[] args) {
		String expression = "(2 * ( 3 + 5(sasdfasdfasd)))";
		System.out.println(isMissingParanthesis(expression));
	}

	private static <T> boolean isMissingParanthesis(String expression) {
		Deque<Character> paranthesisStack = new ArrayDeque<>();
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if('(' == c) {
				paranthesisStack.push(c);
			} else if(')' == c) {
				if(!paranthesisStack.isEmpty()) {
					paranthesisStack.pop();
				} else {
					return true;
				}
			}
		}
		if(!paranthesisStack.isEmpty()) {
			return true;
		}
		return false;
	}

}
