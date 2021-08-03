package day5;

public class TrainSchedule {

		private int n;
		private String code;
		private String station;
		private double arr;
		private double dep;
		
		public TrainSchedule(int  n,String code,String station,double arr,double dep)
		{
			this.n=n;
			this.code=code;
			this.station=station;
			this.arr=arr;
			this.dep=dep;
		}
		
		public TrainSchedule() {
			// TODO Auto-generated constructor stub
		}
		
		public void printDisplay()
		{
			System.out.printf("%-3d %-5s %-16s %7.2f %7.2f\n" , n,code,station,arr,dep);
		}
		
		
	public int getN() {
			return n;
	}
		public String getCode() {
			return code;
		}
		
		public String getStation() {
			return station;
		}
		
		public double getArr() {
			return arr;
		}
		
		public double getDep() {
			return dep;
		}
		
	public static void main(String[] args) {
		
         TrainSchedule[] trainschedule= { new TrainSchedule (1,"YPR","Yasvantpur Jn",0,23.40), 
        		                          new TrainSchedule(2,"GTL","Guntakal Jn",03.25,03.52),
        		                          new TrainSchedule(3,"SC","Secundrabadl Jn",03.25,03.52),
        		                          new TrainSchedule(4,"BPQ","Balharshah",03.25,03.52),
        		                          new TrainSchedule(5,"HBJ","Habibganj",03.25,03.52),
        		                          new TrainSchedule(6,"JHS","JhansiJn",03.25,03.52),
        		                          new TrainSchedule(7,"DEE","Delhi S Rohilla",03.25,03.52)
        		                          };
         System.out.println("---------------------------------------------");
         System.out.println("#   Code   Station            Arr.     Dep.");
         System.out.println("---------------------------------------------");
         
         int[] arr = {1,2 ,3,45,6,78};
         
  
         
         for(TrainSchedule trainschedules : trainschedule ) {
        	 trainschedules.printDisplay();
         }
	}
}
