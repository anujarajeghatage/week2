package codingpractice;

import java.util.LinkedList;
import java.util.List;

public class linkedlistexample {

	public static void main(String[] args) {
		List<String> obj1=new LinkedList<>();
		obj1.add("india");
		obj1.add("uk");
		obj1.add("ukrain");
		obj1.add("bali");
System.out.println(obj1);
obj1.set(2, "xyz");
System.out.println(obj1);
obj1.addfirst("mycountry");
obj1.addlast("cbz");
System.out.println(obj1);
obj1.remove(4);
System.out.println(obj1);


		

	}

}
