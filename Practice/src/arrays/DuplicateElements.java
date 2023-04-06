package arrays;

public class DuplicateElements {

	public static void main(String[] args) 
	{
		

		
		
		
	}
	
	
	public static void duplicates(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(i);
				}
			}
		}
	}

}
