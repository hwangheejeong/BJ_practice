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
		
		//�Ϸ翡 �ö󰡴� ����
		int length=0;
		int days = 0;
		
		while(length<v) {
			length +=a;
			days++;
			
			if(length<v) {
				length -= b;
			}
			else 
				break;
		}
		
		System.out.println(days);
	}
}
