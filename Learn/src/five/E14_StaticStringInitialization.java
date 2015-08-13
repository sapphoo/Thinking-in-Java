package five;

import java.awt.print.Printable;

public class E14_StaticStringInitialization {
	static String s1 = "InitializeInDefine";
	static String s2;
	static {
		s2 = "initializeInStaticCube";
	}

	public static void main(String[] args) {
		System.out.println(s1);
		System.out.println(s2);
	}

}
