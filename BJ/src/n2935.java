import java.math.BigInteger;
import java.util.Scanner;

public class n2935 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Big Integer 활용 무한대의 수 처리 가능
		Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.nextLine());
        char c = sc.nextLine().charAt(0);
        BigInteger m = new BigInteger(sc.nextLine());
	
        if(c == '*')
            System.out.println(n.multiply(m));
        else 
            System.out.println(n.add(m));
		
		
	}

}
