package Lesson19_object;

import java.math.BigInteger;

public class BigInteger_test {
	
	public static void main(String[] args) {
		
		BigInteger sum=BigInteger.valueOf(1);
		
		for(int i=1;i<=100;i++)
		{
			sum=sum.multiply(BigInteger.valueOf(i));
		}
		System.out.println(sum);
		System.out.println(sum.toString().length());
	}
	
}
