import java.util.Scanner;

public class n1357 {
	
	static int Rev(int n){
		
		String s = Integer.toString(n);
		
		StringBuffer sb = new StringBuffer(s);
		String rev_s = sb.reverse().toString();
		
		return  Integer.parseInt(rev_s);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		System.out.println(Rev(Rev(X)+Rev(Y)));
		
	}

}
