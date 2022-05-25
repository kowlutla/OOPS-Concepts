package basic;

public class ExceptionDemo {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter num1: ");
//		int n1=sc.nextInt();
//		System.out.println("Enter num2: ");
//		int n2=sc.nextInt();
//		int array[]=new int[2];
//		try {
//			System.out.println("Array :"+array[3]);
//			int div=n1/n2;
//			System.out.println("Division: "+div);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Number cannot divisible by ZERO ");
//		}
//		
//		catch(ArrayIndexOutOfBoundsException ex)
//		{
//			System.out.println("Array bound exception ");
//		}
//		sc.close();
		
		
		
		try {
			int array[]= {5,0,1,2};
			try {
				int x=array[3]/array[1];
				System.out.println(x);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Can't divid with ZERO ");
			}
			array[4]=3;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array bound exception ");
		}
		finally {
			System.out.println("Finally block ");
		}
		System.out.println("After handling exception ");
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
		
		String s1="kowlutla";
		String s2="kowlutla";
		String s3=s1;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s2));
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
		String s4=new String("kowlutla");
		StringBuffer s5=new StringBuffer("kowlutla");
		System.out.println(s5.toString().hashCode());
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode()+" "+s4.hashCode());
		
		
	}

}
