
public class Circle extends TwoDShape {
	double radiu;

	
	public Circle() {
		super();
	}

	public Circle(double radiu) {
		super();
		this.radiu = radiu;
	}

	@Override
	public void printArea() {
		System.out.println("Area is : " + Math.PI*radiu*radiu);
		
	}

	@Override
	public void printPerimeter() {
		System.out.println("Perimeter is: " + Math.PI*2*radiu);
		
		
	}

	@Override
	public void printDetails() {
		System.out.println("Radius is: " + radiu);
			
	}

}
