package day_24_assignment;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number {
	
	public static boolean ishappy(int n)
	{
		Set<Integer> x=new HashSet<>();
		while(n!=1 && !x.contains(n))
		{
			x.add(n);
			 n = getNext(n);
		}
		
		return n==1;
		
	}
	private static int getNext(int n) {
		int sum=0;
		while(n>0)
		{
			int digit=n%10;
			sum+=digit * digit;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int n=2;
		boolean result=ishappy(n);
		System.out.println(result);

	}

}
