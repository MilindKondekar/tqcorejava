package com.onedarrays;

public interface ThirdLowest {

	public static void main(String[] args) {
		
		
		int arr[]= {6,7,12,22,5,20,24,1,1,7,5,5,2,3,21,23};
		
		int highest=Integer.MIN_VALUE;
		int secondHighest =Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>secondHighest || arr[i]>highest)
			{
				if(arr[i]>highest)
				{
					secondHighest =highest;
					highest = arr[i];
				}
				
				else
				{
					secondHighest = arr[i];
				}
			}
		}
		
		System.out.println("Second Highest Number is : "+secondHighest);
		
		 highest=Integer.MAX_VALUE;
		 secondHighest =Integer.MAX_VALUE;
		int thirdlowest = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(highest>arr[i] || secondHighest >arr[i] || thirdlowest >arr[i])
			{
				if(arr[i]==highest)
				{
					continue;
				}
				
				if(highest>arr[i])
				{
					thirdlowest = secondHighest;               //{6,7,12,22,5,20,24,1,1,7,5,3,21,23}
					 secondHighest = highest;
					highest=arr[i];
				}
				
				else if(secondHighest >arr[i])
				{
					thirdlowest = secondHighest;
					secondHighest = arr[i];
				}
				
				else if(thirdlowest>arr[i])
				{
					thirdlowest = arr[i];
					
				}
			}
		}
		
		System.out.println("Third Lowest Number is : "+thirdlowest);
		
		
		
		
	}
}
