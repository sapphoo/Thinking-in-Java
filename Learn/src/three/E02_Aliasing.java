package three;

import java.util.Random;

public class E02_Aliasing {
	float fl;
	public static void main(String[] args) {
		E02_Aliasing a1 = new E02_Aliasing();
		E02_Aliasing a2 = new E02_Aliasing();
		Random rand =new Random(47);
		a1.fl = rand.nextFloat();
		a2.fl = rand.nextFloat();
		System.out.println("a1.fl = " + a1.fl + " a2.fl =" + a2.fl);
		a1 = a2;
		System.out.println("a1.fl = " + a1.fl + " a2.fl =" + a2.fl);
		a1.fl = rand.nextFloat();
		System.out.println("a1.fl = " + a1.fl + " a2.fl =" + a2.fl);
		
	}

}
