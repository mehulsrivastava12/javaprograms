package Exceptions;

class try_catch_finally
{
	public static void main (String[] args)
	{
		

		int[] arr = new int[4];
		
		try
		{
			int i = arr[4];

			System.out.println("Inside try block");
		}
		
	
		catch(NullPointerException ex)
		{
			System.out.println("Exception has been caught");
		}
		
		finally
		{
			System.out.println("finally block executed");
		}
		
		System.out.println("Outside try-catch-finally clause");
	}
}
