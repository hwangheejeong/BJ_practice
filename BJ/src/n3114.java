import java.util.Scanner;

public class n3114 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//R,C �Է¹ޱ�
		int R = sc.nextInt();
		int C = sc.nextInt();
		
		//�迭
		String[][] area;
		area = new String[R][C];
		
		//�� ĭ�� �������� �Է¹ޱ�
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				area[i][j] = sc.next();
			}
		}
		
		//ù ���� area[0][0]
		int r=0;int c=0;
		//area[R][C] �����ϸ� ��
		while(r<R&&c<C){
			//�ҵ����� ������ �� 0����
	    	area[r][c]="0";
	    	
	    	int low = Integer.valueOf(area[r+1][c].substring(area[r+1][c].length()-1));
	    	int right = Integer.valueOf(area[r][c+1].substring(area[r][c+1].length()-1));
	    	int low_right = Integer.valueOf(area[r+1][c+1].substring(area[r+1][c+1].length()-1));
	    	
	    	//area[r+1][c] area[r][c+1] area[r+1][c+1] ��
	    	//���ڿ� ���ڷ� ��
	    	//3���� �� max���ϱ�
	    	int max=0;
	        max = low;
	        
	        if(max< right) {
	        	max = right;
	        }
	        
	        if(max< low_right) {
	        	max = low_right;
	        }
	        
	        //�Ʒ��� ���� Ŭ ��
	        if(max == low){
	        	//low�� �ٳ���
	        	if(area[r+1][c].charAt(0) == 'B') {
	        		//right low_right ���� �����϶�
	        		if(area[r][c+1].charAt(0) == area[r+1][c+1].charAt(0)) {
	        			//�� �� ������� right����
	        			if(area[r][c+1].charAt(0)=='A') 
	        				c=c+1;
	        			//�� �� �ٳ������� low��
	        			else 
	        				r=r+1;
	        		}
	        		//�ٸ� �����϶�
	        		else {
	        			//right ����϶�
	        			if(area[r][c+1].charAt(0)=='A')
	        				r=r+1;
	        			//right �ٳ����̸� �� ���� ������
	        			else {
	        				//low_right�� �� ���� ��
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
	        	//right�� �ٳ���
	        	if(area[r][c+1].charAt(0) == 'B') {
	        		//right low_right ���� �����϶�
	        		if(area[r][c+1].charAt(0) == area[r+1][c+1].charAt(0)) {
	        			//�� �� ������� low_right����
	        			if(area[r][c+1].charAt(0)=='A') {
	        			    r=r+1;
	        				c=c+1;
	        			}
	        			//�� �� �ٳ������� low��
	        			else 
	        				r=r+1;
	        		}
	        		//�ٸ� �����϶�
	        		else {
	        			//low ����϶�
	        			if(area[r+1][c].charAt(0)=='A')
	        				r=r+1;
	        			//low �ٳ����̸� �� ���� ������
	        			else {
	        				//low_right�� �� ���� ��
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
	        //max�� low_right�� �� 
	        else {
	        	//low_right ����̸� right
	        	if(area[r+1][c+1].charAt(0)=='A')
	        		c=c+1;
	        	//low_right �ٳ����̸� low
	        	else
	        		r=r+1;
	        }
	        
	    	//������ �������̸� ���� �̵�
		}
	}

}
