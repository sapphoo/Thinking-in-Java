/*
 * ��д���������ع��������࣬���ڵ�һ����������ͨ��this���õڶ���������
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
