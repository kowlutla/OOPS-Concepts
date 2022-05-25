package SingleLevelInheritence;

public class SingleLevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B(10);
		a.show();

	}

	
}
class A
{
	int i=10;
	public A()
	{
		super();
		System.out.println("A Only");
	}
	
	public A(int i)
	{
		System.out.println("A with Constant");
	}
	
	public void show()
	{
		System.out.println("Value is not defined ");
	}
}

class B extends A
{
	int i=20;
	public B()
	{
		
		System.out.println("B only");
	}
	
	public B(int i)
	{
		
		System.out.println("B with Constant");
	}
	
	public void show()
	{
		System.out.println("Value is :"+i);
	}

}