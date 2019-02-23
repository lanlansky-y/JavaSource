package Practic_do_while;

import java.util.Scanner;

public class Calculate_yunsuan {
	public static void main(String[] args) {
		System.out.println("使用+-*/%进行运算");
		String choice="";
		Double num1=0.00,num2=0.00;
		Double result=0.00;
		String op=null;
		Scanner input=new Scanner(System.in);
		do{
			System.out.println("请输入两个操作数：");
			num1=input.nextDouble();
			num2=input.nextDouble();
			System.out.println("请输入运算符：");
			op=input.next();
			switch (op) {
			case "+":
				result=num1+num2;
				break;
			case "-":
				result=num1-num2;
				break;
			case "*":
				result=num1*num2;
				break;
			case "/":
				if (num2==0) {
					System.out.println("除数不能为0！");
				}else{
					result=num1/num2;
				}
				break;
			case "%":
				result=num1%num2;
				break;
			default:
				System.out.println("您输入的运算符有误！");
				break;
			}
			System.out.println(result);
			System.out.println("是否继续运算？(y/n)");
			choice=input.next();
		}while("y".equalsIgnoreCase(choice));
		input.close();
		System.out.println("下次再见！");
	}
}
