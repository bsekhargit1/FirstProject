package Variables;

public class DefaultValues {
	
	byte b; //1 byte
	short s;// 2 bytes
	int i;//4 bytes
	long l;//8 bytes
	
	float f; //4 bytes
	double d; // 8 bytes
	
	
	boolean bb;// 1 bit	
	char ch; // 2 bytes
	
	String str;
	
	

	public static void main(String[] args) {
		DefaultValues obj=new DefaultValues();
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
