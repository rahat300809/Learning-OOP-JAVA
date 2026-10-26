package q9;

public class Player {
    private String playerName;
    private int jerseyNumber;

    public Player(String playerName,int jerseyNumber)
    {
        this.playerName=playerName;
        this.jerseyNumber=jerseyNumber;
    }
    public void displayPlayer()
    {
        System.out.println("Player: "+playerName+"\njersy: "+jerseyNumber);
    }
}
