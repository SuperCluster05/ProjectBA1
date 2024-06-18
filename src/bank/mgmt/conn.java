
package bank.mgmt;
import java.sql.*;
public class conn {
    
    Connection c;
    Statement s;
    
    public conn(){
        try{
          
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmgmt","root","123456");
            s = c.createStatement();
        }catch (Exception e) {
            System.out.println(c);
        }
    
        
    }
    
    public static void main(String[] args){
        conn c1 = new conn();
        System.out.println(c1.c);
                
    }
            
    
}
