package Lesson14OOP_init;

public class Student {
	public static void main(String[] args) {
		System.out.println("���ڹ��캯������ϰ");
		
		Student stu1 = new Student();
		stu1.sayHello();
		
		Student stu2 = new Student("��С��");
		stu2.sayHello();
		
		Student stu3 = new Student(20);
		stu3.sayHello();
	}
	
	String name;
	int age;
	String school;
	
	Student(){
		school = "����ͼ��ѧԺ";
	}
	Student(String name){
		this.name = name;
	}
	Student(int age){
		this.age=age;
	}
	
	void sayHello(){
		System.out.println("�ҽ�"+this.name+
				"���ҵ�������"+this.age+
				"���ҵ�ѧУ��"+this.school);
	}
}
