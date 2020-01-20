package L7_Jan19;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Jan-2020
 *
 */

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		// size
		// complexity : O(1)
		System.out.println(list.size());
		System.out.println(list);

		// add
		// complexity : O(1)
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);

		System.out.println(list.size());

		// get
		// complexity : O(1)
		// ranges : 0 to size-1
		System.out.println(list.get(0));
		System.out.println(list.get(1));

		// set
		// complexity : O(1)
		// ranges : 0 to size-1
		list.set(0, 40);
		System.out.println(list);

		// add at a particular index
		// complexity : best case : O(1) , worst case : O(n)
		// ranges : 0 to size
		list.add(3, 50);
		System.out.println(list);

		// remove
		// complexity : best case : O(1) , worst case : O(n)
		// ranges : 0 to size-1
		list.remove(1);
		System.out.println(list);

		// list.remove(list.size()-1) ;

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (int val : list) {
			System.out.println(val);
		}

	}
}









