package javaProgrammes;

public class StringConcat {

	public static void main(String[] args) {
		String str="Rahul";
		String str1="Kapse";
		
		String str2=str1.concat(str);
		System.out.println("concating string into third variable"+str2);
		System.out.println("**************************************");
		
		System.out.println(str1.concat(str));
		
		StringBuffer str3=new StringBuffer("Kapse1");
		str3.append(str);
		System.out.println(str3);
		
		System.out.println("*****************************");
		
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			System.out.println(ch);
		}

	}

}
