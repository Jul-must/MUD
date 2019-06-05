public class Student extends Creature{
    private Course finishedCourse;
    private Course unfinishedCourse;
    private Book book;
    
    
    public Student(String name, String desc, Course finished, Course unfinished, Book book)
    {
	super(name, desc);
	this.finishedCourse = finished;
	this.unfinishedCourse = unfinished;
	this.book = book;
    }
    
    public Course GetFinishedCourse()
    {
	return finishedCourse;
    }
    
    public Course GetUnfinishedCourse()
    {
	return unfinishedCourse;
    }
    
    public Book GetBook()
    {
	return book;
    }
}

