package four;

public class E06_Testval {
	static int test(int testval, int begin, int end){
		if(testval >= begin && testval <= end)
			return +1;
		else 
			return -1;
	}
	public static void main(String[] args) {
		System.out.println(test(6, 5, 10));
		System.out.println(test(11, 5, 10));
	}

}
