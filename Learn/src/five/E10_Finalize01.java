/*
 * 编写具有finalize()方法的类，并在方法中打印消息。在main()中为该类创建一个对象。
 */
package five;

public class E10_Finalize01 {
	boolean Finalize = true;
	protected void finalize() {
		if(Finalize)
			System.out.println("finalize");
	}
	public static void main(String[] args) {
		new E10_Finalize01();
		//练习11：finalize()总会被调用--》System.gc();
	}

}
