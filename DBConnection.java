import java.sql.*;

class DBConnection
{
	private static Connection conn;
	
	private DBConnection(){}
	
	public static Connection getConnection()
	{
		try
		{
			if(conn==null)
			{
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return conn;
	}
}