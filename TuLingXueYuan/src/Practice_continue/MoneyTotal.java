package Practice_continue;

import java.util.Scanner;

public class MoneyTotal {
	public static void main(String[] args) {
		System.out.println("需要输入5个用户的消费额度，统计消费额低于500的用户数量");
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
