
package assignment5;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    
    public static void main(String[]args) throws IOException{
        
        int nr1 ,nr2 , tempValue ;
        //shoul I make a instance of JFrame here?
        //scaner for user input
        Scanner sc = new Scanner(System.in);
        
        //socket
        Socket clientS = new Socket("localhost", 1000);
       
        //output server
        Scanner scan= new Scanner(clientS.getInputStream());
        System.out.println("Enter 2 numbers");
        nr1=sc.nextInt();
        nr2=sc.nextInt();
        
        PrintStream p = new PrintStream(clientS.getOutputStream());
        
        p.println(nr1);
        p.println(nr2);
        
        tempValue = scan.nextInt();
        
        System.out.println(tempValue);
        
        
       }
    
    
    }
    
