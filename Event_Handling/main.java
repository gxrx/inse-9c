
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<Event> data = new ArrayList();
        int[] p = {2000,3,4};
        int[] y = {4,5,5};
        data.add(new Event("Event 1", p, y, "Notes", true, 0, 1));
        data.add(new Event("Event 2", p, y, "More Notes", false, 1, 1));
        for(Event e : data)
        {
            System.out.println("Event Name: " + e.name + " Year: " + e.eStart.get(1) + " Month: " + e.eStart.get(2) + " Day: " + e.eStart.get(5));
        }
        
        
        Event event1 = new Event("Event 1", p, y, "Notes", true, 0, 1);
        Event event2 = new Event("Event 2", p, y, "More Notes", false, 1, 1);
        Project project1 = new Project("project1");
        project1.addEvent(event1);
        project1.addEvent(event2);
        System.out.println(project1.getSize());
        
        project1.getEventList().stream().forEach((e) -> {
            System.out.println("Event Name: " + e.name + " Year: " + e.eStart.get(1) + " Month: " + e.eStart.get(2) + " Day: " + e.eStart.get(5));
        });
        
    }
}
        
    


        
      
       
        
        
      

