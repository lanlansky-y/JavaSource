package Practice_yanxi;

public class Singer extends Actor{
	
	public Singer(){
		
	}
	
	public Singer(String name){
		super(name);
	}
	
	public void perform(){
		System.out.println(this.getName()+"���ڳ���ϲ�������̫�ǡ�");
	}
}
