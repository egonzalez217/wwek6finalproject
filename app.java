package finalProject;

public class app 
{

	public static void main(String[] args) 
	{
		
//3
		
		Player player1 = new Player("Ash");
		Player player2 = new Player("Brock");
		Deck deck = new Deck();
		
		deck.shuffle();
		
//4		
		
		for(int i = 0; i < 52; i++)
		{
			if(i % 2 == 0)
			{
				player1.draw(deck);
			}
			else
			{
				player2.draw(deck);
			}
		}
		
//5
		
		for(int i = 0; i < 26 ; i++)
		{
			Cards player1Card = player1.flip();
			Cards player2Card = player2.flip();
			
			if(player1Card.getValue() > player2Card.getValue())
			{
				player1.incrementScore();
			}
			
			else if(player1Card.getValue() < player2Card.getValue())
			{
				player2.incrementScore();
			}
			else
			{
				player1.incrementScore();
				player2.incrementScore();
			}
		}
		
//6 + 7
		
		int player1Score = player1.getScore();
		int player2Score = player2.getScore();
		
		System.out.println("Player 1 Score: " + player1Score + "\nPlayer 2 Score: " + player2Score);
		
		if(player1Score == player2Score)
		{
			System.out.println("Player 1 and Player 2 came to a Draw.");
		}
		else if(player1Score > player2Score)
		{
			System.out.println("Player 1 Won.");
		}
		else
		{
			System.out.println("Player 2 Won.");
		}
		
		
		
		

	}

}
