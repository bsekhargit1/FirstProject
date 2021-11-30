package overloading;

public class OverloadingDemo {
	
	public void m1(int i)
	{
		System.out.println(i);
	}
	
	public void m1(float j)
	{
		System.out.println(j);
	}
	
	public void m1(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		OverloadingDemo obj=new OverloadingDemo();
		obj.m1(10);
		obj.m1(1.2F);
		obj.m1("java");

	}

}
