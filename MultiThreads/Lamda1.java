package MultiThreads;


class Lamda1 {
	public static void main(String args[])
	{

		new Thread(new Runnable() {
			 public void run()
			{
				System.out.println("New thread created");
			}
		}).start();
	}
}
