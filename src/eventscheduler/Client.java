package eventscheduler;
import java.io.*;
import java.net.*;
import java.sql.SQLException;

public class Client {
    public String username;
    public String password;
    public int id;
    private int groupId;
    public boolean isConnected;
    public int portNum;
    public String serverHostName;
    public Socket clientSocket;
    public PrintWriter out;
    public BufferedReader in;
    //public ObjectInputStream obin;
    
    Client(String username, String password, String serverHostName, int portNum){
        this.username = username;
        this.password = password;
        this.serverHostName = serverHostName;
        this.portNum = portNum;
        isConnected = false;
        clientSocket = null;
    }
    
    @SuppressWarnings("UseSpecificCatch")
    public void connectToServer(){
        System.out.println ("New Client connecting to server: " + 
                serverHostName + " at portNum: " + portNum);
        try {
            clientSocket = new Socket(serverHostName, portNum);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            //obin = new ObjectInputStream(clientSocket.getInputStream());
            isConnected = true;
        }
        catch (UnknownHostException e) {
            System.out.println("Unknown host: " + serverHostName + " " + e);
            isConnected = false;
        }
        catch (IOException e) {
            System.out.println("I/O stream error for server: " + serverHostName + " " + e);
            isConnected = false;
        }
    }
    
    public void disconnectFromServer(){
        try{
            clientSocket.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public boolean login(){
        if(!isConnected)  
            return false;
        String output = "login?username=" + username + "&password=" + password;
        try{
            out.println(output); 
            System.out.println("check");
            if("err".equals(in.readLine())){
                return false;
            }
            System.out.println("Logged in!");
            groupId = Integer.parseInt(in.readLine());
            System.out.println("Group id is " + groupId);
            id = Integer.parseInt(in.readLine());
            System.out.println("User Id is " + id);
            return true;
        } catch(IOException e){
            System.out.println(e);
        }
        return false;
        
    }
    
    public void viewEvents()throws IOException, SQLException{
        String output = "viewevents?";
        String input = null;
        input = in.readLine();
         if("err".equals(input)){
            System.out.println("Some error occured");
         }
         else{
            System.out.println("Succsessfully added");
        }

     }
}