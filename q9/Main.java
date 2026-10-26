package q9;

public class Main {

    public static void main(String[] args) {
        Player p1=new Player("Rahat",10);
        Player p2=new Player("Mahamud",11);

        Team t=new Team("Innosphere");
        t.addPlayer(p1);
        t.addPlayer(p2);
        t.displayTeam();
    }
    
}
