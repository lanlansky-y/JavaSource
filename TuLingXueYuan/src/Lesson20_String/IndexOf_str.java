package Lesson20_String;

public class IndexOf_str {
	public static void main(String[] args) {
		System.out.println("��һ���ַ����м�����һ���ַ���");
		
		String str="I am Yyz, and I am 20 years old.";
		int index1=str.indexOf("20");
		System.out.println(index1);
		int index2=str.indexOf("I", 1);
		System.out.println(index2);
		//�����������ϵͳ�᷵��-1
		System.out.println(str.indexOf("c"));
		
		int index=0;
		while((index=str.indexOf("I", index))!=-1)
		{
			System.out.println(index);
			index+="I".length();
		}
	}
}
