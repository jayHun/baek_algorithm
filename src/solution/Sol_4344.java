package solution;
import java.util.Scanner;

public class Sol_4344 {
	private static void getRate(int[] row, int[] grade, int sum){
		int avg=sum/grade.length, cnt=0;
		
		for(int i=0; i<grade.length; i++){
			if(grade[i]>avg)
				cnt++;
		}
		System.out.println(String.format("%.3f", ((double)cnt/grade.length)*100) + "%");
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] row = new int[n];
		for(int i=0; i<n; i++){
			row[i]=sc.nextInt();
			int[] grade=new int[row[i]];
			int sum=0;
			for(int j=0; j<grade.length; j++){
				grade[j]=sc.nextInt();
				sum+=grade[j];
			}
			getRate(row, grade, sum);
		}
		sc.close();
	}
}