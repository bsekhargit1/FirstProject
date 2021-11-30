package Variables;

public class DataTypes {
	
	byte b=-128; //1 byte
	short s=-32768;// 2 bytes
	int i= 2147483647;//4 bytes
	long l=2147483647;//8 bytes
	
	float f=12.34f; //4 bytes
	double d=244.34; // 8 bytes
	
	
	boolean bb=true;// 1 bit	
	char ch='a'; // 2 bytes
	
	String str="java";
	
	

	public static void main(String[] args) {
		DataTypes obj=new DataTypes();
		System.out.println("Byte "+obj.b);
		System.out.println("short "+obj.s);
		System.out.println("int "+obj.l);
		System.out.println("long "+obj.l);
		
		System.out.println("float "+obj.f);
		System.out.println("double "+obj.d);
		
		System.out.println("Boolean "+obj.bb);
		System.out.println("Char "+obj.ch);
		
		System.out.println("String "+obj.str);

	}

}
