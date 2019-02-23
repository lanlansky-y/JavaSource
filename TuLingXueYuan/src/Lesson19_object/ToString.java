package Lesson19_object;

public class ToString {

	
	String name;
	int id;
	
	public ToString(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public String toString()
	{
		return this.name+" "+this.id;
	}
	
	public static void main(String[] args) {
		ToString ts = new ToString("yyz",5);
		
		System.out.println(ts);
	}

}
