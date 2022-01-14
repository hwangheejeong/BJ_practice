import java.util.Scanner;

public class n2851 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] m = new int[10];
		int score =0;
		
		//점수 순서대로 입력받기
		for(int i=0;i<10;i++) {
			m[i] = sc.nextInt();
		}
		
		for(int i=0;i<10;i++) {
		
			score +=m[i];
			
			if(score==100)
				break;
			
			if(score>100) {
				
				if(score-100 > 100-(score-m[i])){
					score = score-m[i];
				}
				break;
			}
			
		}
		
		
		System.out.println(score);
	}

}
