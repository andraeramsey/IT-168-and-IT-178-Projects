package mysql_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class mysql_test
{	
	public static void main(String args[]){
		int i;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(
					//"jdbc:oracle:thin:@:3306:cleat_ltkigoma","CLEATPlot","HmwZVeGJ");
					"jdbc:mysql://130.225.18.76:3306/cleat_ltkigoma","CLEATPlot","HmwZVeGJ");  

				//Statement stmt=con.createStatement();

				//ResultSet rs=stmt.executeQuery("SELECT * FROM cleat_ltkigoma.streams;");
				//ResultSet rs=stmt.executeQuery("SELECT * FROM cleat_ltkigoma.measurements");
		
			//ResultSet result=stmt.executeQuery
			String sql = "SELECT * FROM cleat_ltkigoma.measurements ORDER BY MeasurementTime desc LIMIT 1000";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet result = ps.executeQuery();
			ArrayList<Integer> values = new ArrayList<>(); // This is where I store the values I want to keep, you can do it w/e way you want
			LocalDateTime ldt1;
			LocalDateTime ldt2;
			// Take the earliest time
			result.next(); // You might want to put that in an if() or catch Exceptions
			ldt1 = LocalDateTime.parse(result.getString(3));
			values.add(result.getInt(2));
			// Increment throught the values until you find one with more than an hour difference with the first one, keep it and change that first one to this new one to continue
			i=0;
			while (result.next()&& i<=48) {
			    ldt2 = LocalDateTime.parse(result.getString(3));
			    if (Duration.between(ldt1, ldt2).getSeconds() >= 60*60) {
			        values.add(result.getInt(2));
			        ldt1 = ldt2;
			    }
			    else;
			}
			System.out.println("values:\n");
			System.out.println(values);
		}
		catch(Exception e){ System.out.println(e);}
	}
}
