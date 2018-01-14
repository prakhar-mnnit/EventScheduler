package eventscheduler;

public class Admin extends Client {

    public Admin(String username, String password, String serverHostName, int portNum) {
        super(username, password, serverHostName, portNum);
    }
    
    public boolean addClient(){
        return true;
    }
    
    public boolean addVenue(){
        return true;
    }
    
    public boolean addSlot(){
        return true;
    }
    
}
