/**a test*/
package two;

public class E07_Incrementable {
	public static int i = 47;

	public static void increment() {
		//StaticTest.i++;
		i++;
	}
	public static void main(String[] args){
		E07_Incrementable in = new E07_Incrementable();
		in.increment(); //����+1
		E07_Incrementable.increment();
		increment();//���о�̬����ֱ�ӵ���
		//System.out.println(StaticTest.i);
		System.out.println(i);
	}

}
