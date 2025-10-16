
import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to start new Game");
		System.out.println("Press 2 for setting");
		System.out.println("Press 3 to Exit");
		int choice=sc.nextInt();
		if(choice==1) {
			Game g=new Game();
			Weapon w=g.selectWeapon(); ;//new Knife() Or new Gun() or new Bomb()
			w.use();
		}else if(choice==2) {
			System.out.println("You have selected settings");
			//future implementation
		}
		else {
			System.out.println("===Game will Exit Now===");
			System.exit(1);
		}
		
	}

}
