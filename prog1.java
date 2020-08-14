
public class prog1 {

	static int secondlargest(int arr[])
	{
		int res=-1;
		int largest=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[largest])
			{
				res=largest;
				largest=i;
				
			}
			else if(arr[i]!=arr[largest])
				{
				if(res==-1 || arr[i]>arr[res])
				{
					res=i;
				}
				}
		}
		return res;
	}	
	public static void main(String[] args)
	{
		
		int[] arr= {44,56,21,30,91,45,16,22};
		int k=secondlargest(arr);
		System.out.println(arr[k]);
}
}