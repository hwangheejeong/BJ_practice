import java.util.Scanner;

public class n1236 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		String exist = "X";
		
		String[] guard= new String[n];
		
		int[] r = new int[n];
		int[] c = new int[m];
		
		for (int i=0;i<n;i++) {
			guard[i] = sc.next();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++){
				if(guard[i].substring(j,j+1).equals(exist)) {
					r[i]=1;
					c[j]=1;
				}
			}
		}
		
		int r0=0;
		int c0=0;
		
		for(int i=0;i<n;i++) {
			if(r[i]!=1) {
				r0++;
			}
		}
		for(int i=0;i<m;i++) {
			if(c[i]!=1) {
				c0++;
			}
		}
		
		System.out.println(Math.max(r0, c0));
	}
}
