//lesson on accumulation and increment and decrement


class ScoreBoard {
    String gamename = "gacha life fortnite";
    int playerxp = 0;
    int playerlevel = 0;

    void gainxp(int amount) {
        playerxp+=amount;
    }

    void heal() {
        playerxp+=50;
    }

    void damage() {
        playerxp-=10;
    }

    void levelup() {
        playerlevel++;
    }

    void leveldown() {
        playerlevel--;
    }

    void attacked() {
        playerxp-=400;
    }

    void dmg() {
        playerlevel++;
    }

    void name() {
        System.out.println(gamename);
    }
}



public class Math2 {
    public static void main(String[] args) {
    ScoreBoard p1 = new ScoreBoard();
    ScoreBoard p2 = new ScoreBoard();
    p1.gainxp(1);
    p1.gainxp(2);
    p1.heal();
    p1.damage();
    p2.gainxp(2);
    p2.gainxp(400);
    p1.name();

    System.out.println("Player 1 XP: " + p1.playerxp);
    System.out.println("Player 2 XP: " + p2.playerxp);
        
    }
}
