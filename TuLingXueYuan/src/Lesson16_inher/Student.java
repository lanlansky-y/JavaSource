package Lesson16_inher;

class Person{
	String name;
	int age;
	String address;
	String hobby;
	
	void eat(){
		System.out.println("³Ô·¹");
	}
}

public class Student extends Person{
	public static void main(String[] args) {
		Student stu=new Student();
		stu.eat();
	}
}
