package Practic_do_while;

import java.util.Scanner;

public class MyWuxiaoWorld {
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		String answer="y";
		String name;
		do {
			System.out.println("欢迎进入金庸武侠世界，请少侠起个响当当的名号闯荡江湖吧!");
			name=input.nextLine();
			System.out.println("头衔：【初入江湖】\n名号："+name+
					"\n请问少侠是否满意您的江湖名号？(y/n) - ");
			answer=input.nextLine();
		} while (!("y".equalsIgnoreCase(answer)));
		System.out.printf("%s少侠进入了江湖，宵小之辈速速退离！", name);
		
	}
}
