// OOPS - Polymorphism

interface GameConstants
{
	// Change Variable inside Interface
	
	int MAX_PLAYERS = 8;
	int MIN_PLAYERS = 2;
}

class BoardGame implements GameConstants
{
	public void printPlayers()
	{
		MIN_PLAYERS = (MIN_PLAYERS + 10);
		MAX_PLAYERS = (MAX_PLAYERS + 10);
		
		System.out.println("Min Players: " + MIN_PLAYERS);
		System.out.println("Max Players: " + MAX_PLAYERS);
	}
}

//Main
class PolyGame2
{
	public static void main(String args[])
	{
		BoardGame k = new BoardGame();
		k.printPlayers();
	}
}