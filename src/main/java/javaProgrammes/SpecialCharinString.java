package javaProgrammes;

public class SpecialCharinString {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Rahul@India#1234");
		
		StringBuffer alphabet = new StringBuffer();
		StringBuffer specialChar = new StringBuffer();
		StringBuffer number = new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isAlphabetic(ch)) {
				alphabet.append(ch);
			} else if(Character.isDigit(ch)) {
				number.append(ch);
			}else {
				specialChar.append(ch);
			}
		}
		System.out.println("Toatal alphabet in String is :-"+alphabet);
		System.out.println("Toatal number in String is :-"+number);
		System.out.println("Toatal specialChar in String is :-"+specialChar);
	}

}
