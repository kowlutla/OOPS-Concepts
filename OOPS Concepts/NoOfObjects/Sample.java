package NoOfObjects;

public class Sample
{
	public static void main(String args[])
	{
		Abc a=new Abc();
		Abc b=new Abc();
		Abc c=new Abc();
		Abc d=new Abc();
		System.out.println("No of Object of class: "+Abc.count);
	}
}


class Abc
{
	static int count=0;
	
	public Abc()
	{
		count++;
	}
	
	public int getCount()
	{
		return count;
	}
}