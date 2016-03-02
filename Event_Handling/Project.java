import java.util.ArrayList;
import java.util.Calendar;

public class Project {

    // Variabe Declarations
    protected String name;
    protected Calendar eStart, eEnd;
    protected ArrayList<Event> eventList = new ArrayList<>();

    //constructor
    public Project(String na, int[] st, int[] en) {
        eStart = Calendar.getInstance();
        eEnd = Calendar.getInstance();
        eStart.set(st[0], st[1], st[2]); 
        eEnd.set(en[0], en[1], en[2]);
        name = na;

    }

// Class Methods   
    public void addEvent(Event event) {
        eventList.add(event);
    }

    public Event returnEvent(int n) {
        return eventList.get(n);
    }

    public void removeEvent(int n) {
        eventList.remove(n);
    }

    public int getSize() {
        return eventList.size();
    }
    
    public ArrayList<Event> getEventList()
    {
        return eventList;
    }
    
     public void addEvent(){
        checkDuplicate(double inputID);
        //add the event
    }
    
    //checks for a duplcate Event ID. returns false if there is. 
    public boolean checkDuplicate(double inputID){
        for(Event e: eventList)
        {
            if (inputID = e.getID())
            {
            return false;
            }
        }
            return true;
        }
        
        
        
        
    }
    
    
    
    

}
