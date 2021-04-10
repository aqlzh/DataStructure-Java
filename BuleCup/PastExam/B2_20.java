package PastExam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author LZH.create
 *2020  Java B �ڶ���
 */

//getTime() �����Դ�GMT 1970-01-01 00:00:00����date������ʱ��ĺ�����
public class B2_20 {

	
	public static void main(String[] args) throws ParseException {

		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;
		
		long start = format.parse("1921-7-23 12:00:00").getTime() ;
		long end   = format.parse("2020-7-1  12:00:00").getTime() ;
		
		System.out.println((end - start )/1000/60);
	}

}
