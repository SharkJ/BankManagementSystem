import java.sql.SQLException;
import com.mysql.jdbc.Wrapper;
public class DisplayAccountInfo {
	ConnectToDatabase ob= new ConnectToDatabase();
	

	public void displayBalance()
	{
		ob.connect();
		
		try
		{
			ob.st=(Wrapper) ob.conn.createStatement();			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		String query="SELECT amount FROM account WHERE accID='ACC0002' ";
		
		try
		{
		  ob.rs=((java.sql.Statement) ob.st).executeQuery(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			while (ob.rs.next())
			{
				String amount=ob.rs.getString("amount");
				System.out.printf("Your Account balance="+amount);				
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			
		}
		ob.disconnect();
	}
	public static void main (String[] args)
	{
		DisplayAccountInfo object=new DisplayAccountInfo();
		object.displayBalance();
	}

}


