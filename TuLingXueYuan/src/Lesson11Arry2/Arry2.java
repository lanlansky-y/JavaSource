package Lesson11Arry2;

import java.util.Scanner;

public class Arry2 {

	private static Scanner a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��һ��һά���飬�ڷ�10��ѧ���ĳɼ�
		 * Ҫ�󣬲�����ͺ���ߵ�
		 */
		int[] scores=new int[20];
		a = new Scanner(System.in);
		for (int i = 0; i < 20; i++) {
			scores[i]=a.nextInt();
		}
		int max=scores[0];
		int min=scores[0];
		System.out.println(scores.length);
//		System.out.println(scores[19]);
		for (int j = 0; j < scores.length; j++) {
			if (max < scores[j]) {
				max=scores[j];
			}
			if (min > scores[j]) {
				min=scores[j];
			}
		}
		
		System.out.println("���༶����߳ɼ�:"+max);
		System.out.println("���༶����ͳɼ�:"+min);
	}

}
