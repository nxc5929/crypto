package common;

public class Shifts {
	
	public static final int SHORT_BITS = 16;
	
	public static char leftRotate(char num, int shift) {
		return (char) ((num << shift ) | (num >> (SHORT_BITS - shift)));
	}
	
	public static char rightRotate(char num, int shift) {
		return (char) ((num >> shift ) | (num << (SHORT_BITS - shift)));
	}

}
