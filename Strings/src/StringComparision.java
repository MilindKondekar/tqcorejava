
public class StringComparision
{



	public static void main(String[] args) 
	{
		String s1 = "Javaa";
		
		String s2 = "Java";
		System.out.println(s1==s2);
		
		
		
		String s3 = new String("Java");
		
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		
		String s4 = new String("Java");
		System.out.println(s3.equals(s4));
		
		
		if(s1.compareTo(s4)==0)
		{
			System.out.println("Equals");
		}
		
		else
		{
			System.out.println("Not Equal");
		}
		
		
		System.out.println(s1.compareTo(s4));
		
		
	}
	
}
