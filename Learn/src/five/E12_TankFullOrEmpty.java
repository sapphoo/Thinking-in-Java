/*
 * ��д��Ϊtank���࣬�����״̬�����ǡ����ġ��򡰿յġ�
 * ���ս������ǣ���������ʱ���봦�ڿ�״̬
 * ���дfinalize()�Լ����ս������Ƿ����
 * ��main()�в���tank���ܷ����ļ���ʹ�÷�ʽ
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
