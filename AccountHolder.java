
public class AccountHolder {
	private String accNo,name,address,dob;
	private int telNo,pin;
	
	AccountHolder(){
	}
	
	AccountHolder(String accNo,String name,String address,int telNo,String dob,int pin)
	{
		this.accNo= accNo;
		this.name=name;
		this.address= address;
		this.telNo= telNo;
		this.dob= dob;
		this.pin= pin;
	}
	
	public void setAccNo(String tAccNo){
		accNo=tAccNo;
	}
	
	public String getAccNo(){
		return accNo;
	}
	public void setName(String tName){
		name=tName;
	}
	
	public String getName(){
		return accNo;
	}
	public void setAddress(String tAddress){
		address=tAddress;
	}
	
	public String getAddress(){
		return address;
	}
	public void setTelNo(int tTelNo){
		telNo=tTelNo;
	}
	
	public int getTelNo(){
		return telNo;
	}
	public void setDob(String tDob){
		dob=tDob;
	}
	
	public String getDob(){
		return dob;
	}
	public void calPin(){
                Random rand = new Random();
		int randomPin = rand.nextInt(99999) + 11111;
		while(randomPin==123){		//check whether the pin already exists in the DB
			randomPin =  rand.nextInt(88888) + 11111;	
		}
                pin=randomPin;
		
	}
	
	public int getPin(){
		return pin;
	}
}
