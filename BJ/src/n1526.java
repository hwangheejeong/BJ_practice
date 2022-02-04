import java.util.Scanner;

public class n1526 {

	static boolean sevenORfour(int x) {

		while(x>0) {
			if(x%10==7 || x%10==4) {
				x=x/10;
			}
			else{
				x=-1;
			}
		}
		if(x==-1) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int re = 0;
		
		for(int i=n;i>3;i--) {
			if(sevenORfour(i)==true) {
				re = i;
				break;
			}
		}
		
		
		
		System.out.println(re);
	}

}
