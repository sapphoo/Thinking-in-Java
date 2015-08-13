package two;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
public class HelloDate {
	public static void main(String[] args){
		System.out.println("Hello, it's ");
		System.out.println(new Date());
		
		List<Integer> a = Arrays.asList(1,2,3,4,5,6,7);
		
		for (int i = 0; i < a.size();i++){			
			System.out.println(a.get(i));			
		}
		
		Iterator<Integer> iterator = a.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		for(int i : a){
			System.out.println(i);
		}
		
		a.forEach(e-> System.out.println(e.toString()));		
	}

}
