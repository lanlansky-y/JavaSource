package Practic_do_while;

import java.util.Scanner;

public class Calculate_yunsuan {
	public static void main(String[] args) {
		System.out.println("ʹ��+-*/%��������");
		String choice="";
		Double num1=0.00,num2=0.00;
		Double result=0.00;
		String op=null;
		Scanner input=new Scanner(System.in);
		do{
			System.out.println("������������������");
			num1=input.nextDouble();
			num2=input.nextDouble();
			System.out.println("�������������");
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
					System.out.println("��������Ϊ0��");
				}else{
					result=num1/num2;
				}
				break;
			case "%":
				result=num1%num2;
				break;
			default:
				System.out.println("����������������");
				break;
			}
			System.out.println(result);
			System.out.println("�Ƿ�������㣿(y/n)");
			choice=input.next();
		}while("y".equalsIgnoreCase(choice));
		input.close();
		System.out.println("�´��ټ���");
	}
}
