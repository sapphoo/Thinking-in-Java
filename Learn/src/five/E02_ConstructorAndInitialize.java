/*
 * 创建一个类，包含一个在定义时就初始化了的string域，和一个通过构造器初始化的string域，
 * figure out这两种方式的区别
 */

package five;

public class E02_ConstructorAndInitialize {
	String s = "string";
	E02_ConstructorAndInitialize() {
		String c = "constuctor";
		System.out.println(c);
	}
	public static void main(String[] args) {
		new E02_ConstructorAndInitialize();
		E02_ConstructorAndInitialize cai = new E02_ConstructorAndInitialize();
		System.out.println(cai.s);
		
	}

}
