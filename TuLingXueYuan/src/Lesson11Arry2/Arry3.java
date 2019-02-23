package Lesson11Arry2;

public class Arry3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr1= new int[2][3];
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + ",");
			}
			System.out.print("\n");
		}
		
		int[][] arr2={{1,2,3},{4,5,6,7}};
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println(arr2);
	}

}
