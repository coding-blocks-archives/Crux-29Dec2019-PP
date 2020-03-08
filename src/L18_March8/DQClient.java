package L18_March8;

import L16_Feb29.Queue;
import L16_Feb29.Stack;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 08-Mar-2020
 *
 */

public class DQClient {

	public static void main(String[] args) throws Exception {

		Queue dq = new DynamicQueue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		// dq.enqueue(50);
		//
		// dq.display();
		//
		// dq.dequeue();
		// dq.dequeue();
		//
		// dq.enqueue(60);
		// dq.enqueue(70);
		// dq.enqueue(80);

		System.out.println("---- Display Reverse ----");
		dq.display(); // 10 20 30 40
		displayReverse(dq, 0); // 40 30 20 10
		dq.display(); // 10 20 30 40

		System.out.println("---- Actual Reverse ----");
		dq.display(); // 10 20 30 40
		actualReverse(dq);
		dq.display(); // 40 30 20 10
	}

	public static void displayReverse(Queue q, int count) throws Exception {

		if (count == q.size()) {
			return;
		}

		int temp = q.dequeue();
		q.enqueue(temp);
		displayReverse(q, count + 1);
		System.out.println(temp);

	}

	public static void actualReverse(Queue q) throws Exception {

		if (q.isEmpty()) {
			return;
		}

		int temp = q.dequeue();
		actualReverse(q);
		q.enqueue(temp);

	}

}
