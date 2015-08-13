/*
 * 编写名为tank的类，此类的状态可以是“满的”或“空的”
 * 其终结条件是：对象被清理时必须处于空状态
 * 请编写finalize()以检验终结条件是否成立
 * 在main()中测试tank可能发生的几种使用方式
 */
package five;

import javax.swing.border.EmptyBorder;

class Tank {
	boolean Empty = false;

	void empty() {
		Empty = true;
	}

	protected void finalize() {
		if (!Empty)
			System.out.println("Error:Not Empty!");
	}
}

public class E12_TankFullOrEmpty {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		t1.empty();
		new Tank();
		System.gc();

	}

}
