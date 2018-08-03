package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListToArray {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
//		System.out.println(list.size());
//		
//		list.remove("Ravi");
//		
//		System.out.println(list.size());
		
//		//deleting element
//		int size = list.size();
//		for(String s: list){
//			if(s.equals("Ravi")){
//				list.remove(s);
//				System.out.println("done");
//				break;
//			}
//		}
		
		//deleting element from array list
		for(int i=0; i<list.size();i++){
			//System.out.println(list.get(i));
			
			String s=list.get(i);
			//System.out.println(s);
			
			if(s.equals("Ravi")){
				list.remove(s);
				System.out.println("delete element done");
				System.out.println("list size is : "+list.size());
				i--;
			}
			else{
				System.out.println(s);
			}
		}
//		System.out.println("/////////");
//		for(int i=0; i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		
		int count=0;
//		Iterator it = list.iterator();
//		while (it.hasNext()) {
//			String s=(String)it.next();
//			if (s.equals("Ravi")) {
//				System.out.println(count);
//				count++;
//				list.remove(it.next());
//			} else {
//				System.out.println(it.next());
//			}
//
//		}
		// // Traversing list through Iterator
		// Iterator itr = list.iterator();
		// while (itr.hasNext()) {
		// System.out.println(itr.next());
		// }

		// convert to array
		// Object[] arr = list.toArray();
		// System.out.println(arr.length);
		// for (int i = 0; i < arr.length; i++) {
		//
		// System.out.println(arr[i]);
		// }
	}

}
