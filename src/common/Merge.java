package common;

public class Merge {

	public static char merge(char... values) {
		int power = 0;
		char result = 0;
		for(char value: values) {
			result+= value*Math.pow(16, power);
			power++;
		}
		return result;
	}
	
	public static char[] unMerge(char value) {
		char[] result = new char[4];
		for(int i = 0; i < 4; i++) {
			char newValue = (char) (value/16);
			result[i] = (char) (value - newValue*16);
			value = newValue;
		}
		return result;
	}
	
}
