package L20_GenericTree;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 *
 */

public class GenericTree {

	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public GenericTree() {
		root = construct(null, -1);
	}

	private Node construct(Node parent, int ith) {

		// prompt
		if (parent == null) {
			System.out.println("Enter the data for root node ?");
		} else {
			System.out.println("Enter the data for " + ith + " child of " + parent.data + " ?");
		}

		// take input of data
		int item = scn.nextInt();

		// create a new node
		Node nn = new Node();

		// update the data
		nn.data = item;

		// prompt
		System.out.println("Enter the number of children for " + nn.data + " ?");

		// take input for children
		int noc = scn.nextInt();

		// loop
		for (int j = 0; j < noc; j++) {

			Node child = construct(nn, j);
			nn.children.add(child);
		}

		return nn;

	}

	public void display() {
		System.out.println("---------------------");
		display(root);
		System.out.println("---------------------");

	}

	private void display(Node node) {

		// self work
		String str = node.data + " -> ";

		for (Node child : node.children) {
			str += child.data + " ";
		}

		str += ".";
		System.out.println(str);

		// smaller problem
		for (Node child : node.children) {
			display(child);
		}

	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {

		int ts = 0;

		for (Node child : node.children) {
			int cs = size(child);
			ts += cs;
		}

		return ts + 1;

	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {

		int tm = node.data;

		for (Node child : node.children) {
			int cm = max(child);

			if (cm > tm) {
				tm = cm;
			}
		}

		return tm;

	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {

		int th = -1;

		for (Node child : node.children) {
			int ch = ht(child);

			if (ch > th) {
				th = ch;
			}
		}

		return th + 1;

	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {

		if (node.data == item) {
			return true;
		}

		for (Node child : node.children) {

			boolean cf = find(child, item);
			
			if(cf)
				return true ;

		}

		return false ;

	}

}










