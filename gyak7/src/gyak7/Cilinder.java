package gyak7;

public  class Cilinder extends Prism {
	
	private double radius;
	
	public Cilinder(int height,double radius) {
		super(height);
		this.radius=radius;
	}

	public double getBaseArea() {
		return radius*radius*Math.PI;
	}

	@Override
	public String toString() {
		return "Cilinder [radius=" + radius + ", getHeight()=" + getHeight() + "]";
	}

	@Override
	public double getbasearea() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	
	
	
}
