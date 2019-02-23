package Lesson20_String;

public class IndexOf_str {
	public static void main(String[] args) {
		System.out.println("在一个字符串中检索另一个字符串");
		
		String str="I am Yyz, and I am 20 years old.";
		int index1=str.indexOf("20");
		System.out.println(index1);
		int index2=str.indexOf("I", 1);
		System.out.println(index2);
		//如果检索不到系统会返回-1
		System.out.println(str.indexOf("c"));
		
		int index=0;
		while((index=str.indexOf("I", index))!=-1)
		{
			System.out.println(index);
			index+="I".length();
		}
	}
}
