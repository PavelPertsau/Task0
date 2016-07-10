package Task1;

public class Application {

	public static void main(String[] args) {
		
	 BusinessTrip b[] = new BusinessTrip[5];
	 
	 final double RATE = 25000;
	 String account[]= {"Иванов","Петров"," ","Сазонов","Козлов"};
	 double transport[]={300000,243000,0,50000,10000000};
	 int days[]={2,2,0,1,20};
	 
		for(int i=0;i<b.length;i++){
			
			if(i==4){
				b[i] = new BusinessTrip();
			} else if(i!=2) b[i] = new BusinessTrip(RATE,account[i],transport[i],days[i]);
		}
	//-----------------------------------------------------------------	
		int duration=0;
		for(int i=0;i<b.length;i++){
			if(b[i]!= null){
			b[i].Show();
			if(i==0){
				duration = duration+b[i].getDays();
				}else if(i==1) {				
					duration = duration+b[i].getDays();
					System.out.println("Duration = "+ duration);
					}else if(i==b.length-1){
						b[i].setTransport(5000000);
						}	
			}
		}
		for(int i=0;i<b.length;i++){
			if(b[i]!=null){
				b[i].toStrin();
			}
		}
		
	}

}
