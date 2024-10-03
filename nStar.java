
import java.util.Scanner;
public class nStar {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How tall do you want the tree to be?");
		int Height = keyboard.nextInt();
		for (int i = 1; i <= Height; i++) {
			System.out.println("  ".repeat(Height-i) + "*".repeat(2*i-1));
		}
	}
}
