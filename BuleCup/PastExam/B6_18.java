package PastExam;

import java.util.Scanner;

/**
 * @author LZH.create
 *        第九届     递增三元组   三重 for 循环
 */
public class B6_18 {

	
	public static void main(String[] args) {
		int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        int [] c = new int[n];

        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            c[i] = sc.nextInt();
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(b[j]>a[i])
                    for (int k = 0; k <n ; k++) {
                        if(c[k]>b[j]){
                            count++;
                        }
                    }
            }
        }
        System.out.println(count);
    }


}
