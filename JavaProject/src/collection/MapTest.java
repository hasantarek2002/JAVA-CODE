package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// for (int key : hm.keySet()) {
		// System.out.println(hm.get(key));
		// }
	}

}
