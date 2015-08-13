package four;

public class E05_BitWiseOperator2 {
	private static void toBinaryString(int i) {
		char[] buffer = new char[32];
		int bufferPosition = 32;
		while(i != 0){
			buffer[--bufferPosition] = 
					((i & 0x01) != 0)? '1':'0';
			i >>>= 1;
			System.out.println(Integer.toBinaryString(i));
		}
		for(int j = bufferPosition; j<32; j++)
			System.out.print(buffer[j]);
		System.out.println();
	}

	public static void main(String[] args) {
		int i1 = 0xaaaaaaaa;
		int i2 = 0x55555555;
		toBinaryString(i1);
		System.out.println(Integer.toBinaryString(i2));

	}

}
