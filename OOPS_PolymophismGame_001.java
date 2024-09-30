// OOPS - Polymorphism

interface GameConstants
{
	// Declare Variable inside Interface
	
	int MAX_PLAYERS = 8;
	int MIN_PLAYERS = 2;
}

class BoardGame implements GameConstants
{
	public void printPlayers()
	{
		System.out.println("Min Players: " + MIN_PLAYERS);
		System.out.println("Max Players: " + MAX_PLAYERS);
	}
}

//Main
class PolyGame
{
	public static void main(String args[])
	{
		BoardGame k = new BoardGame();
		k.printPlayers();
	}
}