import java.util.Scanner;

//a�� bȣ : (a-1)���� 1~bȣ���� ������� ���� ��
//0������ �ְ� 0���� iȣ�� i��
//1��)) 1ȣ:1�� 2ȣ:(1+2)�� ... nȣ:(1+...+n)��
//2��)) 1ȣ:1�� 2ȣ:1+(1+2)�� ... nȣ:(1+(1+2)+...+(1+2+...+n))��

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
			
			//0��
			for(int j=0;j<=n;j++) {
				k_n[0][j]=j;
			}
			//0ȣ�� ����
			for(int j=0;j<=k;j++) {
				k_n[j][0]=0;
			}
			//1~k��
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
