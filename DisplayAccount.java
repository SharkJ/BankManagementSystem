import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Wrapper;
public class DisplayAccount {
	public static final String URL="jdbc:mysql://localhost/xbank?autoReconnect=true&useSSL=false";
	//public static final String URL="http://localhost/mysql/tbl_structure.php?db=xbank&table=accountholder&token=5733fa4c9a3ddc33524c3f64d4cdf9ba";
	public static final String USER="root";
	public static final String PASSWORD="root";
	public static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
	Connection con;
	Wrapper st;
	ResultSet rs;  
	
	public DisplayAccount()
	{
		try
		{
			Class.forName(DRIVER_CLASS);			
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public Connection connect()
	{
		Connection connection = null;
		try
		{
			connection = DriverManager.getConnection(URL, USER, PASSWORD);			
		}
		catch (SQLException e)
		{
			System.out.println("ERROR:Unable to connect to database.");
		}
		return connection;
	}
	public void adddata()
	{
		con=(Connection)connect();
		try
		{
			st=con.createStatement();			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		String query="SELECT * FROM accountholder WHERE holderID='H0003' ";
		try
		{
			rs=((java.sql.Statement) st).executeQuery(query);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			while (rs.next())
			{
				//String accID=rs.getString("accID");
				//String name=rs.getString("type");
				//String amount=rs.getString("amount");
				String holderID=rs.getString("holderID");
				String name=rs.getString("name");
				System.out.printf(holderID+"%n"+name+"%n");
				
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			System.out.println("ERROR:i did this.");
		}
	}
	public static void main (String[] args)
	{
		DisplayAccount object=new DisplayAccount();
		object.adddata();
	}

}


