
public class Cuboid extends ThreeDShape {
	double length;
	double weight;
	double height;
	
	public Cuboid() {
		super();
	}

	public Cuboid(double length, double weight, double height) {
		super();
		this.length = length;
		this.weight = weight;
		this.height = height;
	}

	@Override
	public void printVolume() {
		System.out.println("Volume is: " + length*weight*height + " cube unit");
	}

	@Override
	public void printLSA() {
		System.out.println("Lateral area of cuboid: " + 2*height*(length+weight)+ "sq.unit");
		
	}

	@Override
	public void printTSA() {
		System.out.println("Total area of Cuboid: " + 2*(length*weight+ weight*height+ height*length)+ "sq.unit");
		
	}

	@Override
	public void printDetails() {
	
		System.out.println("Length is: " + length);
		System.out.println("Weight is: "+ weight);
		System.out.println("Height is: " + height);
		
	}
	
	
	

}
