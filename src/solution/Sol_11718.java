package solution;

import java.util.Scanner;

/*
 Outputs string in a row unit input by user.
 Maximum input string length is 100.
 Do not allow blanks each side of input string.
 Do not allow blank lines.
*/

public class Sol_11718 {

	public static void main(String[] args) {
	    // 입력한 문자 출력 
		Scanner sc = new Scanner(System.in);
	    
	    while(sc.hasNextLine()){
	    	String typing = sc.nextLine();
	        if(typing.isEmpty()||typing.length()>100){
	        	break;
	        }else
	            System.out.println(typing);
	    }
	    sc.close();
	}
}

/*
Memory : 9980KB
Time : 112MS
Code Length : 479B
*/
