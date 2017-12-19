import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectToDatabase {
	
	
	    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL = "jdbc:mysql://localhost/xbank?autoReconnect=true&useSSL=false";
   
	    final String USER = "root";
	    final String PASS = "root";
	    Connection conn = null;
	    Statement stmt = null; 
	    
public void connect()
{
	
	   try{
	       //STEP 2: Register JDBC driver
	       Class.forName("com.mysql.jdbc.Driver");

	       //STEP 3: Open a connection
	       System.out.println("Connecting to a selected database...");
	       conn = DriverManager.getConnection(DB_URL,USER,PASS);
	       System.out.println("Connected database successfully...");
	       System.out.println("Inserting records into the table...");
	       stmt = conn.createStatement();
	    }catch(SQLException se){
	        //Handle errors for JDBC
	        se.printStackTrace();
	     }catch(Exception e){
	        //Handle errors for Class.forName
	        e.printStackTrace();
	     }
}
	   


public void disconnect()
{
	// TODO Auto-generated method stub
	 //finally block used to close resources
    try{
       if(stmt!=null)
          conn.close();
    }catch(SQLException se){
    }// do nothing
    try{
       if(conn!=null)
          conn.close();
    }catch(SQLException se){
       se.printStackTrace();
    }//end finally try
 }//end try
	
}




