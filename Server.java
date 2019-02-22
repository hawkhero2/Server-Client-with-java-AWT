
package assignment5;

//importuri
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
    
     public static void main(String[]args) throws IOException{
         int nr1 , nr2 , tempValue;
         
         ServerSocket s1 = new ServerSocket(1000);
         Socket ss = s1.accept();
         Scanner scan = new Scanner (ss.getInputStream());
         
         nr1= scan.nextInt();
         nr2=scan.nextInt();
         
         tempValue = nr1+nr2;
         
         PrintStream p = new PrintStream(ss.getOutputStream());
         
         p.println(tempValue);
        
         
               
     
     }
    
}
