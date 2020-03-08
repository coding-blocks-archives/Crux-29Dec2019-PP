package L18_March8;

import L16_Feb29.Stack;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 08-Mar-2020
 *
 */

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {

		if (isFull()) {

			// create a new array of twice size
			int[] na = new int[2 * data.length];

			// copy the older elements
			for (int i = 0; i < data.length; i++) {
				na[i] = data[i];
			}

			// reference change
			data = na;

		}

		super.push(item);

	}
}
