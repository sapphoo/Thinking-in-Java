/*
 * 创建一个名为Dog的类，它具有重载的bark（）方法，根据不同的基本数据类型进行重载
 *
 */
//部分体现参数顺序不同也可以区分重载方法，但是一般情况下尽量别这么做，因为这会使代码难以维护
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
