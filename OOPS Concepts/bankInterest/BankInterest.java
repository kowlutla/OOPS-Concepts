package bankInterest;

public class BankInterest {

	public static void main(String[] args) {
	
		Bank sbi=new SBI();
		System.out.println("Interest SBI: "+sbi.getInterest(100));
		Bank icici=new ICICI();
		System.out.println("Interest SBI: "+icici.getInterest(100));
		Bank axis=new AXIS();
		System.out.println("Interest SBI: "+axis.getInterest(100));

	}

}

interface Bank
{
	double getInterest(int money);
}
class SBI implements Bank
{
	final int interest_rate=8;
	@Override
	public double getInterest(int money)
	{
		return (money*interest_rate)/100;
	}
}

class ICICI implements Bank
{

	final int interest_rate=7;
	@Override
	public double getInterest(int money) {
		return (money*interest_rate)/100;
	}
}

class AXIS implements Bank
{
	final int interest_rate=9;
	@Override
	public double getInterest(int money)
	{
		return (money*interest_rate)/100;
	}
}

