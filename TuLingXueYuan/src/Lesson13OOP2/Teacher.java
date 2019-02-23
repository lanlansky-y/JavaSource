package Lesson13OOP2;

public class Teacher {
	public static void main(String[] args) {
		System.out.println("成员方法的练习");
		
		Teacher tea=new Teacher();
		tea.name="刘大拿";
		tea.age=18;
		tea.school="浙江大学城市学院";
		
		System.out.println(tea.name);
		System.out.println(tea.age);
		System.out.println(tea.school);
		tea.sayHello("JAVA", "girl");
	}
	
	String name;
	int age;
	String school;
	
	//void表示不需要返回结果
	void sayHello(String course, String lover){
		System.out.println("我的名字叫" + name);
		System.out.println("我教" + course);
		System.out.println("我爱" + lover);
	}
}
