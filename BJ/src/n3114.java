import java.util.Scanner;

public class n3114 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//R,C 입력받기
		int R = sc.nextInt();
		int C = sc.nextInt();
		
		//배열
		String[][] area;
		area = new String[R][C];
		
		//각 칸별 나무개수 입력받기
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				area[i][j] = sc.next();
			}
		}
		
		//첫 시작 area[0][0]
		int r=0;int c=0;
		//area[R][C] 도착하면 끝
		while(r<R&&c<C){
			//불도저가 지나간 길 0으로
	    	area[r][c]="0";
	    	
	    	int low = Integer.valueOf(area[r+1][c].substring(area[r+1][c].length()-1));
	    	int right = Integer.valueOf(area[r][c+1].substring(area[r][c+1].length()-1));
	    	int low_right = Integer.valueOf(area[r+1][c+1].substring(area[r+1][c+1].length()-1));
	    	
	    	//area[r+1][c] area[r][c+1] area[r+1][c+1] 비교
	    	//문자열 숫자로 비교
	    	//3가지 중 max구하기
	    	int max=0;
	        max = low;
	        
	        if(max< right) {
	        	max = right;
	        }
	        
	        if(max< low_right) {
	        	max = low_right;
	        }
	        
	        //아래가 가장 클 때
	        if(max == low){
	        	//low가 바나나
	        	if(area[r+1][c].charAt(0) == 'B') {
	        		//right low_right 같은 나무일때
	        		if(area[r][c+1].charAt(0) == area[r+1][c+1].charAt(0)) {
	        			//둘 다 사과나무 right으로
	        			if(area[r][c+1].charAt(0)=='A') 
	        				c=c+1;
	        			//둘 다 바나나나무 low로
	        			else 
	        				r=r+1;
	        		}
	        		//다른 나무일때
	        		else {
	        			//right 사과일때
	        			if(area[r][c+1].charAt(0)=='A')
	        				r=r+1;
	        			//right 바나나이면 더 작은 쪽으로
	        			else {
	        				//low_right이 더 작을 때
	        				if(right < low_right) {
	        					r=r+1;
	        					c=c+1;
	        				}
	        				else
	        					c=c+1;
	        					
	        			}
	        		}
	        	}
	        }
	        else if(max == right){
	        	//right이 바나나
	        	if(area[r][c+1].charAt(0) == 'B') {
	        		//right low_right 같은 나무일때
	        		if(area[r][c+1].charAt(0) == area[r+1][c+1].charAt(0)) {
	        			//둘 다 사과나무 low_right으로
	        			if(area[r][c+1].charAt(0)=='A') {
	        			    r=r+1;
	        				c=c+1;
	        			}
	        			//둘 다 바나나나무 low로
	        			else 
	        				r=r+1;
	        		}
	        		//다른 나무일때
	        		else {
	        			//low 사과일때
	        			if(area[r+1][c].charAt(0)=='A')
	        				r=r+1;
	        			//low 바나나이면 더 작은 쪽으로
	        			else {
	        				//low_right이 더 작을 때
	        				if(low < low_right) {
	        					r=r+1;
	        					c=c+1;
	        				}
	        				else
	        					r=r+1;
	        					
	        			}
	        		}
	        	}
	        }
	        //max가 low_right일 때 
	        else {
	        	//low_right 사과이면 right
	        	if(area[r+1][c+1].charAt(0)=='A')
	        		c=c+1;
	        	//low_right 바나나이면 low
	        	else
	        		r=r+1;
	        }
	        
	    	//다음이 마지막이면 예외 이동
		}
	}

}
