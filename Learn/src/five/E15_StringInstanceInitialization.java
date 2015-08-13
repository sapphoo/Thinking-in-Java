package five;

class Suko {
	Suko(String flavor) {
		System.out.println(flavor.substring(0, flavor.length()-1) + "suko");
	}

}

public class E15_StringInstanceInitialization {
	Suko frago;
	Suko ananaso;
	{
		frago = new Suko("frago");
		ananaso = new Suko("ananaso");
	}
	E15_StringInstanceInitialization() {
		// TODO Auto-generated constructor stub
		System.out.println("sukoj");
	}

	public static void main(String[] args) {
		System.out.println("Trinkajxoj!");
		new E15_StringInstanceInitialization();
	}

}
