package Lesson18_duotai;

public class Studen extends Person{
	public static void main(String[] args) {
		System.out.println("���ڶ�̬����ϰ");
		
		Person p=new Studen();
		p.eat();
		p.sayHi();
		
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Studen);
	}
	
	
	void eat(){
		System.out.println("ѧ���Ե���Ӫ����");
	}
	
	static void sayHi(){
		System.out.println("�Ͽ�ȥ��");
	}
}
