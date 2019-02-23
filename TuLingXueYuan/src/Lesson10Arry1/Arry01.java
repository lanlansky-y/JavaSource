package Lesson10Arry1;

public class Arry01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[6];
		int[] arr2={1,2,3,4,5};
		for (int i = 0; i < arr2.length; i++) {
			arr1[i]=arr2[i];
		}
		System.out.println(arr1);
		System.out.println(arr2);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		
		int[] a=new int[8];
		int[] b={1,2,3,4,5,6};
		System.out.println(a);
		System.out.println(b);
		a=b;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		System.arraycopy(arr1, 0, b, 1, 5);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
