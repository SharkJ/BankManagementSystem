
public class AccountHolder {
	private String accNo,name,address,dob;
	private int telNo,pin;
	
	AccountHolder(){
	}
	
	AccountHolder(String accID,String name,String address,int telNo,int dob,int pin)
	{
		this.accID= accID;
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
	
	public String address(){
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
		int randomPin = random.nextInt(99999);
		while(randomPin<11111 || randomPin==....){		//check whether the pin already exists in the DB
			int randomPin = random.nextInt(99999);	
		}
		pin=randomPin;
	}
	
	public int getPin(){
		return pin;
	}

}
