package Exceptions;

class Exception1 extends Exception
{

	private static int accno[] = {1001, 1002, 1003, 1004};

	private static String name[] =
				{"Nish", "Shubh", "Sush", "Abhi", "Akash"};

	private static double bal[] =
		{10000.00, 12000.00, 5600.0, 999.00, 1100.55};


	Exception1() { }


	Exception1(String str) {
         super(str); 
    }

	public static void main(String[] args)
	{
		try {
	
			System.out.println("ACCNO" + "\t" + "CUSTOMER" +
										"\t" + "BALANCE");

			for (int i = 0; i < 5 ; i++)
			{
				System.out.println(accno[i] + "\t" + name[i] +
											"\t" + bal[i]);

				if (bal[i] < 1000)
				{
					Exception1 me =
					new Exception1("Balance is less than 1000");
					throw me;
				}
			}
		}
        catch(Exception1 e){
            e.printStackTrace();
        }
       
	}
}
