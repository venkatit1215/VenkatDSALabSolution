package com.gl.lab.pairsum;

import java.util.HashSet;
import java.util.Set;

public class PairSumMain {

	public static void main(String[] args) {

		Node root = null;
		PairSumService findSumPair = new PairSumService();
		root = findSumPair.inset(root, 40);
		root = findSumPair.inset(root, 20);
		root = findSumPair.inset(root, 10);
		root = findSumPair.inset(root, 30);
		root = findSumPair.inset(root, 60);
		root = findSumPair.inset(root, 50);
		root = findSumPair.inset(root, 70);

		Set<Integer> set = new HashSet<Integer>();
		if (!findSumPair.findPairSumUntill(set, 130, root)) {
			System.out.println("nodes are not found");
		}

	}

}