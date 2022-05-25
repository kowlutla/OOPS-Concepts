
public class InterfaceDemo {

	public static void main(String[] args) {
		
		Activity activity=new Activity()
		{
					public void play()
					{
						System.out.println("Play");
					}
					public void run(int n)
					{
						System.out.println("Run for "+n+" KMs");
					}
		}
				;
				activity.run(10);
				activity.play();
				activity.jump();
				
				
		 C c=new C();
		if(c instanceof A)
		{
			System.out.println("Permission Granted");
			
		
		}
		else
		{
			System.out.println("not permited");
		}
		
	}

}

class D
{
	
}

interface Activity
{
	void play();
	void run(int km);
	default void jump()
	{
		System.out.println("Jumping....");
	}
}


interface A
{
	default void show()
	{
		System.out.println("A Show");
	}
}

interface B
{
	default void display()
	{
		System.out.println("B show");
	}
}

interface P
{
	
}

class C implements A,B,P
{
	public void show()
	{
		System.out.println("Show");
	}
}




