package Practice_yanxi;

public class Actor {
	private String name;
	
	public void perform(){
		System.out.println(name+"���ڱ���");
	}
	
	public Actor() {
	
	}
	
	public Actor(String name){
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
