package gyak7;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 data =new Main2(5);
		Prism cuboid=new Cuboid(4,2,3);
		Prism cilinder=new gyak7.Cilinder(4, 6);
		Cilinder cylinder1=new Cilinder(4,3);
		
		data.setPrism(0, cuboid);
		data.setPrism(2, cilinder);
		data.setPrism(4, cylinder1);
		

		for (int i = 0; i < data.getNumberOfPrism(); i++) {
			System.out.println(data.getPrismByIndex(i));
		}
		
		System.out.println(data.getAvgVolume());
		System.out.println(data.getNumberOfCylinder());
		

	}

}
