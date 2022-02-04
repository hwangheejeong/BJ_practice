import java.util.Scanner;

public class n2445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String star ="*";
		String space=" ";
		
		
		for(int i=1;i<=n;i++) {
			
			for( int k=0;k<i;k++) {
				System.out.print(star);
			}
			
			for(int m=n-i;m>0;m--) {
				System.out.print(space);
			}

			for(int m=n-i;m>0;m--) {
				System.out.print(space);
			}
			
			for( int k=0;k<i;k++) {
				System.out.print(star);
			}
			
			System.out.println();
		}
		
	    for(int i=n-1;i>0;i--) {
			
			for( int k=0;k<i;k++) {
				System.out.print(star);
			}
			
			for(int m=n-i;m>0;m--) {
				System.out.print(space);
			}

			for(int m=n-i;m>0;m--) {
				System.out.print(space);
			}
			
			for( int k=0;k<i;k++) {
				System.out.print(star);
			}
			
			System.out.println();
		}
			
	}
}


