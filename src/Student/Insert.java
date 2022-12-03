
package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;

       
public class Insert{

void  my_Insert(String str1, String str2,String str3) {
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  

Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/java","root","123456");
Statement st=con.createStatement();  
int age = Integer.parseInt(str3); 

String query1="INSERT INTO student"
+ " (rollno, name, age)"
+ "VALUES('" +str1+"','"+str2+"','"+age+"')";
int i =  st.executeUpdate(query1);
        	if(i!=0) {
        		System.out.println("Record is deleted");
        		JOptionPane.showMessageDialog(null, "Record is Inserted in the Database","Alert",JOptionPane.INFORMATION_MESSAGE);
        	}
        	else {
        		System.out.println("Sorry! Failure");
        		JOptionPane.showMessageDialog(null, "Record is not not Inserted in the Database","Alert",JOptionPane.ERROR_MESSAGE);
        		
        	}

con.close();  

}catch(Exception e){ 
    System.out.println(e);
}
}}
