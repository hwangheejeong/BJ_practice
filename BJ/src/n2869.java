import java.util.Scanner;

public class n2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����������� v
		//������ a �ö�
		//�㿡�� b �̲�����
		
		Scanner sc = new Scanner(System.in);
		//a b v �Է�
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		//�Ϸ翡 �̵��ϴ� �Ÿ� a-b
		//����⿡ �����ϸ� �������� �ʱ� ������ ������ ���� �̲������� b�� �������� �ʴ´ٸ� �� �Ÿ��� v-b
		//(v-b)/(a-b)�� �� �������� ���� �� ������ ó������ v���� 1�� ���� �������� 1�� �����ش�
		
		int days = (v-b-1)/(a-b)+1;
		
//		while(v>0) {
//			v=v-a;
//			days +=1;
//			if(v>0) 
//				v= v+b;
//		}
		
		
		System.out.println(days);
	}
}
