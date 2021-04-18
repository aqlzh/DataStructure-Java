package JavaCommonAPI;

import java.util.Scanner;

/**
 * @author LZH.create
 *  Date : 21/4/17
 *    埃氏筛和欧拉筛  (筛选质数的改进算法)
 */
public class EulerSieveAndEulerSieve {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in) ;
		int a = sc.nextInt() ;
		
		ola(a) ;
		System.out.println(cnt);

	}

	// 埃氏筛优化
	static final int N = 10000005;
	static int [] st = new int[N];
	
	
	
	static int[] primes = new int [N];
	static int cnt = 0;
	
	public static void E_sieve(int  n){

		for(int i = 2; i <= n / i; i++)
		{
			if(st[i] == 0)
			{
				for(int j = i * i; j <= n; j += i)
				    st[j] = 1; // j是i的一个倍数，j是合数，筛掉。
			}
		}
		
	}
	
	// 欧拉筛
	
    public static void ola(int n){
        
        for(int i = 2; i <= n; i++)
        {
            if(st[i] == 0)	primes[cnt++] = i;
            
            for(int j = 0; primes[j] <= n / i; j++)
            {
                st[primes[j]*i] = 1;
                if(i % primes[j] == 0) break;
            }
        }
    }


}
