import java.util.Scanner;

public class n1100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//체스판 만들기
		char[][] board = new char[8][8];
		
		//첫칸(0,0) => 흰칸
		for(int i=0;i<8;i++) {
			if(i%2==0) {
				for(int j=0;j<8;j+=2) {
					board[i][j]='w';
				}
			}
			else {
				for(int j=1;j<8;j+=2) {
					board[i][j]='w';
				}
			}
		}
		

		//체스판 상태 입력받기
	    String[] state = new String[8];
	    char[][] st = new char[8][8];
		int white=0;
		
		for(int i=0;i<8;i++) {
			state[i]=sc.next();
			
		}
		
		for(int i=0;i<8;i++) {
			st[i]=state[i].toCharArray();
		}
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(board[i][j]=='w' && st[i][j]=='F') {
					white++;
				}
			}
		}
		
		System.out.print(white);
		
		
	}

}
