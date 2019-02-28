package Lesson21_innerClass;
/*
 * 匿名内部类
 */
public class InnerClass2 {
	
	public static void test(A aa){
		aa.a();
	}
	
	public static void main(String[] args) {
		InnerClass2.test(new A(){

			@Override
			public void a() {
				System.out.println("InnerClass2.main(...).new A() {...}.a()");
			}
			
		});
}

	
}

interface A{
	void a();
}
