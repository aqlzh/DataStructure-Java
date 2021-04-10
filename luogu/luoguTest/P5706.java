package luoguTest;

import java.util.Scanner;
public class P5706 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float t = sc.nextFloat();
        int n = sc.nextInt();
        System.out.println(String.format("%.3f",t/n));
        System.out.println(2*n);
        sc.close();
    }
}
