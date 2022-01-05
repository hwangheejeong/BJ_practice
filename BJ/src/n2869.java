import java.util.Scanner;

public class n2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//나무막대길이 v
		//낮에는 a 올라감
		//밤에는 b 미끄러져
		
		Scanner sc = new Scanner(System.in);
		//a b v 입력
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		//하루에 올라가는 높이
		int length=0;
		int days = 0;
		
		while(length<v) {
			length +=a;
			days++;
			
			if(length<v) {
				length -= b;
			}
			else 
				break;
		}
		
		System.out.println(days);
	}
}
