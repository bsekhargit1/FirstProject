package Variables;

public class StaticReference {
	
	int x=100; //instance or global or non-static variable;
	static String name="java";
	static StaticReference obj;
	
	public void add()
	{
		 int z=100;//local variable
		 
		 System.out.println("Instance method begin");
		 System.out.println(z);
		 System.out.println(x);
		 System.out.println(StaticReference.name);
		 System.out.println(name);
		 System.out.println("Instance method end");
		 
		 
		 
	}
	
	public static void sub()
	{
		obj=new StaticReference();//reference variable
		System.out.println(obj.x);
		obj.add();
		System.out.println(StaticReference.name);
		System.out.println("static method");
		
	}
	

	public static void main(String[] args) {
		
		obj=new StaticReference();//reference variable
		System.out.println(obj.x);
		
		System.out.println(StaticReference.name);
		
		
		sub();

	}

}
