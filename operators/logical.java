class logical
{
	public static void main(String[]args)
	{
		int a = 20;
		int b = 5;
		
		System.out.println(( a > b && b < a));
		System.out.println(!( a > b && b < a));
		System.out.println(( a > b && b < a)||( b > a && b < a));
		
		
		
	}
	
}