package tester;

import common.Merge;
import common.Shifts;
import hummingbird.Hummingbird2;

public class Main {
	
	public static void main(String[] args) {
		Hummingbird2 hum = new Hummingbird2();
		char inputText = 'a';
		char a = 1;
		char b = 2;
		char c = 3;
		char d = 4;
		System.out.println((int)hum.WD16(inputText, a, b, c, d));
	}
	
}
