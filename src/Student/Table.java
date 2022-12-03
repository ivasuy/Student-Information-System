
package Student;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Table extends JFrame{

	public void view() {

		setSize(400,400);

		setLayout(new BorderLayout());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

		String column[]={"Roll Number","Name","Age"};

		String data[][] = new String[50][50];

		Connection conn;

		ResultSet rs;

		String url = "jdbc:mysql://localhost:3306/java";

        String user = "root";

        String pass = "123456";

        Statement stmt;

        try {

        	Class.forName("com.mysql.cj.jdbc.Driver");

        	conn = DriverManager.getConnection(url,user,pass);

        	stmt = conn.createStatement();

        	String db = "select * from student";

        	rs = stmt.executeQuery(db);

        	int i = 0;

        	int k = 1;

        	while(rs.next()){

        		for(int j = 0;j<=2;j++) {

        			if(j!=2) {

        				data[i][j]=rs.getString(k);

        			}

        			else {

        				data[i][j]=rs.getString(k);

        			}

        			k++;

        		}

        		i++;

        		k=1;

        	}

        	rs.close();

			stmt.close();

        }

        catch(Exception e){

        	System.out.println("e");

        }

    	JTable table = new JTable(data,column);

		JScrollPane jsp = new JScrollPane(table,v,h);

		add(jsp,BorderLayout.CENTER);

	}	

}
