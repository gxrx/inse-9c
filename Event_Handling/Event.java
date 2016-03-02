import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Event {
    // Variable Declarations
    private double id;
    private String name, notes;
    protected Calendar eStart, eEnd;
    private Boolean isMilestone;
    private int duration;
    List<Double> dependancy = new ArrayList<Double>();
    public Event(double i, String na, int[] st, int[] en, String no, Boolean mile,int dur)
    {
        /*
            Instaniate Calendar objects
            Set the date of the Calendar objects
            Set variable values from contructor arguments
        */
        id = i;
        eStart = Calendar.getInstance();
        eEnd = Calendar.getInstance();
        eStart.set(st[0], st[1], st[2]); 
        eEnd.set(en[0], en[1], en[2]);
        name = na;
        notes = no;
        isMilestone = mile;   
        duration = dur;
    }
    
    // Getters & Setters
    public double getID()
    {
        return id;
    }
    
    public String getEventName()
    {
        return name;
    }
    
    public String getEventNotes()
    {
        return notes;
    }
    
    public String getEventStart()
    {
        return eStart.get(1) + " " + eStart.get(2) + " " + eStart.get(5);
    }
    
    public String getEventEnd()
    {
        return eEnd.get(1) + " " + eEnd.get(2) + " " + eEnd.get(5);
    }
    
    public Boolean isEventMilestone()
    {
        return isMilestone;         
    }
    
    //print all of the dependanies. change to return actuall stuff later.
    public void getEventDependancy()
    {
       for (Double d : dependancy)
       {
           System.out.println(d);
       }
    }

    public int getDuration() {
        return duration;
    }

    public void setID(double i)
    {
        id = i;
    }
    
    public void setEventName(String na)
    {
        name = na;
    }
    
    public void setEventNotes(String no)
    {
        notes = no;
    }
    
    public void setEventStart(int[] date)
    {
        eStart.set(date[0], date[1], date[2]);
    }
    
    public void setEventEnd(int[] date)
    {
        eEnd.set(date[0], date[1], date[2]);
    }
    
    public void setEventMilestone(Boolean mile)
    {
        isMilestone = mile;
    }
    
    public void setDependancy(double dep)
    {
        dependancy.add(dep);
    }  
    
    public void setDuration(int dur)
    {
        duration = dur;
    }
    
    
    
}
