package PastExam;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author LZH.create
 *    第九届 蓝桥杯 第一题   第几天
 *    Date 21/4/17
 */
public class B1_18 {

	public static void main(String[] args) {

		Calendar c1 = new GregorianCalendar() ;
		c1.set(2000, 0, 1);
		
		Calendar c2 = new GregorianCalendar() ;
		c2.set(2000, 4, 4);
		
		long n1 = c1.getTimeInMillis() ;
		long n2 = c2.getTimeInMillis() ;
		
		long day = (n2-n1)/(24*3600*1000) ;
		System.out.println(day+1);
 		
	}

}
