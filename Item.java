import java.util.*;

public class Item { // skulle kunna ha en desc också.
    int volume;
    String name;

    public Item()
    {
	System.out.println("ERROR, THIS SHOULD NOT HAPPEN! EMPTY ITEM CONSTRUCTOR USED.");
    }
    
    public Item(int volume, String name)	
    {
	this.volume = volume;
	this.name = name;
    }
    
    public int GetVolume()
    {
	return volume;
    }
}
