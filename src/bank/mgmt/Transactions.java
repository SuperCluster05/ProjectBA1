
package bank.mgmt;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Transactions extends JFrame implements ActionListener   {
    
    Transactions() throws IOException{
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image  = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction ");
        text.setBounds(235,300,700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        JButton deposit = new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        image.add(deposit );
        
        JButton withdrawl = new JButton("Withdrawl");
        withdrawl.setBounds(335,415,150,30);
        image.add(withdrawl);
        
        JButton fastcash = new JButton("Fast Cash ");
        fastcash.setBounds(170,415,150,30);
        image.add(fastcash);
        
        JButton ministatement = new JButton("Mini Statement");
        ministatement.setBounds(355,415,150,30);
        image.add(ministatement);
        
        JButton pinchange = new JButton("pin change");
        pinchange.setBounds(170,415,150,30);
        image.add(pinchange);
        
        JButton balance = new JButton("Balance enquiry");
        balance.setBounds(355,415,150,30);
        image.add(balance);
        
        JButton exit = new JButton("Exit");
        exit.setBounds(355,520,150,30);
        image.add(exit);
        
        
        
        
        
               
        
    

      //background 
        getContentPane().setBackground(Color.BLACK);
    
        

         
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }

   
    @Override
    public void actionPerformed(ActionEvent ae){
        
    }
    public static void main(String args[]) throws IOException{
        new Transactions();
    }

   
}
        
