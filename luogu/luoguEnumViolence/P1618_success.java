package luoguEnumViolence;

import java.util.Scanner;

public class P1618_success {

	 public static int[] use = new int[10];
	    public static void cf(int num){
	        while(num!=0){
	            if(use[num%10]!=1){
	                use[num%10]=1;
	            }
	            num/=10;
	        }
	    }
	    public static void main(String args[]) {
	        Scanner scanner = new Scanner(System.in);
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int c = scanner.nextInt();
	        double temp1,temp2;
	        int sum,num=0;
	        for(int i=123;i<987;i++){
	            sum=0;
	            temp1=(i*1.0/a)*b;
	            temp2=(i*1.0/a)*c;
	            if(temp1>987||temp2>987){
	                break;
	            }
	            //String d = String.valueOf(temp1);
	            //String e = String.valueOf(temp2);
	          //  if("0".equals(d.substring(d.indexOf(".")+1,d.length()))||"0".equals(e.substring(e.indexOf(".")+1,e.length()))){
	                cf(i);
	                cf((int)temp1);
	                cf((int)temp2);
	                for(int j=1;j<=9;j++){
	                    sum+=use[j];
	                }
	                if(sum==9){
	                    num=1;
	                    System.out.println(i+" "+(int)temp1+" "+(int)temp2);
	                }
	                for(int z=1;z<=9;z++){
	                    use[z]=0;
	                }
	            }
//	            else{
//	                break;
//	            }
	        //}
	        if(num==0){
	            System.out.print("No!!!");
	        }
	    }

}
