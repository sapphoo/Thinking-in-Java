//E08 ��дһ������չʾ�����㴴����ĳ���ض���Ķ��ٸ�����������е�ĳ���ض���static��ֻ��һ��ʵ��
package two;

public class E08_StaticTest {
	static int num = 52;
	public static void main(String[] args) {
		E08_StaticTest  st1 = new E08_StaticTest();
		E08_StaticTest  st2 = new E08_StaticTest();
		System.out.println("s1 = " + st1.num + " s2 = " + st2.num);
		st1.num++;
		System.out.println("s1 = " + st1.num + " s2 = " + st2.num);
	}

}
