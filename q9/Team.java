package q9;
import java.util.ArrayList;
public class Team {
    private String teamName;
    private ArrayList<Player> players = new ArrayList<>();

    public Team(String teamName)
    {
        this.teamName=teamName;
    }
    public void addPlayer(Player p)
    {
        players.add(p);
    }
    public void displayTeam()
    {
        System.out.println("Team Name: "+teamName);
        for(Player p:players)
        {
            p.displayPlayer();
        }
    }


}
