package Lesson17_inher2;

public class Student extends Person{
	
	public static void main(String[] args) {
		System.out.println("���ǹ��ڼ̳и��๹�캯������ϰ");
		
		Student stu1=new Student();
		Student stu2=new Student(6);
	}
	
	Student(){
		System.out.println("��û�в�����д�ڸ��๹�캯���ĺ���");
	}
	
	Student(int a ){
		super(a);
		System.out.println("���в�����д�ڸ��๹�캯���ĺ���");
	}
}
