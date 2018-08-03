package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddSet {

	/*public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("Kumar");
		
//		///for add
//		al.add(1, "Sachin");
//		for (String s : al) {
//			System.out.println(s);
//		}
		
		///for see
		al.set(1, "Sachin");
		for (String s : al) {
			System.out.println(s);
		}
		

		// System.out.println("Element at 2nd position: "+al.get(2));

		
	}*/
	
	public static void main(String[] args) {
		
		List< List<String> > addresses = new ArrayList<List<String>>();
		ArrayList<String> singleAddress = new ArrayList<String>();
		singleAddress.add("17 Fake Street");
		singleAddress.add("Phoney town");
		singleAddress.add("Makebelieveland");

		addresses.add(singleAddress);
		
		singleAddress.add(" Street");
		singleAddress.add("town");
		singleAddress.add("and");

		addresses.add(singleAddress);
		
		/*ArrayList<String> singleAddress1 = new ArrayList<String>();
		singleAddress1.add("Street");
		singleAddress1.add("town");
		singleAddress1.add("veland");

		addresses.add(singleAddress1);*/
		
		for(int i=0 ; i<addresses.size(); i++) {
			ArrayList<String> single=(ArrayList<String>) addresses.get(i);
			System.err.println(single.get(0)+"   "+single.get(1)+"   "+single.get(2)+"   ");
			
		}
		
		
		
		

		// System.out.println("Element at 2nd position: "+al.get(2));

		
	}

}
