package Lesson13OOP2;

public class Teacher {
	public static void main(String[] args) {
		System.out.println("��Ա��������ϰ");
		
		Teacher tea=new Teacher();
		tea.name="������";
		tea.age=18;
		tea.school="�㽭��ѧ����ѧԺ";
		
		System.out.println(tea.name);
		System.out.println(tea.age);
		System.out.println(tea.school);
		tea.sayHello("JAVA", "girl");
	}
	
	String name;
	int age;
	String school;
	
	//void��ʾ����Ҫ���ؽ��
	void sayHello(String course, String lover){
		System.out.println("�ҵ����ֽ�" + name);
		System.out.println("�ҽ�" + course);
		System.out.println("�Ұ�" + lover);
	}
}
