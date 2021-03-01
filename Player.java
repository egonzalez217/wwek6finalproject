package finalProject;
import java.util.*;

public class Player 
{

	private static List<Cards> hand;
	private String name;
	private int score;

	public Player(String name)
	{
		this.name = name;
		this.hand = new ArrayList<Cards>();
		this.score = 0;
	}
	
	public static Cards flip()
	{
		return hand.remove(0);
	}
	
	public void describe()
	{
		System.out.println("Player Name: " + this.name);
		
		for(Cards card : hand)
		{
			card.describe();
		}
	}
	
	public void draw(Deck deck)
	{
		Cards cards = Deck.draw();
		hand.add(cards);
	}
	
	public void incrementScore()
	{
		score += 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
