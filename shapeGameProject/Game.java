

import java.util.Scanner;

public class Game {
	{
		System.out.println("==Game Has Started==");
	}
	public void selectShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1==>TwoDShape");
		System.out.println("Press 2==>ThreeDShape");
		int choice=sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("You have selected TwoDShape");
					TwoDShape t1=selectTwoDShape();
					t1.printDetails();
					t1.printArea();
					t1.printPerimeter();
					break;
			case 2:
				System.out.println("You have selected ThreeDShape");
					ThreeDShape t2=selectThreeDShape();
					t2.printDetails();
					t2.printVolume();
					t2.printLSA();
					t2.printTSA();
				break;
			default:
				System.out.println("Invalid Choice Entered");
				selectShape();
		}	
	}
	public TwoDShape  selectTwoDShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1==>Rectangle");
		System.out.println("Press 2==> Circle");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("You have selected Rectangle");
				System.out.println("Enter Length: ");
				double l=sc.nextDouble();
				System.out.println("Enter Width: ");
				double w=sc.nextDouble();
				return new Rectangle(l,w);
			
			case 2:
				System.out.println("You have selected Circle");
				System.out.println("Enter the radius");
				double r=sc.nextDouble();
				return new Circle(r);
			default:
				System.out.println("Invalid chopice entered!");
				return selectTwoDShape();
		
		}
	}
	public ThreeDShape  selectThreeDShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1==>Cylinder");
		System.out.println("Press 2==> Cuboid");
		int choice=sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("You have selected Cylinder");
				System.out.println("Enter radius: ");
				double r=sc.nextDouble();
				System.out.println("Enter Height: ");
				double h=sc.nextDouble();
				return new Cylinder(r,h);
				
			case 2:
				System.out.println("You have selected Cuboid");
				System.out.println("Enter length: ");
				double l=sc.nextDouble();
				System.out.println("Enter Weight: ");
				double w=sc.nextDouble();
				System.out.println("Enter height: ");
				double he=sc.nextDouble();
				
				return new Cuboid(l,w,he);
			default:
				System.out.println("Invalid chopice entered!");
				return selectThreeDShape();
		}
	}
}






