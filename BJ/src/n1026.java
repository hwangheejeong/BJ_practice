//�迭A �迭B 
//S = A[0]*B[0]+ ... + A[N-1]*B[N-1]
//A�� ���ġ�ؼ� S�� �ּڰ����ϱ�
import java.util.Arrays;
import java.util.Scanner;

public class n1026 {

	//�Լ� S
	public static int S(int[] a,int[]b) {
		int result=0;
		
		for(int i=0;i<a.length;i++) {
			result += a[i]*b[a.length-1-i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//���̰� N�� �迭 A,B
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			B[i] = sc.nextInt();
		}
		
		//A�� B �������� ����
		//A�� �պκк��� B�� �޺κк���
		Arrays.sort(A);
		Arrays.sort(B);
		
		System.out.print(S(A,B));
		
	}

}
