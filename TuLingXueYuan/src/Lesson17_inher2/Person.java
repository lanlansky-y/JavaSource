package Lesson17_inher2;

public class Person {
	String name;
	int age;
	
	void eat(){
		System.out.println("大快朵颐");
	}
	
	Person(){
		System.out.println("我的绰号是xxx");
	}
	
	Person(int a){
		System.out.println("我有"+a+"个梦想");
	}
}
