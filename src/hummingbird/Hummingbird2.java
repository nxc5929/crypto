package hummingbird;

import common.Merge;
import common.Shifts;

public class Hummingbird2 {

	private char[] INTERNAL_STATE = new char[] {1, 2, 3, 4, 5, 6, 7, 8};
	private char[] KEY = new char[] {1, 2, 3, 4, 5, 6, 7, 8};
	private SBox sBox;
	
	public Hummingbird2() {
		sBox = new SBox();
	}
	
	public char WD16(char x, char a, char b, char c, char d) {
		return f((char) (f((char) (f((char) (f((char) (x ^ a)) ^ b)) ^ c)) ^ d));
	}
	
	private char f(char input) {
		System.out.println("Input: " + (int)input);
		char[] seperate = Merge.unMerge(input);
		for(char v : seperate) {
			System.out.print((int)v + ", ");
		}
		System.out.println();
		
		for(int i = 0; i < seperate.length; i++) {
			seperate[i] = sBox.getValue(i, seperate[i]);
			System.out.print((int)seperate[i] + ", ");
		}
		System.out.println();
		
		char merge = Merge.merge(seperate);
		System.out.println("Merge: " + (int)merge);
		
		int shift6 = Shifts.leftRotate(merge, 6);
		System.out.println("Shift6: " + shift6);
		int shift10 = Shifts.leftRotate(merge, 10);
		System.out.println("Shift10: " + shift10);
		
		return (char) (merge ^ shift6 ^ shift10);
	}
	
}
