public class Sfinx extends Creature{
    String wiseTalk;
    
    public Sfinx(String name, String desc, String wiseTalk)
    {
	super(name, desc);
	this.wiseTalk = wiseTalk;
    }
    
    public void Interact(Player player, String command)
    {
	if (command == "graduate")
	    {
		if (player.GetHP() >= 180)
		    {
			System.out.println("GAME OVER! Finished courses: ");
			for (Course course : player.GetFinishedCourses())
			    {
				System.out.println("\n" + course.GetName() + ", HP: " + course.GetHP());
				System.exit(0);	//0 for normal exit	
			    }
		    }
	    }
	else if (command == "talk")
	    {
		System.out.println(wiseTalk);
	    }
    }
}
