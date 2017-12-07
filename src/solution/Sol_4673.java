package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Ascending implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2){
		return o1.compareTo(o2);
	}
}

public class Sol_4673 {
	private static int getDn(int num){
		if(num>0 && num<10){
			return num+num;
		}else if(num>=10 && num<100){
			return num+cal(num, 1);
		}else if(num>=100 && num<1000){
			return num+cal(num, 2);
		}else
			return num+cal(num, 3);
	}
	
	private static int cal(int num, int power){
		if(num<10){
			return num;
		}else{
			return (int) (num/Math.pow(10, power) + cal((int)(num%Math.pow(10, power)), power-1));
		}
	}
	
	public static void main(String[] args){
		ArrayList<Integer> dn=new ArrayList<Integer>();
		int i=1, dnnum=1, tempDn=0, Dn;
		while(true){
			Dn=getDn(dnnum);
			if(dnnum>10000){
				break;
			}else{
				if(dn.contains(Dn)){
					dnnum++;
					continue;
				}else{
					dn.add(Dn);
					tempDn=dnnum;
					dnnum++;
				}
			}
		}
		
		Ascending asc = new Ascending();
		Collections.sort(dn, asc);
		
		while(i<tempDn){
			if(i==dn.get(0)){
				dn.remove(0);
				i++;
			}else{
				System.out.println(i);
				i++;
			}
		}
	}
}