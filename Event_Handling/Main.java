package evtest;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Event> data = new ArrayList();
        int[] p = {2000,3,4};
        int[] y = {4,5,5};
        data.add(new Event(1.0, 2.2,"Event 1", p, y, "Notes", true, 0, 1));
        data.add(new Event(2.0, 1.1,"Event 2", p, y, "More Notes", false, 1, 1));
        for(Event e : data)
        {
            System.out.println("Event Name: " + e.name + " Year: " + e.eStart.get(1) + " Month: " + e.eStart.get(2) + " Day: " + e.eStart.get(5));
        }
     /* Create a Project - Add Events - Print Event Data.
        System.out.println("TESTING PROJECT");
        Project project1 = new Project("project1", p ,y);
        Event event1 = new Event(1.0, "Event 1", p, y, "Notes", true, 0, 1);
        Event event2 = new Event(2.0, "Event 2", p, y, "More Notes", false, 1, 1);
        project1.addEvent(event1);
        project1.addEvent(event2);
        System.out.println(project1.getSize());
        project1.getEventList().stream().forEach((e) -> {
            System.out.println("ID:: " + e.id + "Event Name: " + e.name + " Year: " + e.eStart.get(1) + " Month: " + e.eStart.get(2) + " Day: " + e.eStart.get(5));
        }); 
        */
    }
    
    }
}
