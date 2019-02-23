package Lesson15_recu;

public class MyRecur {
	public static void main(String[] args) {
		System.out.println("递归的练习");
		
		MyRecur recur= new MyRecur();
		
		System.out.println(recur.getSum(100));
	}
	
	/*
	 * 利用递归球自然序列的和
	 * 例如：n=10,则求1+2+3+...10
	 */
	int getSum(int n){
		
		if (n==1) {
			
			return 1;
		}
		
		return n+getSum(n-1);
	}
}
