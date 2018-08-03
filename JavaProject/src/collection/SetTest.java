package collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");

		System.out.println(set.size());

		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// //Traversing elements
		// Iterator itr=set.iterator();
		// while(itr.hasNext()){
		// System.out.println(itr.next());
		// }

	}

}
