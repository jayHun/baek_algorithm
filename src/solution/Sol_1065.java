package solution;

import java.util.Scanner;

public class Sol_1065 {
	private static int getHan(int n){
		int cnt=0;
		if(n<100) cnt=n;
		else if(n>=100 || n<1000){
			int x1, x2, x3;
			cnt=99;
			for(int i=100; i<=n; i++){
				x1=i/100;
				x2=(i%100)/10;
				x3=((i%100)%10);
				if(x3-x2==x2-x1 || x1-x2==x2-x3) cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ip = sc.nextInt();
		System.out.print(getHan(ip));
		sc.close();
	}
}