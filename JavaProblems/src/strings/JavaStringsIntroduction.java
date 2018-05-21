package strings;
import java.util.Scanner;

public class JavaStringsIntroduction {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
		
		System.out.println(A.length() + B.length());
		if(A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else if(A.compareTo(B) < 0){
			System.out.println("No");
		}
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
		
		sc.close();
	}
	
}
