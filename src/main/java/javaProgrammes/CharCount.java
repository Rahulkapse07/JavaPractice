package javaProgrammes;

public class CharCount {

	public static void main(String[] args) {
		// String str="Rahul";
		int count = 0;
		int space = 0;
		StringBuffer str = new StringBuffer("Rahul Kapse Test");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				// str.charAt(i);
				count++;
			} else {
				space++;
			}
		}
		System.out.println("Total space in given string:-" + space);
		System.out.println("Total char in Given String :-" + count);
	}
}
