import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");
		System.out.println("Hi all!");
		test2();
		
		Class1 class1obj = new Class1("New object", 1);
		class1obj.hello();
		class1obj.fillArrayList();
		class1obj.readArrList();
		System.out.println("");
		
		test3();
		
	}
	
	public static void test2() {
		int x=100;
		System.out.println(x);
		System.out.println(x*10);
	}
	
	public static void test3() {
		ArrayList<Class1> arrArrList = new ArrayList<>();
		for (int i=0;i<10;i++) {
			Class1 class1obj1 = new Class1("New object", i);
			class1obj1.fillArrayList();
			arrArrList.add(class1obj1);
		}
		for (int i=0;i<10;i++) {
			Class1 class1obj1 = arrArrList.get(i);
			System.out.println(class1obj1.toString());
		}
	}
}
