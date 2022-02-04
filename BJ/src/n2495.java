import java.util.Scanner;

public class n2495 {
	
	static int max(int num) {
		
		int t=0;
		int[] k = new int[8];
		
		t = num%10;
		num = num/10;
		k[7]=1;
		
		for(int i=6;i>=0;i--) {
			
			if(t==num%10) {
				k[i]=k[i+1]+1;
			}
			else
				k[i]=1;
			
			t = num%10;
			num = num/10;
		}
		
		int max=0;
		
		for(int i=0;i<8;i++) {
			if(k[i]>max)
				max=k[i];
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		System.out.println(max(n1));
		System.out.println(max(n2));
		System.out.println(max(n3));
	}


}
