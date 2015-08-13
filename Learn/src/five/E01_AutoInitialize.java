/*
 * 创建一个类，包含一个未初始化的string引用，验证其被初始化成了null
 */

package five;

public class E01_AutoInitialize {
	String s;
	public static void main(String[] args) {
		E01_AutoInitialize auto = new E01_AutoInitialize();
		System.out.println(auto.s);
	}

}
