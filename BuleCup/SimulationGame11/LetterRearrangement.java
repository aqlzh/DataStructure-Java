package SimulationGame11;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author LZH.create
 *    ×ÖÄ¸ÖØÐÂÅÅÁÐ -->  A(m,n)   
 */
public class LetterRearrangement {

	public static int count = 0;
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static Set<String> set = new HashSet<String>();
	static String[] strs={"L","A","N","Q","I","A","O"};
	public static void main(String[] args) {
		f();
		System.out.println(set.size());
	}

	public static void f() {
		if (list.size() >= 7) { 
			StringBuilder s=new StringBuilder("");;
			for (int i = 0; i <=6; i++) {
				s.append(strs[list.get(i)-1]);
			}
			set.add(s.toString());
			return;
		}
		for (int i = 1; i <=7 ; i++) {
			if (!list.contains(i)) {
				//System.out.println(i);
				list.add(i);
				f();
				list.remove(list.size() - 1);
			}
		}
	}

}
