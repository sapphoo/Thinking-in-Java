package three;

import java.util.Random;

class Integral{
	float f;
}
public class E03_Aliasing2 {
	static void f(Integral y){
		y.f = 1f;
	}
	public static void main(String[] args) {
		Integral x = new Integral();
		x.f = 2f;
		System.out.println("x.f= " + x.f);
		f(x);
		System.out.println("x.f= " + x.f);
		
	}

}
