package MethodOverloading;

class Id {


	public void Identity(String name, int id)
	{


		System.out.println("name :" + name + " "
						+ "Id :" + id);
	}

	public void Identity(int id, String name)
	{

		System.out.println("Id :" + id + " "
						+ "name :" + name);
	}
}


class Identity1 {

	public static void main(String[] args)
	{

		Id id = new Id();

		id.Identity("Mohit", 1);
		id.Identity(2, "shubham");
	}
}
