import java.util.Scanner;

public class n2720 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();


		int[] qqq = new int[t];
		int[] ddd = new int[t];
		int[] nnn = new int[t];
		int[] ppp = new int[t];


		for (int i = 0; i < t; i++) {
			
			double c = sc.nextDouble();
			// 100c = 1´Þ·¯
			c = c / 100;

			int nq = 0;
			int nd = 0;
			int nn = 0;
			int np = 0;
			

			while (c>0) {
				
				if (c >= 0.25) {
					c = c - 0.25;
					nq++;
				} else if (c >= 0.1) {
					c = c - 0.1;
					nd++;
				} else if (c >= 0.05) {
					c = c - 0.05;
					nn++;
				} else if(c >= 0.01){
					c = c - 0.01;
					np++;
				}
				else
					break;
			}
			qqq[i]=nq;
			ddd[i]=nd;
			nnn[i]=nn;
			ppp[i]=np;
		}
		
		for(int i=0;i<t;i++) {
			System.out.println(qqq[i]+" "+ddd[i]+" "+nnn[i]+" "+ppp[i]);
		}
	}

}
