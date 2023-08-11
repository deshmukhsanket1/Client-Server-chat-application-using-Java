import java.net.*;
import java.io.*;

class Server
{
    public static void main(String arg[]) throws Exception
    {
         System.out.println("Server Application is running ");
         ServerSocket ssobj = new ServerSocket(2100);
         System.out.println("Server is running at port no :2100");

         Socket s = ssobj.accept();
         System.out.println("Server And Clinet connection is Successful ");
   
        PrintStream ps = new PrintStream(s.getOutputStream());
         BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
         BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Chatting Appln started");
        String str1,str2;

        while((str1 = br1.readLine()) != null)
        {
              System.out.println("VClinet says"+str1);
                System.out.println("Enter message for clinet ");
            str2 = br2.readLine();
            ps.println(str2);
        }
        System.out.println("Thank for using chat messangnr");

    }
}