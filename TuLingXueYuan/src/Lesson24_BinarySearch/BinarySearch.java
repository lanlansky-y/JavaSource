package Lesson24_BinarySearch;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr={2,50,30,40,55,60,80,70,99,888,1111,6};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr, 1111));
	}
	
	public static int binarySearch(int[] a,int value){
		int low,mid,high;
		low=0;
		high=a.length-1;
		
		while(low<=high){
			mid=(low+high)/2;
			if (value==a[mid]) {
				return mid;
			}
			if (value<a[mid]) {
				high=mid-1;
			}
			if (value>a[mid]) {
				low=mid+1;
			}
			
		}
		return -1;
	}
}
