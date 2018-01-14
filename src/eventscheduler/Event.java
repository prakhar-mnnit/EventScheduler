package eventscheduler;
import java.net.*;
import java.io.*;

public class Event {
    private String name;
    private String startTime;
    private String endTime;
    private String date;
    private String venue;
    private String description;
    private int organizerId; 
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    
    public Event(Socket clientSocket) throws IOException {        
        this.clientSocket = clientSocket;
        out = new PrintWriter(this.clientSocket.getOutputStream(), true);
        in = new BufferedReader(
            new InputStreamReader(this.clientSocket.getInputStream()));
    }
    
    public void createEvent(String name, String startTime, String endTime
            , String date, String venue, int organizerId,
            String description) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.venue = venue;
        this.organizerId = organizerId;
        this.description = description;
        try{
            addEvent();
        }
        catch(Exception e){
            System.out.println("Error " + e);
        }
    }
    
    private void addEvent() throws IOException{
        String output = "";
        output += "addevent?name=" + name;
        output += "&organizerId=" + organizerId;
        output += "&venue=" + venue;
        output += "&description=" + description;
        output += "&startingTime=" + startTime;
        output += "&endingTime=" + endTime;
        out.println(output); 
        if("err".equals(in.readLine())){
           System.out.println("Error: Event not added");
        }
        else{
           System.out.println("Event added succsessfully.");
        }
     }
}
