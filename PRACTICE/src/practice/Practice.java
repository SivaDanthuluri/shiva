package practice;
import java.util.ArrayList;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(100 ); 
		l.add(109);
		l.add(223);
		l.add(203);
		l.add(123);
		l.add(232);
		l.add(321);
		System.out.println(l);
		l.stream().map(e->e>200).forEach(e->System.out.println(e));

	}

}
