import java.util.Scanner;

public class n1453 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] com = new int[N];
		
		//손님이 앉고싶어하는 자리
		for(int i=0;i<N;i++) {
			com[i] = sc.nextInt();
		}
		
		int sorry=0;
		
		for(int i=N-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(com[i]==com[j]){
					sorry++;
					break;
				}
			}
		}
		
		System.out.println(sorry);
	}

}
