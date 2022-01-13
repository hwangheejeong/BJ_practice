import java.util.Scanner;

public class n1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int[] alpha = new int[26];
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				alpha[str.charAt(i)-65]++;
			}
			else {
				alpha[str.charAt(i)-65-32]++;
			}
		}
		
		int max=-1;
		char ch ='?';
		for(int i=0;i<alpha.length;i++) {
			if(alpha[i]>max) {
				max=alpha[i];
				ch = (char)(i+65);
			}
			else if(alpha[i]==max)
				ch='?';
			
		}
		
		System.out.println(ch);
		
		
	
		
//시간초과
		
//       String[] s_arr = str.split("");
//		int[] num = new int[s_arr.length];
//		
//		for(int i=0;i<s_arr.length;i++) {
//			for(int j=i;j<s_arr.length;j++) {
//				if(s_arr[i].equals(s_arr[j]) || (int)s_arr[i].charAt(0)-'0'==(int)s_arr[j].charAt(0)-'0'-32
//						|| (int)s_arr[i].charAt(0)-'0'==(int)s_arr[j].charAt(0)-'0'+32) {
//					num[i]++;
//				}
//			}
//		}
//		
//		int max = num[0];
//		int maxIndex = 0;
//		int[] mm = new int[num.length];
//		
//		for (int i = 0; i < num.length; i++) {
//		   if (num[i] > max) {
//		      max = num[i];
//     		  maxIndex = i;
//	       }
//		}
//		int k=0;
//		
//		for(int i=0;i<num.length;i++) {
//			if(num[maxIndex]==num[i]){
//				mm[k]=i;
//				k++;
//			}
//		}
//		
//
//		if(k>=2)
//			System.out.println("?");
//		else{
//			if((int)s_arr[maxIndex].charAt(0)>=97){
//				int al = (int)s_arr[maxIndex].charAt(0)-32;
//				System.out.println((char)al);
//				
//			}
//			else {
//				System.out.println(s_arr[maxIndex]);
//			}
//		}
	}

}
