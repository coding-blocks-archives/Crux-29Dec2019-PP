package L16_Feb29;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 29-Feb-2020
 *
 */

public class Student {

	String name = "Raman";
	int age = 100;

	public Student() {
		name = "Ram";
		age = 15;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void introduceYourself() {
		System.out.println(name + " is " + this.age + " years old.");
	}

	public void sayHi(String name) {
		System.out.println(this.name + " says hi to " + name);
	}

}
