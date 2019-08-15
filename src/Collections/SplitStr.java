package Collections;
class SplitStr {
	public static void main(String args[]) {
		String str = "1200:541:100:50:4500"; // marge two string in one
		String[] sArr = str.split(":");
		int length = sArr.length;
		int[] iArr = new int[length];
		int temp;
		for (int i = 0; i < length; i++) {
			iArr[i] = Integer.parseInt(sArr[i]); // convert String into integer array
		}
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (iArr[i] >= iArr[j]) {
					temp = iArr[i];
					iArr[i] = iArr[j];
					iArr[j] = temp;
				}
			}
		}
		for (int i = 0; i < length; i++) { // printing loop
			System.out.println(" " + iArr[i]);
		}
	}
}