package javaProgrammes;

public class FibonaccySeries {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		int temp;
		
		
		
		for(int i=0;i<5;i++) {
			temp=first+second;
			System.out.println(second + " + " + temp + " = " + temp);
		first=second;
		second=temp;
		}
		
		System.out.println(second);
		
		

	}

}
