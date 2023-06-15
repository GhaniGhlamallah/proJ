import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stuff {
	
	private String nom; //Le nom de l'objet
	private int slot; //L'emplacement dans lequel l'objet sera équipé. 1=arme,2=torse,3=pieds,4=tête
	private int HP; //HEALTH POINTS, donne le bonus de HP donnés par l'objet
	private int STR; //ATTAQUE, donne le bonus de puissance d'attaque donnés par l'objet
	private int SPD; //SPEED, donne le bonus en vitesse donné par l'objet.
	private int LUK; //LUK, le bonus en LUKuive donné par l'objet.
	private Random random = new Random();



	private static ArrayList<ArrayList<Object>> allItems = new ArrayList<>();
static {
	//On a ici une liste d'objets pré-définis et divisés en ArrayLists dans le but de former une table de butin.
	//Un objet est composée des mêmes éléments listés ci-dessus, dans le même ordre de citation.
	
    ArrayList<Object> Hallebarde = new ArrayList<>();
	Hallebarde.add("[Hallebarde]");
	Hallebarde.add(0);
    Hallebarde.add(0);
    Hallebarde.add(15);
    Hallebarde.add(0);
    Hallebarde.add(0);
	allItems.add(Hallebarde);
	
	ArrayList<Object> plastron = new ArrayList<>();
	plastron.add("[Plastron de Soldat]");
	plastron.add(1);
    plastron.add(0);
    plastron.add(25);
    plastron.add(0);
    plastron.add(0);
	allItems.add(plastron);
	
	ArrayList<Object> jambieres = new ArrayList<>();
	jambieres.add("[Jambières de Soldat]");
	jambieres.add(2);
    jambieres.add(0);
    jambieres.add(25);
    jambieres.add(0);
    jambieres.add(0);
	allItems.add(jambieres);
	
	ArrayList<Object> casque = new ArrayList<>();
	casque.add("[Casque Pointu de Soldat]");
	casque.add(3);
    casque.add(1);
    casque.add(25);
    casque.add(0);
    casque.add(0);
	allItems.add(casque);
	
	ArrayList<Object> Fouet = new ArrayList<>();
	Fouet.add("[Fouet en Cuir]");
	Fouet.add(0);
    Fouet.add(0);
    Fouet.add(15);
    Fouet.add(0);
    Fouet.add(0);
	allItems.add(Fouet);
	
	ArrayList<Object> arcLong = new ArrayList<>();
	arcLong.add("[Arc Long]");
	arcLong.add(0);
    arcLong.add(-20);
    arcLong.add(15);
    arcLong.add(0);
    arcLong.add(25);
	allItems.add(arcLong);
	
	ArrayList<Object> Bouclier = new ArrayList<>();
	Bouclier.add("[Grand Bouclier Rond]");
	Bouclier.add(0);
    Bouclier.add(30);
    Bouclier.add(5);
    Bouclier.add(0);
    Bouclier.add(0);
	allItems.add(Bouclier);
	
	ArrayList<Object> Sabre = new ArrayList<>();
	Sabre.add("[Sabre Très Affuté]");
	Sabre.add(0);
    Sabre.add(-15);
    Sabre.add(15);
    Sabre.add(0);
    Sabre.add(0);
	allItems.add(Sabre);
	
	ArrayList<Object> epeeChevalier = new ArrayList<>();
	epeeChevalier.add("[Epée de Chevalier en Argent]");
	epeeChevalier.add(0);
    epeeChevalier.add(40);
    epeeChevalier.add(0);
    epeeChevalier.add(0);
    epeeChevalier.add(0);
	allItems.add(epeeChevalier);
	
	ArrayList<Object> heaumeChevalier = new ArrayList<>();
	heaumeChevalier.add("[Heaume d'Armure de Chevalier]");
	heaumeChevalier.add(3);
    heaumeChevalier.add(100);
    heaumeChevalier.add(0);
    heaumeChevalier.add(0);
    heaumeChevalier.add(-25);
	allItems.add(heaumeChevalier);
	
	ArrayList<Object> armureChevalier = new ArrayList<>();
	armureChevalier.add("[Plastron d'Armure de Chevalier]");
	armureChevalier.add(1);
    armureChevalier.add(100);
    armureChevalier.add(0);
    armureChevalier.add(0);
    armureChevalier.add(-25);
	allItems.add(armureChevalier);
	
	ArrayList<Object> bottesChevalier = new ArrayList<>();
	bottesChevalier.add("[Jambières d'Armure de Chevalier]");
	bottesChevalier.add(2);
    bottesChevalier.add(100);
    bottesChevalier.add(0);
    bottesChevalier.add(0);
    bottesChevalier.add(-25);
	allItems.add(bottesChevalier);
	
	ArrayList<Object> Excalibur = new ArrayList<>();
	Excalibur.add("[Éxcalibur]");
	Excalibur.add(0);
    Excalibur.add(20);
    Excalibur.add(20);
    Excalibur.add(20);
    Excalibur.add(20);
	allItems.add(Excalibur);
	
	ArrayList<Object> megaHache = new ArrayList<>();
	megaHache.add("[Hache de 7 Tonnes]");
	megaHache.add(0);
    megaHache.add(30);
    megaHache.add(70);
    megaHache.add(-50);
    megaHache.add(-20);
	allItems.add(megaHache);
	
	ArrayList<Object> armureArtef = new ArrayList<>();
	armureArtef.add("[Plastron d'Armure Dorée]");
	armureArtef.add(1);
    armureArtef.add(150);
    armureArtef.add(0);
    armureArtef.add(0);
    armureArtef.add(-50);
	allItems.add(armureArtef);
	
	ArrayList<Object> masqueMaudit = new ArrayList<>();
	masqueMaudit.add("[Masque Maudit]");
	masqueMaudit.add(3);
    masqueMaudit.add(-10000);
    masqueMaudit.add(0);
    masqueMaudit.add(0);
    masqueMaudit.add(95);
	allItems.add(masqueMaudit);
	
	ArrayList<Object> bottesVitesse = new ArrayList<>();
	bottesVitesse.add("[Bottes de Sept Lieues]");
	bottesVitesse.add(2);
    bottesVitesse.add(0);
    bottesVitesse.add(0);
    bottesVitesse.add(20);
    bottesVitesse.add(0);
	allItems.add(bottesVitesse);
	}
	
	
	
	public Stuff (){
		//Ce constructeur créera un stuff aléatoire selon la progression actuelle de la partie.
		//On selectionne d'abord un set de stats aléatoriement dans la liste des items ci-dessus
        ArrayList<Object> selection = allItems.get(random.nextInt(allItems.size()));
		//construit un nouveau Stuff avec
		this.nom=(String)selection.get(0);
		this.slot=(int)selection.get(1);
		this.HP=(int)selection.get(2);		
		this.STR=(int)selection.get(3);
		this.SPD=(int)selection.get(4);
		this.LUK=(int)selection.get(5);
	}
	
	
	
	public Stuff(String nom, int slot, int HP, int STR, int SPD, int LUK){
		this.nom=nom;
		this.slot=slot;
		this.HP=HP;
		this.STR=STR;
		this.SPD=SPD;
		this.LUK=LUK;
	}
	

	public int getPrix(){
		int prix = (this.HP + this.STR + this.SPD + this.LUK);
		if (prix <0){prix=0;};
		return prix; 
	}
	
	
	
	public String getNom(){
		return this.nom;
	}
	
	public int getSlot(){
		return this.slot;
	}

	public int getHP(){
		return this.HP;
	} 
	
	public int getSTR(){
		return this.STR;
	} 
	
	public int getSPD(){
		return this.SPD;
	}
	
	public int getLUK(){
		return this.LUK;
	} 
	
	public void setNom(String nom){
		this.nom=nom;
	}
	
	public void setslot(int slot){
		this.slot=slot;
	}
	
	public void setHP(int HP){
		this.HP=HP;
	}
	
	public void setSTR(int STR){
		this.STR=STR;
	}
	
	public void setSPD(int SPD){
		this.SPD=SPD;
	}
	
	public void setLUK(int LUK){
		this.LUK=LUK;
	}

	public String toString(){
		int slot=this.getSlot();
		String traduction="";
		if (slot==0){
			traduction="Arme";}
		else if (slot==1){
			traduction="Torse";}
		else if (slot==2){
			traduction="Pieds";}
		else if (slot==3){
			traduction="Tête";}
		return((this.getNom() + "\n " + traduction+": HP= "+ this.getHP()+ " STR= "+ this.getSTR()+ " SPD= "+ this.getSPD()+ " LUK= "+ this.getLUK()));
	}
		
}
