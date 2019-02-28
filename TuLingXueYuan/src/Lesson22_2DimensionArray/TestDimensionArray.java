package Lesson22_2DimensionArray;

import java.util.Arrays;

/*
 * ²âÊÔ¶şÎ¬Êı×é
 */
public class TestDimensionArray {
	
	public static void main(String[] args) {
		Car[] cars=new Car[3];
		System.out.println(Arrays.toString(cars));
		
		int[][] a=new int[3][];
		a[0]=new int[]{1,2,3};
		a[1]=new int[]{10,20};
		a[2]=new int[]{100,200,300,400};
		
		System.out.println(a[1][1]);
		
		int[][] b={
				{1,2},
				{10,20,30},
				{100,200,300,400}
		};
		System.out.println(a[1][1]);
		
		
	}
	
	
}


class Car{
	
}