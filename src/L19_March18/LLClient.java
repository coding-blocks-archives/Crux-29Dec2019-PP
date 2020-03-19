package L19_March18;

public class LLClient {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		// list.addLast(60);

		list.display();
		// list.reversePointerRecursively();
		// list.reverseDataRecursively();

		list.fold();

		list.display();

		System.out.println(list.kthFromLast(2));
	}
}
