import java.sql.SQLException;
public class CreateAccount {
	    

	   public static void main(String[] args) {
		ConnectToDatabase ob= new ConnectToDatabase();
		ob.connect();
		
		try{
	      
	      //STEP 4: Execute a query
	      
	      
	      String sql = "INSERT INTO accountholder " +
	                   "VALUES ('H0009', 'suvimalee')";
	      ob.stmt.executeUpdate(sql);
	     
	      
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