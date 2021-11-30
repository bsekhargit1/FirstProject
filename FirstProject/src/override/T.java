package override;

public class T extends S{

	
	public void m3()
	{
		System.out.println("m3");
	}
	
	 public  void m1()
	{
		System.out.println("child-chandu");
	}
	 
	 public  void m4()
		{
			System.out.println("child-chandu1");
		}
	public static void main(String[] args) {
		
		//S obj=new S();
		//obj.m1();
		
		S obj2=new T();
		obj2.m1();



		T obj1=new T();
		obj1.m3();
		obj1.m1();
		obj1.m4();
		
	}

}
