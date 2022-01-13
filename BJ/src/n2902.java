import java.util.Scanner;

public class n2902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		String[] strarr = name.split("-");
		
		String algo_name = "";
		
		for(int i=0;i<strarr.length;i++) {
			algo_name += strarr[i].charAt(0);
		}
		
		System.out.println(algo_name);
		
		
		
		//대문자만 읽기
	}

}
