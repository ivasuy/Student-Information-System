
package Student;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

class swing extends JFrame implements ActionListener{
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JButton b1,b2,b3;
    ImageIcon i;
    
  class CreateRoundButton extends JButton {
  CreateRoundButton(String label) {
    super(label);
    Dimension size = getPreferredSize();
    size.width = size.height = Math.max(size.width,size.height);
    setPreferredSize(size);

    setContentAreaFilled(false);
    }
  }
    
    public swing(){
        
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\vASU yadav\\Documents\\NetBeansProjects\\P2\\src\\p2\\Bg.jpg")));
        setSize(500,400);
        l1 = new JLabel("Enter the roll number");
        l1.setBounds(50, 50, 150, 20);
        add(l1);
        
        l2 = new JLabel("Enter the name");
        l2.setBounds(50, 100, 150, 20);
        add(l2);
        
        l3 = new JLabel("Enter the age");
        l3.setBounds(50, 150, 150, 20);
        add(l3);
        
        l4 = new JLabel("Student Information System");
        l4.setBounds(70, 12, 500, 20);
        l4.setFont(new Font("Verdana", Font.BOLD, 20));
        add(l4);
        
        t1 = new JTextField(15);
        t1.setBounds(200,50,150,20);
        add(t1);
        
        t2 = new JTextField(15);
        t2.setBounds(200,100,150,20);
        add(t2);
        
        t3 = new JTextField(15);
        t3.setBounds(200,150,150,20);
        add(t3);
        
        b1 = new CreateRoundButton("Insert");
        b1.setBounds(150,200,95,30);
        b1.setForeground(Color.CYAN);
        add(b1);
        b1.addActionListener(this);
        
        b2 = new CreateRoundButton("Delete");
        b2.setBounds(290,200,95,30);
        b2.setForeground(Color.CYAN);
        add(b2);
        b2.addActionListener(this);
        
        b3 = new CreateRoundButton("View Database");
        b3.setBounds(200,250,150,30);
        b3.setForeground(Color.CYAN);
        add(b3);
        b3.addActionListener(this);
        
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



    }
    public void actionPerformed(ActionEvent ae){
            String rollno=t1.getText();
            String name=t2.getText();
            String age=t3.getText();
            // creating one object
            if ( ae.getSource() == b1 ){
                Insert obj=new Insert();
                obj.my_Insert(rollno,name, age);
        }
            else if ( ae.getSource() == b2 ){
                Delete o =new Delete();
                o.my_Delete(rollno,name, age);
            }
            else if ( ae.getSource() == b3 ){
                Table oj =new Table();
                oj.view();
            }
    }
}
    
public class Main{
    public static void main(String a[]){
        swing obj = new swing();
    }
}