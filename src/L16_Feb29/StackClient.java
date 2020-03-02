package L16_Feb29;

import java.util.ArrayList;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Mar-2020
 *
 */

public class StackClient {

	public static void main(String[] args) {

		try {
			Stack s = new Stack();

			s.push(10);
			s.push(20);
			s.push(30);
			s.push(40);
			s.push(50);
			s.display();
			// s.push(60);
			s.display();

			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
