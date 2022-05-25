 package Abstraction;

public class PhoneDemo {

	public static void main(String[] args) 
	{
		Phone phone=new Iphone();
		showConfiguration(phone);
		System.out.println("==================================");
		Samsung phone1=new Samsung();
		showConfiguration(phone1);
		System.out.println("==================================");
		Phone phone2=new Vivo();
		showConfiguration(phone2);

	}
	
	public static void showConfiguration(Phone phone)
	{
		phone.showConfig();
		phone.RAM();
	}

}


abstract class Phone
{
	public abstract void showConfig();
	public abstract void RAM();
}

class Iphone extends Phone 
{
	public void showConfig()
	{
		System.out.println("Iphone Configuration....");
	}
	public void RAM()
	{
		System.out.println("IOS RAM");
	}
}

abstract class Android extends Phone
{
	public void showConfig()
	{
		System.out.println("Android Configuration....");
	}
}

class Samsung extends Android

{
	public void RAM()
	{
		System.out.println("SamSung RAM");
	}
}

class Vivo extends Android
{
	public void RAM()
	{
		System.out.println("Vivo RAM");
	}
}



