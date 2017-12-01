package solution;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
5x + 3y = N
min(x+y) = ??
if no pair of (x,y) then print out -1
 */

public class Sol_2839 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total=sc.nextInt();
		ArrayList <Integer> arr = new ArrayList<Integer>();
		System.out.println(minBag(total, arr));
		sc.close();
	}
	
	public static int minBag(int N, ArrayList<Integer> arr){
		for(int i=0; i<=N/5; i++){
			int num=N;
			num-=i*5;
			if(num==0){
				arr.add(i);
			}else if(num%3==0){
				arr.add(i+(num/3));
			}
		}
		if(arr.isEmpty()){
			return -1;
		}else{
			return Collections.min(arr);
		}
	}
}