package javaProgrammes;

import java.util.Arrays;

public class SrringReverse {

	public static void main(String[] args) {
		String str="Rahul";
		
		char[] reverse=new char[str.length()];
		for(int i=str.length()-1,j=0;i>=0;i--,j++)
		{
			reverse[j]=str.charAt(i);
			//System.out.println(ch);
		}
		System.out.println(Arrays.toString(reverse));
		
		
		System.out.println("********************");
		String temp="";
		
		temp=str;
		str=temp;
		//temp=str;
		System.out.println("String"+str);
		
	}

}
