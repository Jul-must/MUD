public class Course{
    
    int HP;
    String bookName; 
    String name;

    public Course(int HP, String bookName, String name)
    {
	this.HP = HP;
	this.bookName = bookName;
	this.name = name;
    }
    
    public int GetHP()
    {
	return this.HP;
    }
    
    public String GetName()
    {
	return name;
    }
}
