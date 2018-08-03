import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int arr[]={1,2,5,2,88,0,0,13,2};
		int temp;
		//System.out.print(arr.length+" ");
		for(int j=0; j<arr.length; j++)
		{
			for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		*/
		Scanner a=new Scanner(System.in);
		int x,temp;
		x=a.nextInt();
		int arr[]=new int[x];
		for(int i=0; i<x; i++)
		{
			arr[i]=a.nextInt();
		}
		
		for(int j=0; j<arr.length; j++)
		{
			for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
