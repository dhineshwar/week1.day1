package week1.day1;

public class Fibbinocci_series {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.println(a);
		System.out.println(b);
		
		
		for (int i=0; i<=9; i++)
		{
			c = a + b;
			System.out.println(c);
			
			 a = b;
			 b = c;
		}
		

	}

}
