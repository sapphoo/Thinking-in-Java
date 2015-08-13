

package five;

public class E08_This {
	void out(){
		System.out.println("method one");
	}
	void use(){
		out();
		this.out();
	}
	public static void main(String[] args) {
		E08_This t = new E08_This();
		t.use();
	}

}
