import java.util.Scanner;

public class n2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//����̰� ����ؾ��ϴ� ����S N�Է�
		int N = sc.nextInt();
		int n=N;
		int m=0;
		
		//���� 3kg 5kg �ּҰ��� ���ϱ�
		while(N>0) {
			
			//5�� ���
			if(N%5==0) {
				N=N-5;
				m++;
			}
			//3�ǹ��
			else if(N%3==0) {
				N=N-3;
				m++;
			}
			//5���� ŭ
			else if(N>=5) {
				N=N-5;
				m++;
			}
			//else -1
			else {
				m=m-1;
				break;
			}
			
		}
	
		System.out.println(m);
	}
}
