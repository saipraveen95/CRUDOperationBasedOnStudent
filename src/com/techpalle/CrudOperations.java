
	package com.techpalle;

	import java.sql.*;

	public class CrudOperations 
	{
		private static final String classname="com.mysql.cj.jdbc.Driver";
		private static final String url="jdbc:mysql://localhost:3306/jdbcproject";
		private static final String username="root";
		private static final String password="admin";
		
		private static Connection con=null;
		private static Statement s=null;
		private static PreparedStatement ps=null;
		private static ResultSet rs=null;
	    public static void create()
	    {
	    	try 
	    	{
				Class.forName(classname);
				con=DriverManager.getConnection(url, username, password);
				s=con.createStatement();
				String qry="create table Employee(eno int primary key,ename varchar(40),esal int)";
				s.executeUpdate(qry);
			}
	    	catch (SQLException e) 
	    	{
				System.out.println("create----");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
	    	
	    	finally
	    	{
	    		try
	    		{
	    		if(s!=null)
	    			s.close();
	    		if(con!=null)
	    			con.close();
	    		}
	    		catch(SQLException e)
	    		{
	    			e.printStackTrace();
	    		}
	    		
	    	}
	    	
	    }
	    public static void insert(int no,String name,int sal)
	    {
	    	try 
	    	{
				Class.forName(classname);
				con=DriverManager.getConnection(url, username, password);
				ps=con.prepareStatement("insert into employee values(?,?,?)");
				ps.setInt(1, no);
				ps.setString(2, name);
				ps.setInt(3, sal);
				ps.executeUpdate();
			}
	    	catch (SQLException e) 
	    	{
				System.out.println("insert---");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
	    	
	    	finally
	    	{
	    		try
	    		{
	    		if(s!=null)
	    			s.close();
	    		if(con!=null)
	    			con.close();
	    		}
	    		catch(SQLException e)
	    		{
	    			e.printStackTrace();
	    		}
	    		
	    	}
	    	
	    }
	    public static void update(int no,int sal)
	    {
	    	try 
	    	{
				Class.forName(classname);
				con=DriverManager.getConnection(url, username, password);
				ps=con.prepareStatement("update employee set esal=? where eno=?");
				ps.setInt(1, sal);
				ps.setInt(2, no);
				ps.executeUpdate();
			}
	    	catch (SQLException e) 
	    	{
				System.out.println("update---");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
	    	
	    	finally
	    	{
	    		try
	    		{
	    		if(s!=null)
	    			s.close();
	    		if(con!=null)
	    			con.close();
	    		}
	    		catch(SQLException e)
	    		{
	    			e.printStackTrace();
	    		}
	    		
	    	}
	    	
	    }
	    public static void delete(int no)
	    {
	    	try 
	    	{
				Class.forName(classname);
				con=DriverManager.getConnection(url, username, password);
				String qry="delete from employee where eno=?";
		        ps=con.prepareStatement(qry);
		        ps.setInt(1,no);
				ps.executeUpdate();
			}
	    	catch (SQLException e) 
	    	{
				System.out.println("delete---");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} 
	    	
	    	finally
	    	{
	    		try
	    		{
	    		if(s!=null)
	    			s.close();
	    		if(con!=null)
	    			con.close();
	    		}
	    		catch(SQLException e)
	    		{
	    			e.printStackTrace();
	    		}
	    		
	    	}
	    	
	    }
	
}
