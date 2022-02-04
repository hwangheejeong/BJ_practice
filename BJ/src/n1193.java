import java.util.Scanner;

public class n1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x==1) {
			System.out.print("1/1");
		}
		else if(x%2==0) {
			System.out.print("1/"+((x/2)+1));
		}
		else {
			System.out.print("2/"+x/2);
		}
		
		
	}

}
