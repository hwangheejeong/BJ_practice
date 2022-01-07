import java.util.Scanner;

public class n2954 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String diary = sc.nextLine();
		
		String text="";
		String w;
		
		for(int i=0;i<diary.length();i++) {
			w= diary.substring(i,i+1);
			
			text = text+w;
			
			if(w.equals("a")||w.equals("e")||w.equals("i")||w.equals("o")||w.equals("u"))
				i=i+2;
		}
		
		System.out.print(text);
		
	//¼ôÄÚµù 
	//	System.out.print(diary.replaceAll("epe", "e").replaceAll("apa", "a").replaceAll("ipi", "i").replaceAll("opo", "o").replaceAll("upu", "u"));
		
	}

}
