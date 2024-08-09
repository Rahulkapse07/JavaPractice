package javaProgrammes;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Plese enter a number to check palindrome or not");
		int first=sc.nextInt();
		int second=0;
		String firstNumber=Integer.toString(first);
		String secondNumber="";
		System.out.println("Individual digits of the number:");
        for (int i = firstNumber.length() - 1; i >= 0; i--) {
        	System.out.println(firstNumber.charAt(i));
        	char charc=firstNumber.charAt(i);
        	secondNumber = secondNumber.concat(String.valueOf(charc));
        	second= Integer.valueOf(secondNumber);
        }
        if(first == second)  {
    			System.out.println("Number array:  "+ firstNumber);
    			System.out.println("Number1 :  "+secondNumber);
    			System.out.println("number is palindrome");
    		}else {
    			System.out.println("Number array:  "+ firstNumber);
    			System.out.println("Number1 :  "+secondNumber);
    			System.out.println("Number is not a palindrome");
    		}
		
		
		
		
		
		
		
		/*ArrayList<String> ar=new ArrayList<String>();
		
		System.out.println("Plese enter a number to check palindrome or not");

		int number=sc.nextInt();
		String number1=String.valueOf(number);
		String arrayString = "";
		for(int i=number1.length()-1;i>=0;i--)
		{
		char ch =number1.charAt(i);
		arrayString.concat(String.valueOf(ch));
		}
		
		//String str= ar.get(0).toString();
		System.out.println(ar.toString());
		if(arrayString.equals(number1))
		{
			System.out.println("Number array:  "+ arrayString);
			System.out.println("Number1 :  "+number1);
			System.out.println("number is palindrome");
		}else {
			System.out.println("Number array:  "+ arrayString);
			System.out.println("Number1 :  "+number1);
			System.out.println("Number is not a palindrome");
		}*/
	}
	}


