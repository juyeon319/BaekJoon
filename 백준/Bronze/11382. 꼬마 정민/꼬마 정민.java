
import java.util.Scanner;

/*
11. 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다! 
*/
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = scan.nextLong();
		long C = scan.nextLong();
		
		long result = A + B + C;
		
		System.out.println(result);
	}
}
