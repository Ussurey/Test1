import java.util.ArrayList;

public class Class1 {
	private String name;
	private int id;
	private ArrayList<Integer> arrList;
	
	
	public Class1(String name, int id){
		this.id = id;
		this.name = name;
	}
	
	public Class1(String name, int id, ArrayList<Integer> arrList){
		this.id = id;
		this.name = name;
		this.arrList = new ArrayList<>();
		this.arrList.addAll(arrList);
	}
	
	public void hello() {
		System.out.println(name+"("+id+"): Hello, World!");
	}
	
	public void fillArrayList() {
		arrList = new ArrayList<>();
		for (int i=0;i<100;i++) {
			arrList.add(i);
		}
	}
	
	public void readArrList() {
		for (int i=0;i<arrList.size();i++) {
			System.out.print(((i>0)? ", ":"")+arrList.get(i));
		}
		System.out.println("");
		
	}
	
	public String toString() {
		String str = "";
		str = str+name+"("+id+"): ";
		for (int i=0;i<arrList.size();i++) {
			str = str+ ((i>0)? ", ":"")+arrList.get(i);
		}
		
		return str;
		
	}
}
