package assignment.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExpressionEvaluator {

	public static void main(String[] args) throws Exception {
		String expression = "2+7+3+2+3";
		evaluateExpression(expression);
	}

	private static void evaluateExpression(String expression) throws Exception {
		
		Deque<Integer> numberStack = new ArrayDeque<>();
		int i = 0;
		while (i < expression.length()) {
			char s = expression.charAt(i);
			if ('*' == expression.charAt(i)) {
				if (numberStack.isEmpty())
					throw new Exception();

				int operand1 = numberStack.pop();
				int operand2 = Integer.parseInt("" + expression.charAt(i + 1));

				int value = evaluate(operand1, operand2, '*');
				numberStack.push(value);
				i = i + 2;
			} else if ('+' == expression.charAt(i)) {
				i++;
				continue;
			} else {
				numberStack.push(Integer.parseInt("" + s));
				i++;
			}
		}
		int sum = 0;
		while (!numberStack.isEmpty()) {
			sum += numberStack.pop();
		}
		System.out.println(sum);
	}

	private static int evaluate(int operand1, int operand2, char c) {
		if (c == '*')
			return operand1 * operand2;
		return -1;
	}

}
