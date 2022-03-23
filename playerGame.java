import java.util.Scanner;

public class playerGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player p1 = new Player("User");
		Player p2 = new Player("CPU");
		
		do {
			
			System.out.println("Enter your move: rock, paper, scisscors");
			p1.setPlayerMove(sc.next());
			
			int rand = (int)(Math.random() * 3); // 0 1 2
			if (rand == 0) {
				p2.setPlayerMove("rock");
			} else if (rand == 1) {
				p2.setPlayerMove("paper");
			} else {
				p2.setPlayerMove("scisscors");
			}
			
			System.out.println(p1.getPlayerMove() + " Vs " + p2.getPlayerMove());
			
			if(p1.getPlayerMove().equals("Rock") && p2.getPlayerMove().equals("scissors")
					|| p1.getPlayerMove().equals("Paper") && p2.getPlayerMove().equals("rock")
					|| p1.getPlayerMove().equals("scissors") && p2.getPlayerMove().equals("Paper")) {
				System.out.println("You win!");
				p1.setScore(p1.getScore()+1);
			}else if (p1.getPlayerMove().equals(p2.getPlayerMove())){
				System.out.println("It is a tie!");
			}else {
				System.out.println("CPU wins!");
				p2.setScore(p2.getScore()+1);
			}
			
		} while(p1.getScore() < 3 && p2.getScore() < 3);
		
		System.out.println("The winner is: " + (p1.getScore() == 3 ? p1.getName() : p2.getName()));

	}

}
