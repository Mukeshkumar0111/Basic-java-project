import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Game g=new Game();
		char c;
		do {
			g.selectShape();
			System.out.println("Enter y to conytinue...");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("======Game Ends========");
	}

}
