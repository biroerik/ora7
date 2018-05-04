package gyak7;

public class Main2 {


		Prism []prismarray;

		public Main2(int numberofelemnets) {
			super();
			prismarray =new  Prism[numberofelemnets];
		}
		public void setPrism(int index,Prism prism) {
			prismarray[index]=prism;
		}
		public int getNumberOfPrism() {
			return prismarray.length;
		}
		
		public Prism[] getPrismarray() {
			return prismarray;
		}
		
		
		public Prism getPrismByIndex(int index) {
			return prismarray[index];
		}
		
		public int getNumberOfNulls() {
			int counter=0;
			
			for (Prism prism : prismarray) {
				if(prism!=null) {
					counter++;
				}
			}
			
			return counter;
		}
		
		public double getAvgVolume() {
			double avg=0;
			
			for (Prism prism : prismarray) {
				if(prism!=null) {
					avg+=prism.getvoulume();
				}
			}
			return avg/getNumberOfNulls();
			
			
		}
		
		public int getNumberOfCylinder(){
			int counter=0;
			for (Prism prism : prismarray) {
				if(prism instanceof Cilinder) {
					counter++;
				}
			}
			return counter;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	

}
