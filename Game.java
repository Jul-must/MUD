import java.util.*;

public class Game{
    List<Room> rooms;
    Room currRoom;
    Player player;

    public Game()
    {
	List<Course> finishedCourses = new ArrayList<Course>(); // ska fyllas med courses.
	player = new Player("StudentName", "A young and brave student", finishedCourses);
    }
      
    public static void main(String[] args) throws InterruptedException
    {
        
    }
    
}
