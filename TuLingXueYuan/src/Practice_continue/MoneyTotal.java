package Practice_continue;

import java.util.Scanner;

public class MoneyTotal {
	public static void main(String[] args) {
		System.out.println("��Ҫ����5���û������Ѷ�ȣ�ͳ�����Ѷ����500���û�����");
		Scanner input=new Scanner(System.in);
		int i=0,j=0;
		while(j<5)
		{
			int money=input.nextInt();
			j++;
			if(money>=500)
				continue;
//			if (money<500) {
//				i++;
//			}
			i++;
		}
		System.out.println(i);
	}
}
