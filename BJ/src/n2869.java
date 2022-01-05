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
		
		//하루에 이동하는 거리 a-b
		//꼭대기에 도달하면 움직이지 않기 때문에 마지막 날에 미끄러지는 b를 감안하지 않는다면 총 거리는 v-b
		//(v-b)/(a-b)가 딱 떨어지지 않을 수 있으니 처음부터 v에서 1을 빼거 마지막에 1을 더해준다
		
		int days = (v-b-1)/(a-b)+1;
		
//		while(v>0) {
//			v=v-a;
//			days +=1;
//			if(v>0) 
//				v= v+b;
//		}
		
		
		System.out.println(days);
	}
}
