package Lesson14OOP_init;

public class Student {
	public static void main(String[] args) {
		System.out.println("关于构造函数的练习");
		
		Student stu1 = new Student();
		stu1.sayHello();
		
		Student stu2 = new Student("刘小拿");
		stu2.sayHello();
		
		Student stu3 = new Student(20);
		stu3.sayHello();
	}
	
	String name;
	int age;
	String school;
	
	Student(){
		school = "北京图灵学院";
	}
	Student(String name){
		this.name = name;
	}
	Student(int age){
		this.age=age;
	}
	
	void sayHello(){
		System.out.println("我叫"+this.name+
				"，我的年龄是"+this.age+
				"，我的学校是"+this.school);
	}
}
