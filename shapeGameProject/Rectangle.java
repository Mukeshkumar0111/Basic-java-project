

public class Rectangle extends TwoDShape{
	double l, w;
	public Rectangle() {
		
	}
	Rectangle(double l, double w){
		this.l=l;
		this.w=w;
	}
	@Override
	public void printDetails() {
		System.out.println("Length is: "+l+" Unit");
		System.out.println("Width is: "+w+" Unit");
	}
	@Override
	public void printArea() {
		System.out.println("Area is: "+l*w+" Sq. Unit");
	}
	@Override
	public void printPerimeter() {
		System.out.println("Perimeter is: "+2*(l+w)+" Unit");
	}
	

}
