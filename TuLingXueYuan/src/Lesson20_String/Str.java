package Lesson20_String;

public class Str {
	public static void main(String[] args) {
		String str1="I am Yyz";
//		str1=str1.toUpperCase();
		System.out.println(str1);
		String str2="I am Yyz";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String s1="I am";
		String s2=s1;
		String s3=" Yyz";
		s1+=s3;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}
