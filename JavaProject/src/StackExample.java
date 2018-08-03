import java.util.Stack;

import javax.print.attribute.standard.RequestingUserName;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Stack<Integer> s = new Stack<Integer>();
		// s.push(5);
		// s.push(1);
		// s.push(23);
		// s.push(25);
		// System.out.println("size is "+s.size());

		// int size=s.size();
		// for(int i=0; i<size; i++){
		// int temp=s.peek();
		// s.pop();
		// System.out.println(temp);
		// }

		// while(!s.empty()){
		// int temp=s.peek();
		// s.pop();
		// System.out.println(temp);
		// }

		// Stack <int[]>s=new Stack<int[]>();
		Stack<int[]> s = new Stack<int[]>();
		int[] arr = { 4, 3 };
		// s.push({4,3});
		s.push(arr);
		int[] arr1 = { 5, 3 };
		s.push(arr1);
		int[] arr2 = { 5, 4 };
		s.push(arr2);

		System.out.println("stack size is : " + s.size());
		
		int size = s.size();
		Stack<int[]> newStack = returnStack(s);
		System.out.println("new stack size is : " + newStack.size());
		//newStack=returnStack(s);
//		System.out.println("new stack size is : " + newStack.size());
//		while(!s.empty()){
//			newStack.push(s.pop());
//			
//		}
//		System.out.println("new stack size is : " + newStack.size());
//		
		
//		int maxX, minX, maxY, minY;
//		int[] a = s.peek();
//		maxX = a[0];
//		minX = a[0];
//		maxY = a[1];
//		minY = a[1];
//		
		
//		for (int i = 0; i < size; i++) {
//			int[] x = s.peek();
//			if (maxX < x[0]) {
//				maxX = x[0];
//			}
//			if (minX > x[0]) {
//				minX = x[0];
//			}
//			if (maxY < x[1]) {
//				maxY = x[1];
//			}
//			if (minY > x[1]) {
//				minY = x[1];
//			}
//
//			s.pop();
//			System.out.println(x[0] + " " + x[1]);
//		}
		
//		System.out.println("max row  is : " + maxX + "\nmin row  is : " + minX + "\nmax column is : " + maxY
//				+ "\nmin colum is : " + minY);
//		System.out.println("stack size is : " + s.size());

	}
	private static Stack<int[]> returnStack(Stack <int[]>stack){
		Stack <int[]>stack1=new Stack<int[]>();
		while(!stack.empty()){
			stack1.push(stack.pop());
		}
		return stack1;
	}

}
