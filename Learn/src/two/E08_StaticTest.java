//E08 编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类中的某个特定的static域只有一个实例
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
