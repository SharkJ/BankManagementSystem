
public class AccountHolder {
	private String accNo,name,address;
	private int telNo,dob,pin;
	
	AccountHolder(){
	}
	
	AccountHolder(String accID,String name,String address,String telNo,String dob,String pin)
	{
		this.accID= accID;
		this.name=name;
		this.address= address;
		this.telNo= telNo;
		this.dob= dob;
		this.pin= pin;
	}
	
	public void setAccNo(String accNo){
		accNo=accNo;
	}
	
	public String getAccNo(){
		return accNo;
	}
	public void setName(String name){
		name=name;
	}
	
	public String getName(){
		return accNo;
	}
	public void setAddress(String address){
		address=address;
	}
	
	public String address(){
		return address;
	}
	public void setTelNo(int telNo){
		telNo=telNo;
	}
	
	public int getTelNo(){
		return telNo;
	}
	public void setDob(int dob){
		dob=dob;
	}
	
	public int getDob(){
		return dob;
	}
	public void setPin(String pin){
		accNo=accNo;
	}
	
	public String getPin(){
		return pin;
	}

}
