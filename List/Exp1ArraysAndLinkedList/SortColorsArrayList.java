// 3. Write a java program for getting different colors through ArrayList interface and sort them
// using Collections.sort( ArrayListObj)


import java.util.*;
public class SortColorsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Saffron");
		ls.add("Black");
		ls.add("Yellow");
		ls.add("Violet");
		ls.add("Brown");
		System.out.println("Before sorting:");
		System.out.println(ls);
		//inbuilt function to sort
		Collections.sort(ls);
		System.out.println("After sorting:");
		System.out.println(ls);
	}

}
