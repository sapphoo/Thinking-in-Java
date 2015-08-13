//E09 自动包装功能对所有的基本类型和包装器类型都起作用
package two;

public class E09_AutoboxingTest {
	public static void main(String[] args) {
		Byte by = 127;//1<<7-1 
		byte bt = by;
		System.out.println("byte = "+ bt);
		Short sh = 1;//1<<15-1 = 16384;2(15)-1
		short so = sh;
		System.out.println("short = "+ so);
		Integer in = 1;//1<<31-1
		int it = in;
		System.out.println("int = "+ it);
		Long lo = 1l;
		long ln = lo;//1<<63-1
		System.out.println("long = "+ ln);
		Boolean boo= true;
		boolean bo = boo;
		System.out.println("boolean = "+ bo);
		Character ch = 'a';
		char ca = ch;
		System.out.println("char = "+ ca);
		Float fl = 1f;
		float fo = fl;
		System.out.println("float = "+ fo);
		Double du = 1d;
		double db = du;
		System.out.println("double = "+ db);

	}

}
