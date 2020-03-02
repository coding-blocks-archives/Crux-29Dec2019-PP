package L17_March1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Mar-2020
 *
 */

public class Client {

	public static void main(String[] args) {

		// case 1
		P obj1 = new P();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		// System.out.println(obj1.d2) ;

		obj1.fun();
		obj1.fun1();
		// obj1.fun2();

		// case 2
		P obj2 = new C();
		System.out.println(obj2.d); // 10
		System.out.println(((C) obj2).d); // 20
		System.out.println(obj2.d1); // 100
		System.out.println(((C) obj2).d2); // 200

		obj2.fun(); // C Fun
		((P) obj2).fun(); // C Fun
		obj2.fun1(); // P Fun 1
		((C) obj2).fun2(); // C Fun 2

		// case 3
		// C obj3 = new P() ;

		// case 4
		C obj4 = new C();
		System.out.println(obj4.d); // 20
		System.out.println(((P) obj4).d); // 10
		System.out.println(obj4.d1); // 100
		System.out.println(obj4.d2); // 200

		obj4.fun(); // C Fun
		((P) obj4).fun(); // C Fun
		obj4.fun1(); // P Fun 1
		obj4.fun2(); // C Fun 2

	}

}
