// Write a java program for getting different colors through ArrayList interface and extract the
// elements 1st and 2nd from the ArrayList object by using SubList()


import java.util.*;
public class SubListColorsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Black");
		ls.add("Blue");
		ls.add("Brown");
		ls.add("Yellow");
		ls.add("Saffron");
		System.out.println(ls);
		System.out.println("using sublist:");
		//to obtain a sublist
		System.out.println(ls.subList(0,2));
	}

}
