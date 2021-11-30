package Variables;

public class VariableTypes {
	
	int x=100; //instance or global or non-static variable;
	static String name="java";
	
	public void add()
	{
		 int z=100;//local variable
		 
		 System.out.println(z);
		 System.out.println(x);
		 System.out.println(VariableTypes.name);
		 System.out.println(name);
		 System.out.println("Instance method");
		 
		 
	}
	
	public static void sub()
	{
		VariableTypes obj=new VariableTypes();//reference variable
		System.out.println(obj.x);
		obj.add();
		System.out.println(VariableTypes.name);
		System.out.println("static method");
		
	}
	

	public static void main(String[] args) {
		VariableTypes obj=new VariableTypes();//reference variable
		obj.add();
		System.out.println(obj.x);
		System.out.println(VariableTypes.name);
		
		
		sub();

	}

}
