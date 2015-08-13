/*
 * 编写有两个重载构造器的类，并在第一个构造器中通过this调用第二个构造器
 */
package five;

public class E09_ColorChange {
	E09_ColorChange(int color){
		this("s");
		System.out.println("orange");
	}
	E09_ColorChange(String color){
		System.out.println("red");
	}
	public static void main(String[] args) {
		new E09_ColorChange(2);
	}

}
