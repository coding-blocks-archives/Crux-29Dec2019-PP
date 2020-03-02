package L16_Feb29;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Mar-2020
 *
 */

public class Person {

	private int age;

	public int getAge() {
		return age;
	}

	public void fun(int age) {

		try {
			setAge(age);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("in fun");
	}

	public void setAge(int age) {

		if (age < 0) {
			throw new RuntimeException("Invalid Age.");
		}

		this.age = age;

		System.out.println("in set age");
	}

}
