import java.util.*;

public class Player extends Creature{
    int HP; //this is a number between 0-180 and should start at 60     Why?
    List<Course> unfinishedCourses; //empty from start
    List<Item> backpack;
    int backpackLimit = 10;
    List<Course> finishedCourses; // 6 courses from start
    
    
    public Player(String name, String desc, List<Course> finishedCourses)
    {
	super(name, desc);
	for (Course course : finishedCourses)
	    {
		this.HP += course.GetHP();
	    }//HP should be 60 after this?
	unfinishedCourses = new ArrayList<Course>(); // empty list
	this.finishedCourses = finishedCourses;
    }

    public List<Course> GetFinishedCourses()
    {
	return finishedCourses;
    }
    
    public boolean HasEnrolledCourse(Course course)
    {
	for (Course c : unfinishedCourses)
	    {
		if (c.equals(course))
		    {
			return true;
		    }
	    }
	return false;
    }
    
    public boolean HasFinishedCourse(Course course)
    {
	for (Course c : finishedCourses)
	    {
		if (c.equals(course))
		    {
			return true;
		    }
	    }
	return false;
    }
    
    public int GetBackpackSpace()
    {
	int i = 0;
	for (Item item : backpack)
	    {
		i += item.GetVolume();
	    }
	
	return (backpackLimit - i);
    }
    
    public int GetHP()
    {
	return HP;
    }
    
    public void FinishCourse(Course course)
    {
	HP += course.GetHP();
	finishedCourses.add(course);
	unfinishedCourses.remove(course);
    }
    
    public void FailCourse(Course course)
    {
	HP -= course.GetHP();
	finishedCourses.remove(course);
	unfinishedCourses.add(course);
    }
}
