/*
 * ����һ����ΪDog���࣬���������ص�bark�������������ݲ�ͬ�Ļ����������ͽ�������
 *
 */
//�������ֲ���˳��ͬҲ�����������ط���������һ������¾�������ô������Ϊ���ʹ��������ά��
package five;

public class E05_DogBarkOverload {
	void bark(int barking){
	//void bark(int barking, String howling){
		System.out.println("barking");
	}
	void bark(String howling){
	//void bark(String howling, int barking){
			System.out.println("howling");
	}
	public static void main(String[] args) {
		E05_DogBarkOverload dbo = new E05_DogBarkOverload();
		dbo.bark(1);
		dbo.bark("wa");
		//dbo.bark(1,"barking");
		//dbo.bark("howling", 1);
	}

}
