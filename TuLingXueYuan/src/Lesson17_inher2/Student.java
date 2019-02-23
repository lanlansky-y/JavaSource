package Lesson17_inher2;

public class Student extends Person{
	
	public static void main(String[] args) {
		System.out.println("这是关于继承父类构造函数的练习");
		
		Student stu1=new Student();
		Student stu2=new Student(6);
	}
	
	Student(){
		System.out.println("我没有参数，写在父类构造函数的后面");
	}
	
	Student(int a ){
		super(a);
		System.out.println("我有参数，写在父类构造函数的后面");
	}
}
