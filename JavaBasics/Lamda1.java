package JavaBasics;


class Lamda1 {
	public static void main(String args[])
	{

		new Thread(new Runnable() {
			@Override public void run()
			{
				System.out.println("New thread created");
			}
		}).start();
	}
}
