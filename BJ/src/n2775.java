import java.util.Scanner;

//a층 b호 : (a-1)층의 1~b호까지 사람들의 수의 합
//0층부터 있고 0층의 i호는 i명
//1층)) 1호:1명 2호:(1+2)명 ... n호:(1+...+n)명
//2층)) 1호:1명 2호:1+(1+2)명 ... n호:(1+(1+2)+...+(1+2+...+n))명

public class n2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] result = new int[t];
		
		for(int i=0;i<t;i++) {
			
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			int[][] k_n = new int[k+1][n+1];
			
			//0층
			for(int j=0;j<=n;j++) {
				k_n[0][j]=j;
			}
			//0호는 없음
			for(int j=0;j<=k;j++) {
				k_n[j][0]=0;
			}
			//1~k층
			for(int a=1;a<=k;a++) {
				for(int nn=1;nn<=n;nn++) {
					k_n[a][nn] = k_n[a][nn-1]+k_n[a-1][nn];
				}
			}
			
			result[i]=k_n[k][n];
		}
		for(int i=0;i<t;i++) {
			System.out.println(result[i]);
		}
	}

}
