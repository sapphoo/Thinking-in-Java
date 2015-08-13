package four;

public class E04_Prime {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			boolean b = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					b = false;
			}
			if (b)
				System.out.println(i);
		}
	}

}
