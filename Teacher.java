import java.util.*;

public class Teacher extends Creature{
    Course course;
    String question;   //should contain the options.
    String correctAnswer;    //should have a test if this answer is an option
    
    Random rand = new Random();
    Scanner user_input = new Scanner(System.in);
    
    public Teacher(String name, String desc, Course course, String question, String correctAnswer)
    {
	super(name, desc);
	this.course = course;
	this.question = question;
	this.correctAnswer = correctAnswer;
    }
    
    public void Interact(Player player)
    {
	if(player.HasFinishedCourse(course))
	    {	
		if (rand.nextInt(1) == 0)
		    {
			System.out.println("Well hello there ;). Do you still know your stuff?\nHere is a question for you: " + question);
			if (user_input.next() == correctAnswer)
			    {
				System.out.println("Correct answer. Your good to go.");
			    }
			else
			    {
				System.out.println("Wrong answer. Now I'll have to fail you.\n-" + course.GetHP() + "HP");
			    }
		    }
	    }
	else if (player.HasEnrolledCourse(course)) // this is if the player has this course unfinfished
	    {
		if (rand.nextInt(3) == 0) //1/4 for this to happen. And this is when you dont get any question
		    {
			System.out.println("Im busy. Get outof here!");
		    }
		else
		    {
			System.out.println("Here is a question for you: " + question);
			if (user_input.next() == correctAnswer)
			    {
				System.out.println("Correct answer! Good job!\n+" + course.GetHP() + "HP");
				player.FinishCourse(course);
			    }
		    }
	    }
    }
}
