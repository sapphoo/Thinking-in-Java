//E01 验证java对没有初始化的int域和char域和执行了默认初始化
package two;

public class E01_Initialize {
	int i;
	char c;
	public E01_Initialize(){
		System.out.println("i=" + i);
		System.out.println("c=[" + c +"]" );
	}//构造方法
	public static void main(String[] args){
		new E01_Initialize(); 
		
	}

}


