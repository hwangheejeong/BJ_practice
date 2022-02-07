import java.util.Scanner;

public class n1309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] d = new int[n][3];
		
		//사자가 없는 경우
		d[0][0]=1;
		//사자가 왼쪽에 있는 경우
		d[0][1]=1;
		//사자가 오른쪽에 있는 경우
		d[0][2]=1;
		
		 for(int i = 1; i < n; i++){
	            d[i][0] = (d[i-1][0] + d[i-1][1] + d[i-1][2]) % 9901;
	            d[i][1] = (d[i-1][0] + d[i-1][2]) % 9901;
	            d[i][2] = (d[i-1][0] + d[i-1][1]) % 9901;
	        }
		 
		 System.out.println((d[n-1][0]+d[n-1][1]+d[n-1][2])%9901);

		
	}

}
