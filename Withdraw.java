public class Withdraw{
  	String accID="ACC0001";
	//String pin="12345";
	String type="Fixed Deposit";
	String holderID="H0003";
  	float withdrawAmount=(float) 100.00;
  
	Deposit newWithdrawal=new Deposit();    //Assumed table Account exists
  
	System.out.println("Enter Withdraw Amount: ");\
	withdrawAmount=sc.nextFloat();
	
  	while(withdrawAmount>newWithdrawal.amount){
  	System.out.println("Account has only Rs."+newWithdrawal.amount+"\nPlease enter a valid amount");
    	withdrawAmount=sc.nextFloat();
  	}
  
  	newWithdrawal.amount-=withdrawAmount;
  
}
