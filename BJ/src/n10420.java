import java.util.Scanner;

public class n10420 {

	//윤년인가?
	static int leap(int y) {
		
		if (y%400==0) 
			return 29;
		else if(y%4==0 && y%100!=0)
			return 29;
		else
			return 28;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] month = new int[13];
		
		month[1]=31;
		month[3]=31;
		month[4]=30;
		month[5]=31;
		month[6]=30;
		month[7]=31;
		month[8]=31;
		month[9]=30;
		month[10]=31;
		month[11]=30;
		month[12]=31;
		
		//사귀기 시작한 날
		int y=2014;
		int m=4;
		int d=2;
		
		//기념일 구하기
		for(int i=1;i<a;i++) {
	
			month[2]=leap(y);
	
			if(d==month[m]) {
				d=1;
				m++;
			}
			else
				d++;
			
			if(m==13) {
				y++;
				m=1;
			}
		}
		
		System.out.format("%04d-%02d-%02d",y,m,d);
	}

}
