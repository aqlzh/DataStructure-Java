package JavaCommonAPI;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	static TreeSet<Integer> s = new TreeSet<>() ;
	
	public static void main(String args []) {
		s.add(10) ;
		s.add(20) ;
		s.add(30) ;
		
		Iterator<Integer> it =  s.iterator() ;
		while(it.hasNext()) {
			int x = it.next() ;
			System.out.println(x + "\n");
		}
		
		System.out.println("\n");
		System.out.println(s.lower(20)+"\n");
	}
}
