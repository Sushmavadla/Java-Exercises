package collections;
import java.util.*;
public class QueueLab {
public static void main(String[] args) {
	Queue<String> players = new LinkedList<>();
	players.offer("Soumya");
	players.offer("Soujanya");
	players.offer("Anu");
	players.offer("Rishi");
	players.offer("Neha");
	players.offer("Mounika");
	players.offer("Akshitha");
	players.offer("Akshay");
	players.offer("Viany");
	players.offer("Viashnavi");
	players.offer("Vainavi");
	players.offer("Sai Krishna");
	Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the number of passes before the music stops: ");
     int passes = scanner.nextInt();
     while(players.size()>1) {
    	 for(int i=0;i<passes;i++) {
    		 String player = players.poll();
             players.add(player);
         }
    	 String eliminatedPlayer = players.poll();
         System.out.println(eliminatedPlayer + " is out.");
    	 }
     String winner = players.poll();
     System.out.println("The winner is " + winner);
     
     }
}

