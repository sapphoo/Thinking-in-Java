/*
 * ��̬��ʼ��ִֻ��һ��
 * ��1���״�����������һ������ʱ
 * ��2���״η��������Ǹ���ľ�̬���ݳ�Աʱ--��ʽ��ʼ��
 */
package five;

import java.awt.print.Printable;

class Cup{
	Cup(int marker){
		System.out.println("Cup(" + marker + ")");
	}
	void f(int marker){
		System.out.println("f(" + marker + ")");
	}
}

class Cups{
	static Cup cup1;
	static Cup cup2;
	static{
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups(){
		System.out.println("Cups()");
	}
}
public class E13_StaticAndCall {
	public static void main(String[] args){
		System.out.println("Inside main()");
		//Cups.cup1.f(99);//(1)
	}
	static Cups cup1 = new Cups();//(2)
	static Cups cup2 = new Cups();//(2) ִֻ��һ��

}
