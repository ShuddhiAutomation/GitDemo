package NaukriAutomate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		   String DB_URL = "jdbc:mysql://localhost:3306/Qadbt";
	   // private static final String DB_USER = "your_username";
	   // private static final String DB_PASSWORD = "your_password";
		   WebDriver driver=new ChromeDriver();
			driver.get("https://test.salesforce.com/");
	
		Connection con=DriverManager.getConnection(DB_URL, "root", "Meghana@12");
		
		Statement s=con.createStatement();
	ResultSet rs=	s.executeQuery("select *from Employeeinfo where Location='USA'");
	
	
	while(rs.next()) {
		
		
		
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("name")+ rs.getString("ID"));
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(rs.getString("name"));
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(rs.getString("ID"));
		System.out.println(rs.getString("ID"));
	}
	

	}

}
