
package bank.mgmt;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Signup1 extends JFrame implements ActionListener{
    String query;
    long random;
   
    JPasswordField MpinTextField;
    JButton next;
    
    Signup1(){
        setLayout(null);
        
        Random ran = new Random();
        long random =  Math.abs((ran.nextLong() %9000L) +1000L);
        
        
        JLabel formno = new JLabel("Registration form no. " + random);
        formno.setFont(new Font("Verdana",Font.BOLD,38));
        formno.setForeground(Color.WHITE);
        formno.setBounds(140,20,600,40);
        add(formno);
        getContentPane().setBackground(Color.BLACK);
        setSize(850,900);
        setLocation(350,10);
        setVisible(true);
        
        JLabel Mpin = new JLabel("Create Mpin ");
        add(Mpin);
        Mpin.setFont(new Font("Verdana",Font.BOLD,38));
        Mpin.setForeground(Color.WHITE);
        Mpin.setBounds(250,150,400, 40);
        
        MpinTextField = new JPasswordField();
        MpinTextField.setBounds(350,200,100,40);
        MpinTextField.setBackground(Color.WHITE);
        MpinTextField.setForeground(Color.BLACK);
        MpinTextField.setFont(new Font("Verdana",Font.BOLD,15));
        add(MpinTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
    }
    public void actionPerFormed(ActionEvent ae) {
        System.out.println("Inside");
        String formno = "" + random; //long
        String Mpin = MpinTextField.getText();
        
        
        try{
            if(Mpin.equals("")){
                JOptionPane.showMessageDialog(null, "MPin is required");
                
            }else{
                conn c = new conn();
                query = "insert into signup values('"+formno+"','"+Mpin+"')";
                
                
                c.s.executeUpdate(query);
                        
                
            }
        }catch(HeadlessException | SQLException e){
            System.out.println(e);
        }
                   
        
    }   
    
     public static void main(String args[]){
         new Signup1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
         conn c = new conn();
         
        try {
            c.s.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Signup1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}