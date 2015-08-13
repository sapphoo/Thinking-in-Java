package four;

import java.util.Random;

public class E08_SwitchBreak {
	public static void main(String[] args) {
		Random rand = new Random();
		for(int i = 0; i < 100; i++){
			int r = i%2;
			switch (r) {
			case 0:
				System.out.println("even"+i);
				//break;
			case 1:
				System.out.println("prime"+i); 
				//break;
			//default:
				//break;
			}
		}
	}

}
