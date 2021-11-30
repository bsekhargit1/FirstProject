package overloading;

public class OverridingDemo_Child extends OverridingDemo_Parent{
	
	public void m1()
	{
		System.out.println("m1 from child");
		
	}
	public void m2()
	{
		System.out.println("m2 from child");
	}
	public void m3()
	{
		System.out.println("m3 from child");
	}
	
	public static void main(String[] args) {
		OverridingDemo_Parent obj1=new OverridingDemo_Parent();
		obj1.m1();
		obj1.m2();
		
		OverridingDemo_Child obj2=new OverridingDemo_Child();
		obj2.m1();
		obj2.m2();
		obj2.m3();
		
		
	}
	
	

}
