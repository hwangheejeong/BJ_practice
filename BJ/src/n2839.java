import java.util.Scanner;

public class n2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//상근이가 배달해야하는 무게S N입력
		int N = sc.nextInt();
		int n=N;
		int m=0;
		
		//설탕 3kg 5kg 최소개수 구하기
		while(N>0) {
			
			//5의 배수
			if(N%5==0) {
				N=N-5;
				m++;
			}
			//3의배수
			else if(N%3==0) {
				N=N-3;
				m++;
			}
			//5보다 큼
			else if(N>=5) {
				N=N-5;
				m++;
			}
			//else -1
			else {
				m=m-1;
				break;
			}
			
		}
	
		System.out.println(m);
	}
}
