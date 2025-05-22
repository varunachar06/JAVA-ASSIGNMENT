// 2. Write a Java program to iterate a linked list in reverse order (using
// objlist.descendingIterator())
import java.util.*;
public class ReverseIterateLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>	ls = new LinkedList<>();
		ls.add("Black");
		ls.add("Brown");
		ls.add("saffron");
		ls.add("Yellow");
		ls.add("Violet");
		ListIterator<String> listIterator = ls.listIterator(ls.size());
       while (listIterator.hasPrevious()) {
           System.out.println(listIterator.previous());
       }

		
	}

}
