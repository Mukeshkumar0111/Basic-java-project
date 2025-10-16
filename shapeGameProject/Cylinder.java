

public class Cylinder extends ThreeDShape{
	double r, h;
	public Cylinder() {
		
	}
	Cylinder(double r, double h){
		this.r=r;
		this.h=h;
	}
	@Override
	public void printVolume() {
		double v=Math.PI*r*r*h;
		System.out.println("Volume is: "+v+" Cube Unit");
	}
	@Override
	public void printLSA() {
		double lsa=2*Math.PI*r*h;
		System.out.println("LSA is: "+lsa+" Sq. Unit");
	}
	@Override
	public void printTSA() {
		double tsa=2*Math.PI*r*(r+h);
		System.out.println("TSA is: "+tsa+" Sq. Unit");
		
	}
	@Override
	public void printDetails() {
		System.out.println("Radius is: "+r+" Unit");
		System.out.println("Height is: "+h+" Unit");
	}

}
