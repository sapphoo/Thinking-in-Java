package five;

public class E03_DefaultConstructor {
	E03_DefaultConstructor() {
		System.out.println("Default Constructor~");
	}
	E03_DefaultConstructor(String initialOut){
		System.out.println("Overload Constructor~");
		System.out.println(initialOut);
	}
	public static void main(String[] args) {
		new E03_DefaultConstructor();
		new E03_DefaultConstructor("hahahaha");
	}

}
