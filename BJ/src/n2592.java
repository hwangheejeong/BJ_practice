import java.util.Scanner;

public class n2592 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i=0;i<10;i++) {
			num[i]=sc.nextInt();
		}
		
		//Æò±Õ
		int avg=0;
		for(int i=0;i<10;i++) {
			avg+=num[i];
		}
		avg=avg/10;
		
		//ÃÖºó°ª
		int[] c = new int[101];
		int many=0;
		
		for(int i=0;i<10;i++) {
			c[num[i]/10]++;
		}
		
		int maxidx=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]>c[maxidx])
				maxidx=i;
		}
		many = maxidx*10;
		
		System.out.println(avg);
		System.out.println(many);
	}

}
