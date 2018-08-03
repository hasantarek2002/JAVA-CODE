import java.util.Arrays;
public class SortArrayByMiska {
	private int arr[];
	int max=0;
	int maxValue;
	MiskaByPrintingMaxValue c=new MiskaByPrintingMaxValue();
	public SortArrayByMiska(int arr[])
	{
		this.arr=arr;
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++)
		{
			max=Math.max(arr[i],arr[i+1]);
		}
		//System.out.print(max+" ");
		c.printMaxValue(max);
	}
	//MiskaByPrintingMaxValue c=new MiskaByPrintingMaxValue();
	//c.printMaxValue(max);
	//MiskaByPrintingMaxValue c=new MiskaByPrintingMaxValue(max);
	//maxValue=c.ReturnMaxValue();
	/*
	public int ReturnMaxValue()
	{
		return max;
	}
	*/
	
}
