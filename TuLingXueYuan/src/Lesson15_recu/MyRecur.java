package Lesson15_recu;

public class MyRecur {
	public static void main(String[] args) {
		System.out.println("�ݹ����ϰ");
		
		MyRecur recur= new MyRecur();
		
		System.out.println(recur.getSum(100));
	}
	
	/*
	 * ���õݹ�����Ȼ���еĺ�
	 * ���磺n=10,����1+2+3+...10
	 */
	int getSum(int n){
		
		if (n==1) {
			
			return 1;
		}
		
		return n+getSum(n-1);
	}
}
