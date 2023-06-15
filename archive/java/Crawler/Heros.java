import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Heros extends Creature {
	

	private static ArrayList<Stuff> Equipement = new ArrayList<>();
	private Random random = new Random();
	private Scanner scanner = new Scanner(System.in);
	
	
	private int lvl;
	private int gold;
	
	
	
	
	public Heros(){
		//Le joueur donne un nom au Héros	
		System.out.print("Entrez le nom du héros : ");		
		String nom=scanner.nextLine();
		if (nom.equals("")) {nom="Sans-Nom";}					
		else{nom = nom.substring(0,1).toUpperCase() + nom.substring(1);};		
	
		//Contruction du Héros selon la forme de la classe mère Creature
		this.setportrait("");
		this.setnom(nom);												
		this.setHP(random.nextInt(100) + 100);
		this.setSTR(random.nextInt(100) + 5);
		this.setSPD(random.nextInt(10) + 5);
		this.setLUK(random.nextInt(10) + 5);
	
		//Construction du tableau de Stuff équipé par défaut, qui est propre à la classe héros
		Equipement.add(new Stuff("[Vieille Épée Rouillée]",0,0,5,0,0));
		Equipement.add(new Stuff("[Tunique de Paysan]",1,0,0,0,2));
		Equipement.add(new Stuff("[Bottes de Paysan]",2,0,0,0,2));
		Equipement.add(new Stuff("[Chapeau de Paysan]",3,0,0,0,2));
		
		this.setLvl(1);
		this.setGold(0);
	
		System.out.println(this.toString());
		}	
	
	
	
	public void equip(Stuff newstuff){
		
		if(newstuff.getNom()=="Rien"){
			//cette vérification permet de gérer les cas dans lesquels le joueur choisit de ne pas récuperer d'objet dans un coffre au trésor,
			//dans la fonction loot() dans la classe Game.java . 
			return;
		}
		
		System.out.println("\n"+this.getNom()+ " se débarasse de " + Equipement.get(newstuff.getSlot()).getNom() + " et s'équipe de " + newstuff.getNom()+ ".");
	
		//on soustrait les valeurs de l'ancien equipement au stats du héros
		int oldHPBonus = Equipement.get(newstuff.getSlot()).getHP();
		int oldSTRBonus= Equipement.get(newstuff.getSlot()).getSTR();
		int oldSPDBonus = Equipement.get(newstuff.getSlot()).getSPD();
		int oldLUKBonus= Equipement.get(newstuff.getSlot()).getLUK();
		this.setHP(this.getHP() - oldHPBonus);
		this.setSTR(this.getSTR() - oldSTRBonus);
		this.setSPD(this.getSPD() - oldSPDBonus);
		this.setLUK(this.getLUK() - oldLUKBonus);
		
		//puis on ajoute celles du nouveau
		this.setHP(this.getHP() + newstuff.getHP());
		this.setSTR(this.getSTR() + newstuff.getSTR());
		this.setSPD(this.getSPD() + newstuff.getSPD());
		this.setLUK(this.getLUK() + newstuff.getLUK());
	
		//et enfin on ajoute le nouvel Objet newstuff au tableau des stuffs du héros dans le slot correspondant
		Equipement.set(newstuff.getSlot(), newstuff);
		System.out.println(this.toString());
	
		//Parfois certains objets diminuent les HP du joueur. On l'empêche de mourrir si sa vie est trop basse quand il change d'equipement. 
		if (this.getHP()<=0){
			this.setHP(1);
		}
		//On supprime la possibilité d'avoir un Héros immortel avec une chance d'esquiver a 100%
		if (this.getLUK()>95){
			this.setLUK(95);
		}
		//Toujours dans la même idée, on empêche la variable SPD d'arriver en négatif et d'empêcher le héros de jouer.
		if (this.getSPD()<1){
			this.setLUK(1);
		}
		
	}
	
	public void setLvl(int lvl){
		this.lvl = lvl;
	}
	
	public void setGold(int gold){
		this.gold = gold;
	}
	
	public int getLvl(){
		return this.lvl;
	}
	
	public int getGold(){
		return this.gold;
	}
	
	public String toString() {
		return ("\n\n" +"\n---------------------------------\n 	HÉROS : \n---------------------------------\n" + "LVL "+this.getLvl() + "	"+ this.getHP() +"HP|" + this.getNom() +	"	   " + this.getGold()+ "or"+ "\n  STR = " + this.getSTR() + " SPD = " + this.getSPD() + " LUK = " + this.getLUK() +"\n---------------------------------\n 	ÉQUIPEMENT : \n--------------------------------- \n	" + Equipement.get(0).toString()+ "\n	" + Equipement.get(3).toString()+ "\n	" + Equipement.get(1).toString()+ "\n	" + Equipement.get(2).toString()+"\n\n\n\n\n");
	}

}
