package Task1;

public class BusinessTrip {
	private double rate;
	private String account; 
	private double transport;
	private int days;
	
	public BusinessTrip(double rate,String account,double transport,int days ){
		this.rate=rate;
		this.account = account;
		this.transport = transport;
		this.days = days;
		
	}
	
    public BusinessTrip(){
		
	}
    
    void setRate(double rate){
    	this.rate=rate;
    }
    void setAccount(String account){
    	this.account=account;
    }
    void setTransport(double transport){
    	this.transport = transport;
    }
    void setDays(int days){
    	this.days = days;
    }
    
    double getRate(){
    	return this.rate;
    }
    String getAccount(){
    	return this.account;
    }
    double getTransport(){
    	return this.transport;
    }
    int getDays(){
    	return this.days;
    }
    
    double getTotal(){
    	return transport+rate*days;
    }
	
    void Show(){
    	System.out.println("Rate = "+rate);
    	System.out.println("Account = "+account);
    	System.out.println("Transport ="+transport);
    	System.out.println("Days ="+days);
    	System.out.println("Total ="+getTotal());  	
    }
    void toStrin(){
    	System.out.println(rate+";"+account+";"+transport+";"+days+";"+getTotal());
    }

}
