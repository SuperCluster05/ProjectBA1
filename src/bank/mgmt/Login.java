package bank.mgmt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton login,clear; //globally defined
    JTextField  cardTextField;
    JPasswordField passTextField;
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
                
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/download.jpg")); //1st Image step 
        Image i2  = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); //ICON ke liye
        //for Image
        JLabel label = new JLabel(i3);
        label.setBounds(200,10,100,100); //for location 
        
        add(label);
        //for text 
        JLabel text = new JLabel("Canara ");
        add(text);
        text.setFont(new Font("Verdana",Font.BOLD,38));
        text.setForeground(Color.WHITE);
        text.setBounds(300,40,400, 40);
        
        //for cardno
        JLabel cardno = new JLabel("Upi id :");
        add(cardno);
        cardno.setFont(new Font("Verdana",Font.BOLD,38));
        cardno.setForeground(Color.WHITE);
        cardno.setBounds(120,150,400, 40);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,150,40);
        cardTextField.setBackground(Color.BLACK);
        cardTextField.setForeground(Color.WHITE);
        cardTextField.setFont(new Font("Verdana",Font.BOLD,15));
        add(cardTextField);
        
        login = new JButton("Biometric");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.CYAN);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login );
        
        
        //for passcode
        JLabel passcode = new JLabel("Passcode ");
        add(passcode);
        passcode.setFont(new Font("Verdana",Font.BOLD,38));
        passcode.setForeground(Color.WHITE);
        passcode.setBounds(200,200,450, 40);
        
        passTextField = new JPasswordField();
        passTextField.setBounds(230,250,150,40);
        passTextField.setBackground(Color.BLACK);
        passTextField.setForeground(Color.WHITE);
        add(passTextField);
        
        clear = new JButton("₰");
        clear.setBounds(400,250,50,30);
        clear.setBackground(Color.CYAN);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear );
        
        //Background method
        getContentPane().setBackground(Color.BLACK);
        
        
                
        setSize(800,400);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            passTextField.setText("");
            
        }else if(ae.getSource() == login){
        
        
    }
    }
    
    public static void main(String args[]){
        new Login();
        
        
        
    }
    
}
