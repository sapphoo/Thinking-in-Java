/*
 * ��д����finalize()�������࣬���ڷ����д�ӡ��Ϣ����main()��Ϊ���ഴ��һ������
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
		//��ϰ11��finalize()�ܻᱻ����--��System.gc();
	}

}
