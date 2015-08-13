package two;

public class E06_Storage {
	public static final String S = "you idiot!!";
	int storage(String a){
		return a.length();
	}
	/*void print(){
		System.out.println("storage(s) = " + storage(S));
	}
	*/
	public static void main(String[] args) {
		E06_Storage st = new E06_Storage();
		System.out.println("storage(s) = " + st.storage(E06_Storage.S));
		//st.print();
	}

}
