package week04.HighScores;
public class HighScores {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.setName("Hasti");
        player1.setScore(1020);

        Player player2 = new Player();
        player2.setName("Jonas");
        player2.setScore(610);

        Player player3 = new Player();
        player3.setName("Bogdan");
        player3.setScore(460);

        System.out.println("HIGHSCORES");
        System.out.println("----------");

        System.out.println(player1.getName() + " " + player1.getScore());
        System.out.println(player2.getName() + " " + player2.getScore());
        System.out.println(player3.getName() + " " + player3.getScore());





    }
}




