
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int N = scan.nextInt();
		int total = 0;
		
		for(int i=0; i<N; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			total += A*B;
		}
		
		if(X==total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
