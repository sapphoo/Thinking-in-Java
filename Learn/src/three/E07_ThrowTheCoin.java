package three;

import java.util.Random;

public class E07_ThrowTheCoin {
	public static void main(String[] args) {
		Random rand = new Random();
		boolean side = rand.nextBoolean();
		System.out.println(side ? "flower":"number");
	}

}
