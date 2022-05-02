package com.gl.lab.brakets;

public class BraketsClient {

	public static void main(String[] args) {
		//String str = "([[{}]])";
	   //String str = "([[{}]]]";
	    String str = "([[{}]])]";
		int length = str.length();
		boolean isBalanced = true;
		if(length%2!=0) {
			isBalanced = false;
		} else {
			for (int i = 1; i <= length / 2; i++) {
				char startBraket = str.charAt(i - 1);
				char endBraket = str.charAt(length - i);
				if (!isBalanced)
					break;
				if('(' == startBraket && ')' != endBraket)
					isBalanced = false;
				if('[' == startBraket && ']' != endBraket)
					isBalanced = false;
				if('{' == startBraket && '}' != endBraket)
					isBalanced = false;

			}
		}
		
		if (isBalanced) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
