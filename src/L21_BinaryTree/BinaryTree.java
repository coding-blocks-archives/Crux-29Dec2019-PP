package L21_BinaryTree;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 *
 */

public class BinaryTree {

	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree() {
		root = takeInput(null, false);
	}

	private Node takeInput(Node parent, boolean ilc) {

		// prompt
		if (parent == null) {
			System.out.println("Enter the data for root node");
		} else {

			if (ilc) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);
			}
		}

		// take input of data from user
		int item = scn.nextInt();

		// create a new node
		Node nn = new Node();

		// update the data of node
		nn.data = item;

		// ask user if the node has left child
		System.out.println(nn.data + " has left child ?");

		// take input either true or false
		boolean hlc = scn.nextBoolean();

		// if left child exists, then create it
		if (hlc) {
			nn.left = takeInput(nn, true);
		}

		// ask user if the node has right child
		System.out.println(nn.data + " has right child ?");

		// take input either true or false
		boolean hrc = scn.nextBoolean();

		// if right child exists, then create it
		if (hrc) {
			nn.right = takeInput(nn, false);
		}

		// node is ready, now return the node
		return nn;

	}

	public void display() {
		System.out.println("----------------");
		display(root);
		System.out.println("----------------");
	}

	private void display(Node node) {

		// base case
		if (node == null) {
			return;
		}

		// self work
		String str = "";

		if (node.left == null)
			str += ".";
		else
			str += node.left.data;

		str += "->" + node.data + "<-";

		if (node.right == null)
			str += ".";
		else
			str += node.right.data;

		System.out.println(str);

		// smaller problems
		display(node.left);
		display(node.right);
	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {

		if (node == null) {
			return 0;
		}

		int ls = size(node.left);
		int rs = size(node.right);

		return ls + rs + 1;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {

		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int lm = max(node.left);
		int rm = max(node.right);

		return Math.max(node.data, Math.max(lm, rm));

	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {

		if (node == null) {
			return false;
		}

		if (node.data == item) {
			return true;
		}

		boolean lf = find(node.left, item);
		boolean rf = find(node.right, item);

		return lf || rf;

	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {

		if (node == null) {
			return -1;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);

		return Math.max(lh, rh) + 1;

	}

	int diameterAns = Integer.MIN_VALUE;

	public int diameter() {
		diameter(root);

		return diameterAns;

	}

	private void diameter(Node node) {

		if (node == null) {
			return;
		}

		int presentNodeRoot = ht(node.left) + ht(node.right) + 2;

		if (presentNodeRoot > diameterAns) {
			diameterAns = presentNodeRoot;
		}

		diameter(node.left);
		diameter(node.right);

	}

	public int diameter2() {
		return diameter2(root);
	}

	private int diameter2(Node node) {

		if (node == null) {
			return 0;
		}

		// max distance between 2 leaf nodes might lie in left subtree : left ka
		// diameter
		int ld = diameter2(node.left);

		// max distance between 2 leaf nodes might lie in right subtree : right ka
		// diameter
		int rd = diameter2(node.right);

		// self node might be the root node of diameter
		int sd = ht(node.left) + ht(node.right) + 2;

		return Math.max(sd, Math.max(ld, rd));
	}

	private class DiaPair {
		int dia = 0;
		int ht = -1;
	}

	public int diameter3() {
		return diameter3(root).ht;
	}

	private DiaPair diameter3(Node node) {

		if (node == null) {
			return new DiaPair();
		}

		DiaPair ldp = diameter3(node.left);
		DiaPair rdp = diameter3(node.right);

		DiaPair sdp = new DiaPair();

		int ld = ldp.dia;
		int rd = rdp.dia;
		int sd = ldp.ht + rdp.ht + 2;

		sdp.dia = Math.max(sd, Math.max(ld, rd));
		sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;

		return sdp;

	}

	public boolean isBalanced2() {
		return isBalanced2(root);
	}

	private boolean isBalanced2(Node node) {

		if (node == null) {
			return true;
		}

		boolean lb = isBalanced2(node.left);
		boolean rb = isBalanced2(node.right);

		int bf = ht(node.left) - ht(node.right);

		if (lb && rb && bf >= -1 && bf <= 1) {
			return true;
		} else {
			return false;
		}

	}

	private class BalPair {
		boolean isBal = true;
		int ht = -1;
	}

	public boolean isBalanced3() {
		return isBalanced3(root).isBal;
	}

	private BalPair isBalanced3(Node node) {

		if (node == null) {
			return new BalPair();
		}

		BalPair lbp = isBalanced3(node.left);
		BalPair rbp = isBalanced3(node.right);

		BalPair sbp = new BalPair();

		boolean lb = lbp.isBal;
		boolean rb = rbp.isBal;

		int bf = lbp.ht - rbp.ht;

		if (lb && rb && bf >= -1 && bf <= 1) {
			sbp.isBal = true;
		} else {
			sbp.isBal = false;
		}

		sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;

		return sbp;

	}

	public boolean flipEquivalent(BinaryTree other) {
		return flipEquivalent(root, other.root);
	}

	private boolean flipEquivalent(Node node1, Node node2) {

		if (node1 == null && node2 == null) {
			return true;
		}

		if (node1 == null && node2 != null) {
			return false;
		}

		if (node1 != null && node2 == null) {
			return false;
		}

		if (node1.data != node2.data) {
			return false;
		}

		boolean ll = flipEquivalent(node1.left, node2.left);
		boolean rr = flipEquivalent(node1.right, node2.right);

		if (ll && rr) {
			return true;
		}

		boolean lr = flipEquivalent(node1.left, node2.right);
		boolean rl = flipEquivalent(node1.right, node2.left);

		return (lr && rl);

	}

	// NLR : preorder
	// LNR : inorder
	// LRN : postorder
	// NRL : rev postorder
	// RNL : rev inorder
	// RLN : rev preorder
	public void preorder() {
		preorder(root);
	}

	private void preorder(Node node) {

		if (node == null) {
			return;
		}

		// N
		System.out.println(node.data);

		// R
		preorder(node.right);

		// L
		preorder(node.left);

	}

}
