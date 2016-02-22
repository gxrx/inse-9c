package evtest;

import java.util.Calendar;

public class Event {
    // Variable Declarations
    protected String name, notes;
    protected Calendar eStart, eEnd;
    protected Boolean isMilestone;
    protected int dependancy, duration;
    
    public Event(String na, int[] st, int[] en, String no, Boolean mile, int dep, int dur)
    {
        /*
            Lines 19 & 20: Instaniate Calendar objects
            Lines 21 & 22: Set the date of the Calendar objects
            Lines: 24 - 27: Set variable values from contructor arguments
        */
        eStart = Calendar.getInstance();
        eEnd = Calendar.getInstance();
        eStart.set(st[0], st[1], st[2]); 
        eEnd.set(en[0], en[1], en[2]);
        name = na;
        notes = no;
        isMilestone = mile;
        dependancy = dep;   
        duration = dur;
    }
    
    // Getters & Setters
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
    
    public int getEventDependancy()
    {
        return dependancy;
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
    
    public void setDependancy(int dep)
    {
        dependancy = dep;
    }          
}