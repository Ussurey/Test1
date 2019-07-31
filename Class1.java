
public class Class1 {
	private String name;
	private int id;
	
	
	public Class1(String name, int id){
		this.id = id;
		this.name = name;
	}
	
	public void hello() {
		System.out.println(name+"("+id+"): Hello!");
	}
}
