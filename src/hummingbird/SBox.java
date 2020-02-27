package hummingbird;

public class SBox {
	
	private char[][] S_BOX;
	
	public SBox() {
		S_BOX = new char[4][];
		S_BOX[0] = new char[]{7, 12, 14, 9, 2, 1, 5, 15, 11, 6, 13, 0, 4, 8, 10, 3};
		S_BOX[1] = new char[]{4, 10, 1, 6, 8, 15, 7, 12, 3, 0, 14, 13, 5, 9, 11, 2};
		S_BOX[2] = new char[]{2, 15, 13, 1, 5, 6, 10, 13, 14, 8, 3, 4, 0, 11, 9, 7};
		S_BOX[3] = new char[]{15, 4, 5, 8, 9, 7, 2, 1, 10, 3, 0, 14, 6, 12, 13, 11};
	}
	
	public char getValue(int boxNum, char value) {
		return S_BOX[boxNum][value];
	}

}
