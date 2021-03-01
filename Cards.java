package finalProject;

public class Cards 
{
	private int value = 0;
	private String name = "";
	
	public Cards()
	{
		name = "";
		value = 0;
	}
	
	public Cards(int value, String name)
	{
		this.name = name;
		this.value = value;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String s)
	{
		this.name = s; 
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setValue(int i)
	{
		this.value = i;
	}
	
	public void describe()
	{
		System.out.println("Card: " + name + " ( " + name + ")");
	}
}
