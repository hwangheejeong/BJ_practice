import java.util.Scanner;

public class n1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//(x,y)
	    int x = sc.nextInt();
	    int y = sc.nextInt();
		
		//직사각형의 오른쪽 위 꼭짓점(w,h)	
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int[] arr = new int[3];
		
		int min=x;
		arr[0]=w-x;
		arr[1]=y;
		arr[2]=h-y;
		
		for(int i=0;i<3;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.print(min);
	}

}
