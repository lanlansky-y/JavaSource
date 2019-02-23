package Practice_yanxi;

public class Perform {
	public static void main(String[] args) {
		Director Wujing=new Director();
		Singer JayChou=new Singer("JayChou");
		Dancer Yiyangqianxi=new Dancer("Yiyangqianxi");
		
		Wujing.action(JayChou);
		Wujing.action(Yiyangqianxi);
	}
}
