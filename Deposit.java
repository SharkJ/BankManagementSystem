import java.sql.SQLException;
//import java.util.Scanner;

public class Deposit {
	

   public static void main(String[] args) {
	ConnectToDatabase ob= new ConnectToDatabase();
	ob.connect();
	//Scanner x=new Scanner(System.in);	
	
   try{
      
      //STEP 4: Execute a query
      
	   /* System.out.print("Enter Account ID:");
	   String accID=x.next();
	   System.out.print("Enter pin:");
	   String pin=x.next();
	   System.out.print("Enter Amount:");
	   float amount=x.nextFloat(); */
	   
	   String accID="ACC0001";
	   //String pin="12345";
	   String type="Fixed Deposit";
	   String holderID="H0003";
	   float amount=(float) 100.00;
	   
      String sql = "INSERT INTO account(amount,type,holderID) " +
                   "VALUES( '"+amount+"','"+type+"','"+holderID+"')"+
    		       "WHERE accID='"+accID+"'";
     // ob.stmt.executeQuery(sql);------->Can not issue data manipulation statements with executeQuery().
      ob.stmt.executeUpdate(sql);
//      PreparedStatement statement = connection.prepareStatement("select * from myDatabase.myTable where name = ?");    
//      statement.setString(1, name);    
//      ResultSet resultSet = statement.executeQuery();
     
     
      System.out.println("Inserted records into the table...");
   
   }catch(SQLException se){
       //Handle errors for JDBC
       se.printStackTrace();
    }catch(Exception e){
       //Handle errors for Class.forName
       e.printStackTrace();
    }
   ob.disconnect();
   System.out.println("Goodbye!");
   }
}


