//배열A 배열B 
//S = A[0]*B[0]+ ... + A[N-1]*B[N-1]
//A만 재배치해서 S의 최솟값구하기
import java.util.Arrays;
import java.util.Scanner;

public class n1026 {

	//함수 S
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
		//길이가 N인 배열 A,B
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			B[i] = sc.nextInt();
		}
		
		//A와 B 오름차순 정렬
		//A는 앞부분부터 B는 뒷부분부터
		Arrays.sort(A);
		Arrays.sort(B);
		
		System.out.print(S(A,B));
		
	}

}
