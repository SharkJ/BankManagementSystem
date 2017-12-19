import java.sql.SQLException;
public class CreateAccount {
	    

	   public static void main(String[] args) {
		ConnectToDatabase ob= new ConnectToDatabase();
		ob.connect();
		
		try{     
                  String sql = "INSERT INTO accountholder " +
                  "VALUES ('H0001', 'Randombage Prabhani Amanda')";	  
	     
	      ob.stmt.executeUpdate(sql);
	     
	      
	      System.out.println("Inserted records into the table...");
	   
	   }catch(SQLException se){
	      
	       se.printStackTrace();
	    }catch(Exception e){
	       
	       e.printStackTrace();
	    }
	   ob.disconnect();
	   System.out.println("Account created");
	   }
}
