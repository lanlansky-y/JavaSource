package Practice_array;

public class ShuffleCards {
	public static void main(String[] args) {
		final int N=52;
		int[] cards=new int[N];
		String[] cardsValues={"A","2","3","4","5","6","7","8","9","10","j","q","k"};
		String[] cardsColors={"黑桃","红桃","梅花","方块"};
		System.out.println("新牌");
		for (int i = 0; i < cards.length; i++) {
			cards[i]=i;
			System.out.print(cardsColors[cards[i]/13]+cardsValues[cards[i]%13]+"  ");
			if ((i+1)%13==0) {
				System.out.println();
			}
		}
		
		System.out.println("洗牌");
		for (int i = 0; i < cards.length; i++) {
			int index=(int)(Math.random()*52);
			int temp=cards[i];
			cards[i]=cards[index];
			cards[index]=temp;
		}
		
		System.out.println("洗牌后的样子");
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cardsColors[cards[i]/13]+cardsValues[cards[i]%13]+"  ");
			if ((i+1)%13==0) {
				System.out.println(); 
			}
		}
	}
}
