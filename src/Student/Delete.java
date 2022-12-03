
package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;

       
public class Delete{

public void  my_Delete(String str1, String str2,String str3) {
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  

Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/java","root","123456");
Statement st=con.createStatement();  
int age = Integer.parseInt(str3); 

String query1="Delete from student where rollno='"+str1+"'";

int i =  st.executeUpdate(query1);
        	if(i!=0) {
        		System.out.println("Record is deleted");
        		JOptionPane.showMessageDialog(null, "Record is Deleted from the Database","Alert",JOptionPane.WARNING_MESSAGE);
        	}
        	else {
        		System.out.println("Sorry! Failure");
        		JOptionPane.showMessageDialog(null, "Record not Deleted from the Database","Alert",JOptionPane.ERROR_MESSAGE);
        		
        	}

con.close();  

}catch(Exception e){ 
    System.out.println(e);
}
}}