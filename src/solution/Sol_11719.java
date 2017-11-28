package solution;

import java.util.Scanner;

/*
 Outputs string in a row unit input by user.
 Maximum input string length and line is 100.
 Allow blanks each side of input string.
 Allow blank lines.
*/

public class Sol_11719 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int cnt=0;
		Scanner keyboard = new Scanner(System.in);
		
		while(cnt<100 && keyboard.hasNext()){
			str=keyboard.nextLine();
			if(str.length()>100){
				cnt--;
				break;
			}else{
				System.out.println(str);
				cnt++;
			}
		}
		keyboard.close();
	}
}

/*
Memory : 9860KB
Time : 112MS
Code Length : 419B
*/
