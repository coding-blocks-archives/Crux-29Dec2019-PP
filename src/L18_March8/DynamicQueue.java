package L18_March8;

import L16_Feb29.Queue;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 08-Mar-2020
 *
 */

public class DynamicQueue extends Queue {

	@Override
	public void enqueue(int item) throws Exception {

		if (isFull()) {

			// create a new array of twice size
			int[] na = new int[2 * data.length];

			// copy the older elements
			for (int i = 0; i < size; i++) {
				int idx = (i + front) % data.length;
				na[i] = data[idx];
			}

			// reference change
			data = na;
			front = 0;

		}

		super.enqueue(item);

	}

}
