package assignment.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {

	static Deque<Integer> enqueueStack = new ArrayDeque<>();
	static Deque<Integer> dequeueStack = new ArrayDeque<>();

	public static void enqueue(int element) {
		System.out.println("Enqueued :: "+element);
		enqueueStack.push(element);
	}

	public static int dequeue() {
		if (dequeueStack.isEmpty()) {
			while (!enqueueStack.isEmpty()) {
				dequeueStack.push(enqueueStack.pop());
			}
		}
		return dequeueStack.pop();

	}

	public static void main(String args[]) {
		enqueue(1);
		enqueue(2);
		enqueue(3);
		enqueue(4);
		enqueue(5);
		enqueue(6);

		System.out.println("Popped :: "+dequeue());

		enqueue(7);
		enqueue(8);

		System.out.println("Popped :: "+dequeue());
		System.out.println("Popped :: "+dequeue());
		System.out.println("Popped :: "+dequeue());
		System.out.println("Popped :: "+dequeue());

	}

}
