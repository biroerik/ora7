package gyak7;


	public abstract class Prism{
		private int height;
	

	
	public Prism(int height) {
		super();
		this.height=height;
	}
	public int getHeight() {
		return height;
	}
	public abstract double getbasearea();
	public double getvoulume() {
		return height*getbasearea();
	}
	
	public boolean hasbiggervolumethan(Prism prism) {
		if(this.getvoulume()>prism.getvoulume())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	}
