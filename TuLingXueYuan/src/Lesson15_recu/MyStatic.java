package Lesson15_recu;

public class MyStatic {
	public static void main(String[] args) {
		System.out.println("static����ϰ");
		
		MyStatic.zuoyouming="���ѧ����";
		System.out.println(MyStatic.zuoyouming);
		
		MyStatic sta=new MyStatic();
		
		
	}
	
	String name;
	int age;
	static String zuoyouming;
	
	{
		/*
		 * ����飺ÿ����һ�������ִ��һ��
		 * ע�⹹����д��
		 */
		System.out.println("���ǹ���飬�ұ�ִ����");
	}
	
	static {
		/*
		 * ��̬����飺ֻ�ᱻִ��һ��
		 */
		System.out.println("���Ǿ�̬����飬�ұ�ִ����");
	}
}
