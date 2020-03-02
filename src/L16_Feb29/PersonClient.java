package L16_Feb29;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Mar-2020
 *
 */

public class PersonClient {

	public static void main(String[] args) {

		Person p = new Person();
		p.fun(10);
		// try {
		// System.out.println("hi");
		// p.fun(10);
		// System.out.println("bye");
		//
		// } catch (Exception e) {
		// System.out.println("in catch");
		// System.out.println(e);
		// e.printStackTrace();
		// }
		System.out.println(p.getAge());

		// p.fun(-10);

	}
}
