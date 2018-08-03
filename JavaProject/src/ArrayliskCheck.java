import java.util.ArrayList;

public class ArrayliskCheck {

	public static void main(String[] args) {
		ArrayList <Integer> arr=new ArrayList<Integer>();
		System.out.println(arr.size());
		for(int i=0; i<10; i++){
			arr.add(i);
		}
		System.out.println(arr.size());
		arr.clear();
		System.out.println(arr.size());
		arr.clear();
		System.out.println(arr.size());
//		for(int i=0; i<10; i++){
//			if(arr.get(i)==5) 
//				break;
//			System.out.println(arr.get(i));
//		}
		

	}

}
