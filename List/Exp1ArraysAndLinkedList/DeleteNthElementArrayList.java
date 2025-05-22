// 5. Write a java program for getting different colors through ArrayList interface and delete nth
// element from the ArrayList object by using remove by index

import java.util.*;
public class DeleteNthElementArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Black");
		ls.add("Saffron");
		ls.add("Pink");
		ls.add("Brown");
		ls.add("Yellow");
//		int n=2;
		String Str="Saffron";
		System.out.println(ls);
		// to remove an elemet at the specified position
		System.out.println("Removing the nth Element:"+ls.remove(Str));
		System.out.println(ls);
	}

}
