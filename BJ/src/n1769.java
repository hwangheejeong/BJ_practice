import java.util.Scanner;

//정수 x는 3의 배수인가
//x 각 자리수의 합 = y
//y가 3의 배수이면 x도 3의 배수

public class n1769 {
	
	static int make_y(int a) {
		
		int b=0;
		
		while(a>=1) {
			b += a%10;
			a=a/10;
		}
		
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char[] x = new char[10];
		
		x = sc.next().toCharArray();
		int y = 0;
		
		
		for(int i=0;i<x.length;i++) {
			y += (int)(x[i]-'0');
		}
		    System.out.println(x[10]);
		int count = 1;
		
		while(y>9){
			y = make_y(y);
			count++;
		}
		
		System.out.println(count);
		
		if(y%3==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
