package Lesson23_BubbleSort;

import java.util.Arrays;

/*
 * ð������:�������е�Ԫ�������Ƚϣ�����С�����˳������
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] b={5,1,4,8,9,7,3,6,2,0};
		int count=0;
//		Arrays.sort(b);
//		System.out.println(Arrays.toString(b));
		for (int i = 0; i < b.length-1; i++) {
			boolean flag=true;
			for (int j = 0; j < b.length-1-i; j++) {
				if (b[j]>b[j+1]) {
					int temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
					flag=false;
				}
				System.out.println(Arrays.toString(b));
			}
			if (flag) {
				
				System.out.println("������"+count);
				break;
			}
			count++;
			System.out.println(count);
		}
		
	}
}
