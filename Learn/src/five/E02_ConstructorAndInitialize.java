/*
 * ����һ���࣬����һ���ڶ���ʱ�ͳ�ʼ���˵�string�򣬺�һ��ͨ����������ʼ����string��
 * figure out�����ַ�ʽ������
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
