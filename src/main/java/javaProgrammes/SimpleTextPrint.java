package javaProgrammes;

public class SimpleTextPrint {

	public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String count="";
        String str="Hello world 123";
      String arr[]=str.split(" ");
      System.out.println("Hello"+arr);
      for (String string : arr) {
    	  System.out.println(string);
		
	}
      
        
        for(int i=arr[0].length()-1;i>=0;i--)
        {
           char ch= arr[0].charAt(i);
           System.out.println(ch); 
           count +=ch;
           
        }
        System.out.println(count);
        
        for(int i=arr[1].length()-1;i>=0;i--)
        {
           char ch= arr[1].charAt(i);
           System.out.println(ch); 
        }
        for(int i=arr[2].length()-1;i>=0;i--)
        {
           char ch= arr[2].charAt(i);
           System.out.println(ch); 
        }
    }
}
