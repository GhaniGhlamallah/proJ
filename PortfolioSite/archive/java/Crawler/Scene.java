import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.function.Function;

public class Scene{
	private Random random = new Random();
	private Scanner scanner = new Scanner(System.in);
	
    private List<Function<Integer, Integer>> allScenes = new ArrayList<>();

    public void addFunction(Function<Integer, Integer> function) {
        allScenes.add(function);
    }
	
	public void pause(int longueur){
		try{Thread.sleep(longueur);}catch (InterruptedException e) {};
	}

    public int getRandomFunctionResult(int input) {
        int index = random.nextInt(allScenes.size());
        Function<Integer, Integer> randomFunction = allScenes.get(index);
        return randomFunction.apply(input);
    }
	
	
	
	
		public Heros doublePorte(Heros heros){
		this.pause(3000);
	    System.out.println("\n\nIl y a deux portes en face de " + heros.getNom() + ".");
	    System.out.println("Quelque chose est gravé dans la pierre entre les deux portes : \"ATTENTION MONSTRE DANGEREUX\" et \"SALLE DU TRESOR\".");
	    System.out.println("Il semble que l'indication se soit effacée avec le temps, elle est maintenant incomplète et il est impossible de distinguer quelle information correspond à chaque salle.");
	    System.out.println("Entrez \"gauche\" pour prendre à gauche ou \"droite\" pour prendre à droite.");
	
	    while (true) {
	        String input = scanner.nextLine();
	        if (input.equals("droite") || input.equals("gauche")) {
	            int roll = random.nextInt(2);
	            if (roll == 1) {
	            }
	            else {
	            }
	        }
	    }
	}
	
	
}
	
	
	
	
	
