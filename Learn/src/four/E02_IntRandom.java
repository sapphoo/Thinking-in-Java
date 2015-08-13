package four;

import java.util.Random;

public class E02_IntRandom {
	static Random rand = new Random(47);
	public static void compareRand() {
		//Wrong:Random rand = new Random(47);
		int r1 = rand.nextInt();
		int r2 = rand.nextInt();
		System.out.print(r1);
		if (r1 < r2)
			System.out.print(" < ");
		else if (r1 > r2)
			System.out.print(" > ");
		else
			System.out.print(" = ");
	}

	public static void main(String[] args) {
		
		for(int i=1; i<=25; i++){
			compareRand();
		}

	}

}
