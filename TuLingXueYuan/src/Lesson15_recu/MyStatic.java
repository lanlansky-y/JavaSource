package Lesson15_recu;

public class MyStatic {
	public static void main(String[] args) {
		System.out.println("static的练习");
		
		MyStatic.zuoyouming="活到老学到老";
		System.out.println(MyStatic.zuoyouming);
		
		MyStatic sta=new MyStatic();
		
		
	}
	
	String name;
	int age;
	static String zuoyouming;
	
	{
		/*
		 * 构造块：每生成一个对象就执行一次
		 * 注意构造块的写法
		 */
		System.out.println("我是构造块，我被执行了");
	}
	
	static {
		/*
		 * 静态构造块：只会被执行一次
		 */
		System.out.println("我是静态构造块，我被执行了");
	}
}
