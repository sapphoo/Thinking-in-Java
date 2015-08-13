/*
 * 根据获取参数给出斐波那契数列
 * in：5
 * out:1 1 2 3 5
 */
package four;

public class E09_Fibonacci {
	static int fib(int n){
		if (n<=2)
			return 1;
		return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for(int i = 1; i<=n; i++)
			System.out.print(fib(i) + " ");
	}

}
