package three;

public class E05_DogSpark {
	String name;
	String says;
	public static void main(String[] args){
		E05_DogSpark d1 = new E05_DogSpark();
		E05_DogSpark d2 = new E05_DogSpark();
		E05_DogSpark d3 = d1;
		d1.name = "spot"; d1.says = "Ruff!";
		d2.name = "scruffy"; d2.says = "Wurf!";
		System.out.println(d1.name + " says " + d1.says);
		System.out.println(d2.name + " says " + d2.says);
		System.out.println(d1.name == d3.name);
		System.out.println(d1.equals(d3));
	}

}
