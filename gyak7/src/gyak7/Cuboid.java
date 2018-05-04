package gyak7;

public class Cuboid extends Prism {
	
	private double a;
	private double b;
	
	public double getBaseArea() {
		return a*b;
	}

	@Override
	public String toString() {
		return "Cuboid [a=" + a + ", b=" + b + ", getHeight()=" + getHeight() + "]";
	}
	
	public Cuboid(int height,double a,double b) {
		super(height);
		this.a=a;
		this.b=b;
	}

	@Override
	public double getbasearea() {
		//  Auto-generated method stub
		return 0;
	}

}
