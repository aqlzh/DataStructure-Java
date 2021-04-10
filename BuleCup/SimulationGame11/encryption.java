package SimulationGame11;



import java.util.Scanner;

/**
 * @author LZH.create
 * a 97  ; A 65    26¸ö×ÖÄ¸
 */
public class encryption {

	public static void main(String [] args) {
		Scanner sc  = new Scanner(System.in) ;
		
		String str = sc.nextLine() ;
		
		char [] strs = new char [str.length()] ;
		String all = "abcdefghijklmnopqrstuvwxyz" ; 
		
//		System.out.println(str.charAt(0) -'0');  //65 - 48=17
//		System.out.println(str.charAt(1) -'0');
//		System.out.println(str.charAt(0)- 96);  // 1 
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i)- 96 +2 <= 26)   strs[i] =  all.charAt(str.charAt(i)- 96 + 2) ;
			  else  strs[i] =  all.charAt(str.charAt(i)- 96 + 2 -26) ;
		}
		
		for(char i : strs) {
			System.out.print(i);
		}
		
		
	} 
	
}
