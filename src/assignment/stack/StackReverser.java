package assignment.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackReverser {

	public static void main(String[] args) {
		Deque<Integer> originalStack = new ArrayDeque<>();
		originalStack.push(1);
		originalStack.push(2);
		originalStack.push(3);
		originalStack.push(4);
		System.out.println(originalStack);
		reverse(originalStack);
		System.out.println(originalStack);
	}

	private static void reverse(Deque<Integer> originalStack) {
		int tempVariable = 0;
		Deque<Integer> anotherStack = new ArrayDeque<>();
		int numOfElementsToReverse = originalStack.size();
		for (int i = 0; i < numOfElementsToReverse; i++) {
			tempVariable = originalStack.pop();
			while (originalStack.size() - i > 0) {
				anotherStack.push(originalStack.pop());
			}

			originalStack.push(tempVariable);

			while (!anotherStack.isEmpty()) {
				originalStack.push(anotherStack.pop());
			}
		}
	}

}
