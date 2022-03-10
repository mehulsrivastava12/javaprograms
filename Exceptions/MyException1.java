package Exceptions;

class MyException extends Exception {
    
}

public class MyException1 {
	public static void main(String args[])
	{
		try {
			throw new MyException();
		}
		catch (MyException ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
	}
}
