package Lesson21_innerClass;
/*
 * 成员内部类
 * 非静态内部类
 */
public class InnerClass {
	public static void main(String[] args) {
		Outer.Inner inner=new Outer().new Inner();
		inner.show();
	}
}

class Outer{
	private String name="杨宇舟";
	private int age=27;
	
	public void run(){
		System.out.println("苏炳添跑的真快");
	}
	
	
	class Inner{
		String name="小杨";
		int age=25;
		public void show(){
			String name="XiaoYoung";
			int age=18;
			System.out.printf("我的名字：%s，我今年%d岁了。\n",Outer.this.name,Outer.this.age);
			Outer.this.run();
			System.out.printf("我的名字：%s，我今年%d岁了。\n",this.name,this.age);
			System.out.printf("我的名字：%s，我今年%d岁了。",name,age);
			
		}
	}
}