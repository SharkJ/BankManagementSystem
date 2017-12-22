public class Withdraw{
  	String accID="ACC0001";
	//String pin="12345";
	String type="Fixed Deposit";
	String holderID="H0003";
  	float amount=(float) 100.00;
  
  Account newWithdrawal=new Account();    //Assumed table Account exists
  
  while(amount>newWithdrawal.amount){
    System.out.println("Account has only Rs."+newWithdrawal.amount+"\nPlease enter a valid amount");
    amount=sc.nextFloat();
  }
  
  newWithdrawal.amount-=amount;
  
}
