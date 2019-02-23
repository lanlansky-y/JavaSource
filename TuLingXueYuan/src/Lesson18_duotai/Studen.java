package Lesson18_duotai;

public class Studen extends Person{
	public static void main(String[] args) {
		System.out.println("关于多态的练习");
		
		Person p=new Studen();
		p.eat();
		p.sayHi();
		
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Studen);
	}
	
	
	void eat(){
		System.out.println("学生吃的是营养餐");
	}
	
	static void sayHi(){
		System.out.println("上课去咯");
	}
}
