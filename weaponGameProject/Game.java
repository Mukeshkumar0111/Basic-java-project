

import java.util.Scanner;

public class Game {
	
	{
		System.out.println("===New Game has Started===");
	}
	
	public  Weapon selectWeapon() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Score: ");
		int score=sc.nextInt();
		if(score<=400) {
			System.out.println("You got Knife!");
			Knife k=new Knife();
		return k;	
		}else if(score<=800) {
			System.out.println("Press 1 for Knife or 2 for Gun");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("You have selected Knife!");
				Knife k=new Knife();
			return k;	
			}
			System.out.println("You have selected Gun!");
		return new Gun();
		}
		else {
			System.out.println("Press 1 for Knife or 2 for Gun 3 for Bomb");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("You have selected Knife!");
				Knife k=new Knife();
			return k;	
			}else if(choice==2) {
				System.out.println("You have selected Gun!");
				return new Gun();
			}
			System.out.println("You got Bomb!");
			Bomb b=new Bomb();
		return b;
		}
	}

}





