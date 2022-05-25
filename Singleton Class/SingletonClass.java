
public class SingletonClass {

	private static SingletonClass class_name=null;
	public String s;
	
	private SingletonClass()
	{
		s="kowlutla is good boy ";
	}
	
	//Lazy initialization
	public static SingletonClass getInstance()
	{
		if(class_name==null)
			class_name=new SingletonClass();
		return class_name;
	}
	
	public static void main(String[] args) {
		
		SingletonClass c1=new SingletonClass();
		SingletonClass c2=new SingletonClass();
		SingletonClass c3=new SingletonClass();
		c1.s=c1.s.toUpperCase();
		System.out.println(c1.s);
		System.out.println(c2.s);
		System.out.println(c3.s);
		
	}

}
