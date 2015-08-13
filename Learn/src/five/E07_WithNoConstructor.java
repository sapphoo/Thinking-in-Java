/*
 * 创建一个没有构造器的类，用以验证编译器是否真的自动加入了默认构造器
 */
package five;

public class E07_WithNoConstructor {
	public static void main(String[] args) {
		new E07_WithNoConstructor();
	}

}
