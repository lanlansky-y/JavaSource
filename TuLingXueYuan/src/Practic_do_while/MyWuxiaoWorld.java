package Practic_do_while;

import java.util.Scanner;

public class MyWuxiaoWorld {
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		String answer="y";
		String name;
		do {
			System.out.println("��ӭ�����ӹ�������磬����������쵱�������Ŵ���������!");
			name=input.nextLine();
			System.out.println("ͷ�Σ������뽭����\n���ţ�"+name+
					"\n���������Ƿ��������Ľ������ţ�(y/n) - ");
			answer=input.nextLine();
		} while (!("y".equalsIgnoreCase(answer)));
		System.out.printf("%s���������˽�������С֮���������룡", name);
		
	}
}
