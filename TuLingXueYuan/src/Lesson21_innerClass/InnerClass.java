package Lesson21_innerClass;
/*
 * ��Ա�ڲ���
 * �Ǿ�̬�ڲ���
 */
public class InnerClass {
	public static void main(String[] args) {
		Outer.Inner inner=new Outer().new Inner();
		inner.show();
	}
}

class Outer{
	private String name="������";
	private int age=27;
	
	public void run(){
		System.out.println("�ձ����ܵ����");
	}
	
	
	class Inner{
		String name="С��";
		int age=25;
		public void show(){
			String name="XiaoYoung";
			int age=18;
			System.out.printf("�ҵ����֣�%s���ҽ���%d���ˡ�\n",Outer.this.name,Outer.this.age);
			Outer.this.run();
			System.out.printf("�ҵ����֣�%s���ҽ���%d���ˡ�\n",this.name,this.age);
			System.out.printf("�ҵ����֣�%s���ҽ���%d���ˡ�",name,age);
			
		}
	}
}