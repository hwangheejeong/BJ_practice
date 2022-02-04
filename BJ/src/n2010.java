import java.util.Scanner;

public class n2010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] mttp = new int[n];
		
		for(int i=0;i<n;i++) {
			mttp[i]=sc.nextInt();
		}
		
		int total = mttp[n-1];
		
		if(n>1) {
			for(int i=n-2;i>=0;i--)
				total+=(mttp[i]-1);
		}
		
		System.out.println(total);
	}

}
