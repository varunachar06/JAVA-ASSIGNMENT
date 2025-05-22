// 1. Write a Java program to iterate through all elements in a linked list starting at the
// specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
import java.util.*;
public class IterateFromSecondLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>	ls = new LinkedList<>();
		ls.add("Black");
		ls.add("Saffron");
		ls.add("Brown");
		ls.add("Yellow");
		ls.add("Violet");
		//using an iterator for accesing all the elements
		Iterator iterator = ls.listIterator(1);
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
		}
	}

}
