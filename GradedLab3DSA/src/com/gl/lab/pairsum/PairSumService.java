package com.gl.lab.pairsum;

import java.util.Set;

class PairSumService {

	public Node inset(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.data) {
			root.left = inset(root.left, key);
		} else {
			root.right = inset(root.right, key);
		}
		return root;
	}

	public boolean findPairSumUntill(Set<Integer> set, int sum, Node root) {

		if (root == null) {
			return false;
		}

		if (findPairSumUntill(set, sum, root.left)) {
			return true;
		}
		if (set.contains(sum - root.data)) {
			System.out.println("Pair is (" + (sum - root.data) + "," + root.data + ")");
			return true;
		} else {
			set.add(root.data);
		}

		return findPairSumUntill(set, sum, root.right);

	}
}