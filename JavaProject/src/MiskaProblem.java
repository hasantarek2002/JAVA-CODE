import java.util.Arrays;
import java.util.Scanner;
public class MiskaProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		int x;
		int arr[];
		x=a.nextInt();
		arr=new int[x];
		for(int i=0; i<x; i++)
		{
			arr[i]=a.nextInt();
		}
		SortArrayByMiska b= new SortArrayByMiska(arr);
		 //MiskaByPrintingMaxValue c=new
		
		//int max1=b.ReturnMaxValue();
		//System.out.print(max+" ");
	}

}
