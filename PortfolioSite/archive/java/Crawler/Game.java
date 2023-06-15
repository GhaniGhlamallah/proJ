import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class Game {

	private Random random = new Random();
	private Scanner scanner = new Scanner(System.in);
	private int challenge = 0; //cette variable définit la difficulté du jeu. elle incrémente à chaque salle visitée.
	
	public void Game(){
	}
	
	public void mainMenu(){
		//AVERTISSEMENT
		System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!\n	ATTENTION\n!!!!!!!!!!!!!!!!!!!!!!!!\nCE PROGRAMME DOIT ÊTRE EXECUTE DANS UN TERMINAL EN MODE PLEIN ECRAN. ");
		System.out.println("appuyez la touche \"F11\" puis entrez \"ok\"");
		while(!((scanner.nextLine().toUpperCase().equals("OK")))){};
		//Le menu affiché au lancement du jeu .
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\n						                                                                                                    \n						      .~~^^^^^^:                                ^.    ^^^.                         ::               \n						     ......:~:.                                :J!  ..::^~:                       .^:               \n						           :!                                    !~       !^                                        \n						           .!     .:::~:  .7: .^!~.    .:^^~     .7:      :!   .:^:~.  .7!..:~!:  .7~    .:^^~      \n						           .!   :!    7.   .?^   .~! ^.   .!      :!.     .. ^^    !.    !.   :~   ^~  ~:   .7      \n						    !^     .^   !^    ~.    .~.    ~:^    .~       :~.       !:    ~.    ^.   :~   ^^  ?.   .~      \n						    .:.         .~.   ^.     .~.     :^   .^        :^. .    .^.   ~.    ^.   .^   :^  .^.  .^      \n						      .::.        .:.  .       .       ... ..        ..        .:. ..    ..    .   ..    ... ..      ");
		System.out.println("\n					 						par Abdel-Ghani Ghlamallah, 2023\n\n\n");
		
		System.out.println("					Entrez \"start\" pour lancer une partie				Entrez \"info\" pour avoir des informations supplémentaires ce programme.");
		while(true) {
			String input = scanner.nextLine();
			if (input.toUpperCase().equals("START")){
				return;
			}
			if (input.toUpperCase().equals("INFO")){
				this.notice();
			}
		}
	}
	
	
	
	public void notice(){
		System.out.println("\n\n\n\n\n");
		System.out.println("\n						                                                                           \n						                                                                           \n						      ^5!     7J^     .^!~!!.      .!?77!~       .~YY?J!!.     .!?7~.      \n						     ..!J:  ..:77.  .J:    ..    ::    .!!     .:.....:~^    :.  ..77      \n						       :?:     ~!    ?Y7~...    !J      ?~    ^5.     ^?^  .YY   .         \n						       ^?.     ~!     .^!!77~~..?!      7~    7?.     .7:   J?. ..         \n						       :7.     ~~   .:      .!~ :7:     7^    :7^     .!.   .77.           \n						       .7:     ^~. .!!.          :~:. . ~^. .  .^^.. ..~:    .~^.   ..     \n						        .::..   ::.   :^^~^.       .^:.  ..      .::. .^.      .^:.        \n						                                                       :.                  \n						                                              .!.                          \n						                                              .:^~^^.                      \n						                                                  ..                       \n						                                                                           \n						                                                                            ");
		System.out.println("Ce jeu a pour inspiration les jeux-vidéo RPG dits textuels qui étaient communs dans les années 80 et qui se jouaient uniquement via terminal.");
		System.out.println("Le but du jeu est de vaincre le Comte Dracula. Le héros combat l'ennemi automatiquement et le rôle du joueur est de guider ce dernier dans les couloirs sinueux du château maudit.");
		System.out.println("Les intéractions se font exclusivement par texte et uniquement lorsque le jeu demande une entrée utilisateur.");
		System.out.println("Notez aussi que ces statistiques influent également sur l'issue possible des différentes épreuves et rencontres que le château réserve au héros.");
		System.out.println("Le jeu est pensé pour être le plus minimaliste possible. Il a été conçu sur Linux Ubuntu et est optimisé pour l'usage sur un écran en ratio 16:9.");
		System.out.println("Les joueurs sous Windows et quelques rares distributions Linux feront l'éxperience de bugs graphiques dus à une différence de fonctionnement du terminal.");
		System.out.println("Le jeu doit être joué sur un terminal en plein écran. (Touche F11)");
		System.out.println("Entrez \"next\"");
		while(!((scanner.nextLine().toUpperCase().equals("NEXT")))){};
		System.out.println("\n						                                                                           \n						                                                                           \n						                                                 ..                        \n						                                               .?BPJ!.                     \n						            .                                .^^^^~7!~                     \n						          ^Y5^.                           .~Y!.    ..                      \n						        .:^~:::                           .YP~                             \n						                                           ~?:                             \n						                                           ^7^                             \n						           ^7.     :!:      ^7!:.       .:.~J7!~^:..     .~^^^.            \n						        .^?J7^    :!J7^^ .^^^!!7?!:  .::^!!!???!:.     ::^~!^7??:          \n						       ....~7^  .    ^7?~.     .!!?..:.     ::       ^:       .~7~^        \n						           ~J^       .?^        ^Y!.       .J~.    .~?.         :!?^       \n						           ~7:       .~^.       ~Y^        .J~.    .~?           .?!.      \n						           !7:       .7^.       ^J^        .?~.     ~J:           ^!       \n						           ~!:       .!:        ^7^        .7:.     .J~.          ..       \n						           ~!.       .!^.       ^?:        .?:.      :!^:       ..         \n						           :!:  .    .!:. .     .!:.       .7:.       .:^:.....::          \n						            ..        .          ..         ^.           .^!~^.            \n						                                            :.                             \n						                                           .                               \n						                                   :.     .                                \n						                                  :!7^:..                                  \n						                                 .   ..                                    \n						                                                                           \n						                                                                           \n						                                                                            ");
		System.out.println("JavaVania est un jeu vidéo crée par son auteur dans un but de l'étude du langage Java."); 
		System.out.println("Ceci n'est PAS un projet étudiant ou professionnel mais plutôt un projet personnel."); 
		System.out.println("Le titre JavaVania est une réference au classique du jeu-vidéo \"Castlevania\" mais c'est également un jeu de mot puisque le programme est \"Vanilla\", c'est à dire qu'il utilise exclusivement Java et ses bibliothèques par défaut.");
		System.out.println("Il est important de comprendre que le jeu utilise un système de génération procédurale du plateau de jeu.");
		System.out.println("Les rencontres, le butin et les obstacles auxquels le joueur sera confronté seront donc différents d'une partie à une autre.");
		System.out.println("Tous les graphismes utilisés dans ce projet ont été générés par l'IA (en local) puis transformés en ASCII (en ligne).");
		System.out.println("\n\n\n					Entrez \"start\" pour lancer une partie				Entrez \"info\" pour avoir des informations supplémentaires sur le programme JavaVania.");
	}
		
		
		
	public boolean startCombat(Heros joueur,Creature ennemi){
		this.pause(3000);
		System.out.println(ennemi.getportrait());
		System.out.println("\n\n"+joueur.getHP() + "HP|" + joueur.getNom()+ " rencontre un " + ennemi.getHP() + "HP|" + ennemi.getNom() + " !");
		int tourJoueur = 0;
		int tourEnnemi = 0;
		
		while(true){
			//On incrémente les tours simultanément après avoir attendu
			this.pause(1000);
			tourJoueur+=joueur.getSPD();
			tourEnnemi+=ennemi.getSPD();


			//l'acteur attaque quand sa variable tour arrive au dessus de 100 puis elle retourne a 0;
			if(tourJoueur>100)
			{
				this.attack(joueur,ennemi);
				if (ennemi.getHP()<1){
					System.out.println(ennemi.getNom()+ " s'éffondre ! \n\n");
					System.out.println(joueur.getNom()+ " a vaincu "+ennemi.getNom()+ " ! \n\n");
					return true;
					}
				tourJoueur=0;
			};

			if(tourEnnemi>100){
				this.attack(ennemi,joueur);
				if (joueur.getHP()<1){
					System.out.println(joueur.getNom()+ " s'éffondre ! \n\n");
					System.out.println(ennemi.getNom()+ " a vaincu "+joueur.getNom()+ " ! \n\n");
					return false;
				}	
				tourEnnemi=0;			
			};
		}
	}




	public void attack(Creature agresseur,Creature victime){
		int roll=random.nextInt(100);
		System.out.println(agresseur.getHP() + "HP|"+ agresseur.getNom() + " attaque " + victime.getHP() + "HP|"+ victime.getNom() + " !");
		
		if (roll< victime.getLUK()){	
					System.out.println(victime.getHP() + "HP|" + victime.getNom() + " esquive habilement l'assaut de son adversaire !");
					return;
		}
		
		if (roll>100-agresseur.getLUK()/2){
			victime.setHP(victime.getHP()-agresseur.getSTR()*2);
			System.out.println("	!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("	!!! COUP CRITIQUE !!!");
			System.out.println("	!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(victime.getHP() + "HP|" + victime.getNom() + " est blessé et a perdu "+ agresseur.getSTR()*2 + "HP");	
			return;
		}
		
		else{
					victime.setHP(victime.getHP()-agresseur.getSTR());
					System.out.println(victime.getHP() + "HP|" + victime.getNom() + " est blessé et a perdu "+ agresseur.getSTR() + "HP");
		}
		
	}
	
	
	
	
	public Stuff startLoot(Heros heros){
		this.pause(3000);
		System.out.print("\nJJJJYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYJJYJJJJJJJJYYJYYYYYYYYYYYYYYYYYYYYYYYYYY \nJJJJYYYYYYYYYYYYYYYYYYYJJYYYYJYYYJJYYY5555GGP5?JYJJYYYYYYYYYYYYYYYYYYYYYYYY \nJJYYYYYYYYJYJJJJJJJJJJYY5??7~:...:YP?7J^::^^.. ?PJJYYYYYYYYYYYYYYYYYYYYYYYY \nYJJYYJJJJYYYYYY5P555GPJYG5P!~#:77~~:..:!J55B#! !PJJYYYYYYYYYYYYYYYYYYYYYYYY \nYJJJJJJYGJJ??~^~~.......:^^GBP#B#@@@@@@@@@@@@J ~PJJYYYYYYYYYYYYYYYYYYYYYYYY \nJJJJJYB#B. .?5555B###&@@@@@@@@@@@@@@@@@@@@@@@Y .GJJYYYYYYYYYYYYYYYYYYYYYYYY \nJJJJG&@&G. J@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B .GJJYYYYYYYYYYYYYYYYYYYYYYYY \nJJJB@@@&G. ?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B .BJJYYYYYYYYYYYYYYYYYYYYYYYY \nJJJ&@@@&G. ?@@@@@@@@@#5YJB@@@@@@@@@@@@@@@@@@@B .#JJJYYYYYYYYYYYYYYYYYYYYYYY \nJJ5&@@@@G. 7G77!~~....   :!~5@@@@@@@@@@@@@@@@#  GYJJYYYYYYYYYYYYYYYYYYYYYYY \nJJYG@@@#G! .~    .........  :JP&@@@@@@@@@@@@@@: JPJJYYYYYYYYYYYYYYYYYYYYYYY \nJJJJ&@@GG? .Y ...............  .#@@@@@@@@@@@@@^ 7PJJYYYYYYYYYYYYYYYYYYYYYYY \nYJJJ#@@BG5  ?.................. P@@@@@@@@@@@@@^ ?PJJYYYYYYYYYYYYYYYYYYYYYYY \nJJJJ&@@#PP. 7....................~G@@@@@@@@@@&: 7PYYYYYYYYYYYYYYYYYYYYYYYYY \nJJJJ5@@&PG~ ^?.................^~~7YB##GJ~~~^:.  .:~!?JYYYYYYYYYYYYYYYYYYYY \nJJJJJ&@@GG7 .!......::^~!7?7!~~!~^^^^^::^^:::^J5#B57^:..:^!?JYYYYYYYYYYYYYY \nJJJJJ#@@&PY  !7?5PPY?7!~^^...::::::::^^::^~~::#@@@@@@@&B57^:..:~7?YYYYYYYYY \nJJJJJJG@@G5. ?GPYJ~..::::^^^:^^:^^^:::....&&..:P@@B#@@@@@@@@&#PJ~:.:~?YYYYY \nJJJJJJ5&@&#: ..::::^^^^^^:::..:PB~ .^@&5 .P#~:?5@B:5@@YJ&@&&#GPY!^.  7YJYYY \nJJJJJJJJ5PP?~:  ........!BG.. .&@J .^&@@P^.:J#?:?&&&BGJ7!~::::::::5  GYJYYY \nYJYYYJJYJJJJG#YJ~:.     Y@@::G5:&@#^ :JGB@&~.#&5 ...:::^:::..   .:G~?#JJYYY \nYJYYYYYYYJJJG#PGGGG5J!:..^7?P@@~?@@B~.YP!J7...:.^G#J!~.  ..^!YG#&&@B5#JJJYY \nJJYYYYYYYJJJG@@&&BBGGGGG5?~:..^!~GG5!..:::::^:..:@@!77J5#&&#BPY!:.5  GJJYYY \nJJJYYYYYJJJJP@@@@@@@&&BGGGGGG5?~.  ::::....   .:7@@?J?B57:..     .5  BJJYYY \nJJJJYJJJJJJJP@@@@@@@@@@@@&#BGGGBJ  ^   ..:!YG#&#B@@57!    ...... .5  BJJYYY \nJJJJJJYYY5PG&@@@@@@@@@@@@@@@@@&#5  J5P#&##GY7~:..J~:..............5  BJJYYY \nYYPG#&@@@@@@@@@@@@@@@@@@@@@@@@@@#J#&GY!^:. . .....................P  BJJYYY \n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&. ^..........................::^^7  BJJYYY \n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#  ~...................::^^^:... ..:7GJJYYY \n#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&  ~.............::^^::..  .^!J5PBBG5YJJYYY \nY5&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&  ~.....::^^^^^:.. ..^~?YPGGGP5YYJJJJYYYYY \nJJJY5PPPPG&@@@@@@@@@@@@@@@@@@@@@&  ~^~^^::..   .:!JPBBGP5YYJJJJJJJJYYYYYYYY \nJJJJJJJJJJJYY5B&@@@@@@@@@@@@@@@@&   .  ..:!?YGBBBGP5JJJJJJJJJJJYYYYYYYYYYYY \nJJJJJJJJJJJJJJJJY55GB&&@@@@@@@@@&.:~JPGBBGP5YYJJJJJJJJJJJJJJJJJJJJYYYYYYYYY \nJJJJJJJJJJJJJJJJJJJJJJJYYY5PBBB#&5GGPYYJJJJJJJJJJJJJJJJJJJJJJJJJJJJYYYYYYYY");
		System.out.println("\n\n" + heros.getNom()+ " trouve un coffre au trésor !\n");
		System.out.println(heros.getNom()+ " ouvre le coffre ...");
		
		// le joueur obtient toujours des pièces d'or mais la valeur varie en fonction de la stat chance
		int recompense = random.nextInt(heros.getLUK());
		heros.setGold(recompense + heros.getGold());
		System.out.println(heros.getNom()+ " obtient " + recompense + " pièces or ! \n");
		
		// parfois et en fonction de la stat chance le joueur peut obtenir un stuff en prime !
		int roll=random.nextInt(100-(heros.getLUK()/2));
		if (roll < challenge*10){
			System.out.println("Il y a autre chose dans ce coffre !");
			this.pause(3000);
			Stuff stuff = new Stuff();
			System.out.println(stuff.toString());
			System.out.println("Souhaitez vous garder "+stuff.getNom() + " ?");
			System.out.println("Entrez \"oui\" pour équiper "+stuff.getNom());
			System.out.println("Entrez \"non\" pour abandonner " +stuff.getNom());
			System.out.println("Entrez \"status\" pour afficher l'équipement actuel du héros");
		
			while (true) {
				String input = scanner.nextLine().toUpperCase();
				if (input.equals("OUI")) {
					return stuff;
				} else if (input.equals("NON")) {
					System.out.println(heros.getNom()+" renonce à son butin et continue son chemin.");
					Stuff rien = new Stuff();
					rien.setNom("Rien");
					return rien;
					// dans ce cas, on renvoie un objet factice qui sera géré et détruit dans la fonction equip
					} else if (input.equals("STATUS")) {
					System.out.println(heros.toString());
					this.pause(4000);
					System.out.println("Souhaitez vous garder "+stuff.getNom() + " ?");
					System.out.println("Entrez \"oui\" pour équiper "+stuff.getNom());
					System.out.println("Entrez \"non\" pour abandonner " +stuff.getNom());
					System.out.println("Entrez \"status\" pour afficher l'équipement actuel du héros");
					}
			}
		};
		
		Stuff rien = new Stuff();
		rien.setNom("Rien");
		return rien;
		// dans ce cas, on renvoie un objet factice qui sera géré et détruit dans la fonction equip
	}		



	public void embranchement(Game game, Heros heros){
			this.pause(3000);
			System.out.println(" .:  :   ~5555555555YYYY55555555555555PP5P555555Y.?:555YY5555555555555555P5P55YY5555P55555:  .. .:  \n .:. ..:.                                        !P.                                       :.^  ^:  \n  ..:^.:^                                      ^BBBB!                                      ^..:^..  \n ..:..: :..   ^JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJP#GGBB?JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ7   .:..:....  \n ....:.::::  :                                  .!!:                                  . .:::..::..  \n   .:..:: ...:. .                                 7                                .  :.:. :::.:    \n  :. .:.:~.:. .. .     .         .  .  .        ~PY?  .  .      ..  .             .. ...:^^:.:. ..  \n ....  :^^..:. ....  :YYYYYYYYYYYP5YYYYYYYYYYYYYB5#PYYYYYYYYYYYYYYYYYP5YYYYJJY7 ..... .^..^^: .^..  \n  ....^^:...:.:. :...                            .~                             :.:....!..::::....  \n   .^:.:..::?.:~:....:                                                        .....:!:.Y...: :.:    \n .:.  ^:..^:7  ^?^:: :..  7JJJJJYJJJJJYYJYYYYYYYJYJJYJJJJJJYYJYYJJYYYYJJYY. ......^?~ .!^...^.  :.  \n  ........^!5?  ^5!:.:.... . .    .. .     .. ........ ..    .....    .  ...:.:.:.P!  5J7^:.:..:..  \n  .:.:.7^!5:?@G: .G:.....................:.~7~...!~...~!^ :.............. .:..::.G^ .P@J:5!7:!.:..  \n  .:...~7^:5@&@@7 .#:..:...   .... ..^...7.  7   ^!   7  .?...~. ..... .....:.:.&: ~&@&@5:^Y.!....  \n   . .:?.Y@@@@@@@? !B .:.. ..... .^: .!.  !^ !J^~!?::57.~7  .?: .:....... ..^. #J 7@@@@@@@?7~^ .    \n ... :.?~@@@@@@@@@^ !Y :: .    :!  ~^ .??:~G7YG#&#B##PY!G!^75. :?. .! . .. ::.5! ~@@@@@@@@B!^... .  \n  ..:::?7@@@@@@@@@B  B......... ^7.:G?!JP#B&####G??PB##&&#BP~!?B7 .J: .......:# .#@@@@@@@@#7^.....  \n ...^::J7@@@@@@@@@@. Y!   ....!^.YBGB#@&###GPPGGGGGGGPPPPB#B#&GG5P#~.^:... . Y? !@@@@@@@@@#?~~^:.   \n ...^::?!@#&@@@@@@@? .P   .....^GGB@@@@@@@@@@&G??777Y&@@@@@@@@@@&GJG7.....  .B  G@@@@@@@#&#?~!^:..  \n  ..~^.?!@^.P@@@@@@@? B.  ....::Y@@@#PPBBBBPJ:. ..:. .!JP#BBBGP#@@@G:::...  ~P P@@@@@@&J G#?~~::..  \n ...^::?!@^  .Y@@@@@@~5. ....:^:5@@GYY5PY~^     ~?5. .. .^7PPYY5G@@G^^^....:~J7@@@@@&~   P#?~~::..  \n ...~::?!@:   :P~#@@@!?  ...:.:^5@&5YJJ?.   .:75#J&55!. ....?7JYP&@G~::......7J@@@5~P    5#?~~:^..  \n .:.^::?!@Y.  .? .5P@!?  ...::^^5@&5Y5. . .7#BY^~JY.7P#G7    :55P@@B~^:...  .?J@?7 .Y   :##?~~^^..  \n ...^::?!@G!?7Y7 .JJ@~7 ....::~^5@@PBJ. :Y#G!:.:?#B^:.:7B#Y. .JGP@@B^^^:... .?Y@^! .P!JJ7&#?~~.: .. \n  ..^:.?!@?   ~G~P5Y@!7  ...::^^5@@G5  ~&B7^!Y#@B55#&PJ!^7##: .P#@@G^^:.... .?Y@^G7JG.   G#?~!.^..  \n ..::::?!@^   .5 ~YY@!7  ....:^^5@#@P ?&?.7@@&P7:..^?G@@&!.5&^ P@#@B^^^.... .?Y@^J :Y    5B?~!:^.   \n  ..^^:?!@^   .J .JY@!?  ..:::^^5@~7B.P! ^@&?::..:^..:.Y@&. G!:#?.@B~^:.... .JY@^~ .?    PB?~!.:.   \n....:::?!@Y75~7P.7YY@!7 .....:^^5@?~? ?^:J@.::::.::::::..@7.5..?~^@B~^:::.. .JY@^?:~P^75~&GJ~!.^..  \n  ..^^.?!@7 . :B.??Y@!7  ...::^^5@7^Y^?:~5& :.:::::.:::: &~.J^^5^~@G~:::... .JY@^5:7Y  . #GJ~!.~..  \n    ^^:?~@^   .P  ~Y@!7   ...:^^5@?^?.!. ~&.:.:::::.:.::.#: ?:.5:~@G~^:...  .JY@:. ^Y    GGJ~~.^..  \n  ..:::?!@:   .5 .JY@!7   .:.:^^5@@#J.!: ~&.^.:::::.::^^.#:.!^.5B&@B~^:...  .JY@^! ^?    PBJ~~:..   \n ....::?!@J:~^JB~7YJ@!7  ...::^^P@@55?^..~&.:.:::.:.:~!:.#: .~!P5@@B~::.... .JJ@^Y^7B!~~^#G?~~.^..  \n   .~::?!@?   ~5 .YJ@!7 ...:::^^5@@#PG^..~&.^::.:::.::!: B:..~GG#@@B^^^......?J@^~  B.   BBJ~~::.   \n    ~::?!@~   ^Y .JJ@!7 ....::^^5@&GPG:. ^&.:::::::.::::.#. .^PGG@@B^^::... .JJ@^^  G    BBJ~~::    \n  ..:::?!@~!! :? .?J@!7  ..:::^^5@&55Y:..^&.::::::::::::.B:..^Y5P&@B^^^.... .JJ@^:  Y  Y BBJ~~.:.   \n  ..:::?!@~JP.^~  ?P@!?   ...:^^5@&55P^..^&.:::...::::::.B:  ^P5P@@B^^....  .?J@7^  7 ^#.#BJ~~.^..  \n  ..:::J!@~   ~P5B@@@!?   ...::^5@&55P: .^B..:.^~^:^^:^..G...:J55&@B^::...  .??@@&BYG.   BBJ~~:^..  \n   .^^:J!@7~P&@@@@@@@!?  ..:.:^:5@&PP7.?5YJJJJJPPYB#YYJJJJ?Y#J^YP#@B^^:.:.. .??@@@@@@@#Y^&BJ~~:^.   \n ...^^:J!@@@@@@@@@@@@!? ....::^^Y@&?:.?G5P5#PYBPPY&#YYGPPP5Y5P!:!B@B^:::... .?7@@@@@@@@@@@BJ~!:^ .  \n  .::::J!@@@@@@@@@@@@!?  ....::^Y@? ^55&GP555B@PPP&&PPP&BGP5#GGJ.~#B^::.... .?7@@@@@@@@@@@BJ~~.:..  \n  ..^^.J7@@@@@@@@@@@@!?   ...:.^!: 7555YG#J55BBJYYBBPYYY5&55P&P5J::7~.:..   .?7@@@@@@@@@@@BJ~!.^.   \n  ^::::J7@@@@@@@@@@@&!?   .... . ^GPYYBPYY5@&YYG#5YP@G55YY5P&GJYYJ! . ...    ??@&@@@@@@@@@B?~7....  \n  ...:.J!@@@@@@@@&BB#~^ .......:GG#GYYBPYY5#BGYP#PG5#PY5G5YYGBG5YY5G!:.. . ..^!&BB&@@@@@@@B?~7 ...  \n  ..  .Y!@@@@@@@#BBG^       .!P&@#55PPGPPPP5B&GP5B&P5GGG&PPPPG&GPPP@@GY~       ~GBB#@@@@@@B?~:  .   \n       Y!@@@@@&&#B!        ~J55@5?JJJJ&GJJJJ?P@JJJJJJ&#JJJJJ5@YJYJP@5YYY5.       7B#&&@@@@B?^       \n       5!@&@&&&B:        .!P5@#5PP5#&PPPPPPB@G5#&PPP@B555P@B555&@5PPPB@PP?:        .B&#&@&G7^       \n       5!#?B#5!         7@@@&&Y??JY@PJJJJJJP&J?JJJJJY@5???JY@@@@@GJ???J&BB@7.        7G#BY5?^        ");
			System.out.println("\n\nIl y a trois portes en face de " + heros.getNom() + ":");
			this.pause(3000);
			this.challenge+=1;
			//une salle est franchie donc on incrémente la variable challenge
	    	
	    	//genere un embranchement
			System.out.println("Derriere de la porte de gauche ...");
			int gauche=random.nextInt(3);
			cheminCorrespondanceTexte(gauche);
			this.pause(2000);
	    	System.out.println("Derriere de la porte du milieu ...");
	    	int milieu=random.nextInt(3);
			cheminCorrespondanceTexte(milieu);
			this.pause(2000);
	    	System.out.println("Derriere de la porte de droite ...");
	    	int droite=random.nextInt(3);
			cheminCorrespondanceTexte(droite);
			this.pause(2000);
	    	
	    	//Le système de direction
			System.out.println("Entrez \"gauche\" pour prendre à gauche ou \"milieu\" pour prendre au centre ou \"droite\" pour prendre à droite.");
	    	while (true) {
	        	String input = scanner.nextLine();
	        	if (input.equals("gauche")){
	        		System.out.println(heros.getNom() + " traverse la porte de gauche ...");
	        		cheminCorrespondance(gauche, game, heros);
	        		return;
	        		} 
	            if(input.equals("milieu")){
	            	System.out.println(heros.getNom() + " traverse la porte du milieu ...");
	            	cheminCorrespondance(milieu, game, heros);
	            	return;
	            	}
	            if(input.equals("droite")){
	            	System.out.println(heros.getNom() + " traverse la porte de droite ...");
	            	cheminCorrespondance(droite, game, heros);
	            	return;
	            	}
				}
	}
	
	
	
	public void cheminCorrespondanceTexte(int salle){
			//correspondance des salles :
			//0 = combat
			//1 = scene
			//2 = heal
			//3 = boss
	    	if (salle==0){
	    		System.out.println("Monstre devant");
	    		return;
	    	};
	    	if (salle==1){
				System.out.println("Scene devant");
	    		return;
	    	};
	    	if (salle==2){
	    		System.out.println("Heal devant");
	    		return;
	    	};
	    	if (salle==3){
				System.out.println("Boss devant...");
	    		return;
	    	};	    	
	}
	
	
	
	public void cheminCorrespondance(int salle, Game game, Heros heros){
			//correspondance des salles : 
			//0 = combat
			//1 = scene
			//2 = heal
			//3 = boss
	    	if (salle==0){
	    		if( game.startCombat(heros,new Creature()) == true ){heros.equip(game.startLoot(heros));}; 
	    		return;
	    	};
	    	if (salle==1){
				this.startScene(heros);
	    		return;
	    	};
	    	if (salle==2){
	    		System.out.println("Heal devant");
	    		return;
	    	};
	    	if (salle==3){
					    		if( game.startCombat(heros,new Creature("Boss","gg",5,5,5,5)) == true ){heros.equip(game.startLoot(heros));}; 
	    		return;
	    	};	    	
	}
	
	
	
	public void pause(int longueur){
		try{Thread.sleep(longueur);}catch (InterruptedException e) {};
	}






	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
						//SCENES						//SCENES						//SCENES						//SCENES						//SCENES						//SCENES
						//SCENES						//SCENES						//SCENES						//SCENES						//SCENES						//SCENES
						//SCENES						//SCENES						//SCENES						//SCENES						//SCENES						//SCENES
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

	public void startScene(Heros heros){
		// cette fonction sert à lancer une scene de façon aléatoire. les scènes sont les différentes rencontres que le joueur peut faire dans le donjon et qui ne sont pas des combats.
		// cela inclus les boutiques mais pas les salles de soin et les salles de boss ni les salles de combat.
		// toutes les fonctions en dessous de celle-ci sont des scenes. hormis main bien entendu.
		int roll= random.nextInt(20);
		

		if (roll <5){
			heros.equip(startBoutique(heros));
			return;
		}	
		
		if (roll==5){
			doublePorte(heros);
			return;
		}
	}
	
	
	
	public void doublePorte(Heros heros){
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
		
		
		
	public Stuff startBoutique(Heros heros){
		this.pause(3000);
		System.out.print("\nJJJJYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYJJYJJJJJJJJYYJYYYYYYYYYYYYYYYYYYYYYYYYYY \nJJJJYYYYYYYYYYYYYYYYYYYJJYYYYJYYYJJYYY5555GGP5?JYJJYYYYYYYYYYYYYYYYYYYYYYYY \nJJYYYYYYYYJYJJJJJJJJJJYY5??7~:...:YP?7J^::^^.. ?PJJYYYYYYYYYYYYYYYYYYYYYYYY \nYJJYYJJJJYYYYYY5P555GPJYG5P!~#:77~~:..:!J55B#! !PJJYYYYYYYYYYYYYYYYYYYYYYYY \nYJJJJJJYGJJ??~^~~.......:^^GBP#B#@@@@@@@@@@@@J ~PJJYYYYYYYYYYYYYYYYYYYYYYYY \nJJJJJYB#B. .?5555B###&@@@@@@@@@@@@@@@@@@@@@@@Y .GJJYYYYYYYYYYYYYYYYYYYYYYYY \nJJJJG&@&G. J@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B .GJJYYYYYYYYYYYYYYYYYYYYYYYY \nJJJB@@@&G. ?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B .BJJYYYYYYYYYYYYYYYYYYYYYYYY \nJJJ&@@@&G. ?@@@@@@@@@#5YJB@@@@@@@@@@@@@@@@@@@B .#JJJYYYYYYYYYYYYYYYYYYYYYYY \nJJ5&@@@@G. 7G77!~~....   :!~5@@@@@@@@@@@@@@@@#  GYJJYYYYYYYYYYYYYYYYYYYYYYY \nJJYG@@@#G! .~    .........  :JP&@@@@@@@@@@@@@@: JPJJYYYYYYYYYYYYYYYYYYYYYYY \nJJJJ&@@GG? .Y ...............  .#@@@@@@@@@@@@@^ 7PJJYYYYYYYYYYYYYYYYYYYYYYY \nYJJJ#@@BG5  ?.................. P@@@@@@@@@@@@@^ ?PJJYYYYYYYYYYYYYYYYYYYYYYY \nJJJJ&@@#PP. 7....................~G@@@@@@@@@@&: 7PYYYYYYYYYYYYYYYYYYYYYYYYY \nJJJJ5@@&PG~ ^?.................^~~7YB##GJ~~~^:.  .:~!?JYYYYYYYYYYYYYYYYYYYY \nJJJJJ&@@GG7 .!......::^~!7?7!~~!~^^^^^::^^:::^J5#B57^:..:^!?JYYYYYYYYYYYYYY \nJJJJJ#@@&PY  !7?5PPY?7!~^^...::::::::^^::^~~::#@@@@@@@&B57^:..:~7?YYYYYYYYY \nJJJJJJG@@G5. ?GPYJ~..::::^^^:^^:^^^:::....&&..:P@@B#@@@@@@@@&#PJ~:.:~?YYYYY \nJJJJJJ5&@&#: ..::::^^^^^^:::..:PB~ .^@&5 .P#~:?5@B:5@@YJ&@&&#GPY!^.  7YJYYY \nJJJJJJJJ5PP?~:  ........!BG.. .&@J .^&@@P^.:J#?:?&&&BGJ7!~::::::::5  GYJYYY \nYJYYYJJYJJJJG#YJ~:.     Y@@::G5:&@#^ :JGB@&~.#&5 ...:::^:::..   .:G~?#JJYYY \nYJYYYYYYYJJJG#PGGGG5J!:..^7?P@@~?@@B~.YP!J7...:.^G#J!~.  ..^!YG#&&@B5#JJJYY \nJJYYYYYYYJJJG@@&&BBGGGGG5?~:..^!~GG5!..:::::^:..:@@!77J5#&&#BPY!:.5  GJJYYY \nJJJYYYYYJJJJP@@@@@@@&&BGGGGGG5?~.  ::::....   .:7@@?J?B57:..     .5  BJJYYY \nJJJJYJJJJJJJP@@@@@@@@@@@@&#BGGGBJ  ^   ..:!YG#&#B@@57!    ...... .5  BJJYYY \nJJJJJJYYY5PG&@@@@@@@@@@@@@@@@@&#5  J5P#&##GY7~:..J~:..............5  BJJYYY \nYYPG#&@@@@@@@@@@@@@@@@@@@@@@@@@@#J#&GY!^:. . .....................P  BJJYYY \n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&. ^..........................::^^7  BJJYYY \n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#  ~...................::^^^:... ..:7GJJYYY \n#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&  ~.............::^^::..  .^!J5PBBG5YJJYYY \nY5&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&  ~.....::^^^^^:.. ..^~?YPGGGP5YYJJJJYYYYY \nJJJY5PPPPG&@@@@@@@@@@@@@@@@@@@@@&  ~^~^^::..   .:!JPBBGP5YYJJJJJJJJYYYYYYYY \nJJJJJJJJJJJYY5B&@@@@@@@@@@@@@@@@&   .  ..:!?YGBBBGP5JJJJJJJJJJJYYYYYYYYYYYY \nJJJJJJJJJJJJJJJJY55GB&&@@@@@@@@@&.:~JPGBBGP5YYJJJJJJJJJJJJJJJJJJJJYYYYYYYYY \nJJJJJJJJJJJJJJJJJJJJJJJYYY5PBBB#&5GGPYYJJJJJJJJJJJJJJJJJJJJJJJJJJJJYYYYYYYY");
		System.out.println("\n\n Bienvenue dans l'échoppe du château ! Entrez, je vous en prie, faites comme chez vous !");
		System.out.println("Voici ce que j'ai pour vous ajourd'hui :");
		System.out.println("************************************************************");
		Stuff one = new Stuff();
		Stuff two = new Stuff();
		Stuff three = new Stuff();
		System.out.println(one.toString());
		System.out.println(two.toString());
		System.out.println(three.toString());
		System.out.println("************************************************************");
		
		System.out.println(heros.getNom() + " possède " + heros.getGold() + "or.");
		System.out.println("Entrez \"one\" pour acheter "+one.getNom() + " au prix de " + one.getPrix()+ " or");
		System.out.println("Entrez \"two\" pour acheter "+two.getNom()+ " au prix de " + two.getPrix()+ " or");;
		System.out.println("Entrez \"three\" pour acheter "+three.getNom()+ " au prix de " + three.getPrix()+ " or");;
		System.out.println("Entrez \"zero\" pour abandonner le butin");
		System.out.println("Entrez \"status\" pour afficher l'équipement actuel du héros");
		
		while (true) {
		    String input = scanner.nextLine().toUpperCase();
		    if (input.equals("ONE")) {
				if (one.getPrix()<=heros.getGold()){
					heros.setGold(heros.getGold()-one.getPrix());
					return one;}
		    } else if (input.equals("TWO")) {
				if (two.getPrix()<=heros.getGold()){
					heros.setGold(heros.getGold()-two.getPrix());
					return two;}
		    } else if (input.equals("THREE")) {
				if (three.getPrix()<=heros.getGold()){
					heros.setGold(heros.getGold()-three.getPrix());
					return three;}
		    } else if (input.equals("ZERO")) {
				System.out.println(heros.getNom()+" renonce à son butin et continue son chemin.");
		        Stuff rien = new Stuff();
		        rien.setNom("Rien");
		        return rien;
		        // dans ce cas, on renvoie un objet factice qui sera géré et détruit dans la fonction equip
			} else if (input.equals("STATUS")) {
		        System.out.println(heros.toString());
				this.pause(4000);
				System.out.println("\nChoisissez un unique objet à emporter :");
				System.out.println("Entrez \"one\" pour récupérer "+one.getNom() + " pour " + one.getPrix()+ " or");
				System.out.println("Entrez \"two\" pour récupérer "+two.getNom()+ " pour " + two.getPrix()+ " or");;
				System.out.println("Entrez \"three\" pour récupérer "+three.getNom()+ " pour " + three.getPrix()+ " or");;
				System.out.println("Entrez \"zero\" pour abandonner le butin");
				System.out.println("Entrez \"status\" pour afficher l'équipement du héros");
		    }
		}
	}

	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
						//SCENES						//SCENES						//SCENES						//SCENES						//SCENES						//SCENES
						//SCENES						//SCENES						//SCENES						//SCENES						//SCENES						//SCENES
						//SCENES						//SCENES						//SCENES						//SCENES						//SCENES						//SCENES
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//






	public static void main(String[] args){
		
		//Debut du Jeu
		Game game=new Game();	
		game.mainMenu();
		//Creation du Personnage	
		System.out.println("\n                                         .........:.......                                          \n                                  :~?@@@@@@@@@@@@@@@@@@@@@@@@@@@@^.                                    \n                               .:~?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@^.                                \n                            .~JPB##&&&&&&&@@@@@@@&#@@@@@@@&&&&&&###G57^.                            \n                         .~YG##&&&&@@@@@@@@@@@@@@#J@@@@@@@@@@@@@@&&&##BGJ^.                         \n                      .^JG##&&&@@@@@@@@@@@@@@@@@@!~@@@@@&@@@@@@@@@@@@&&&##P7:                       \n                    .~5B#&&@@@@@@@@@@@@@@@@@@BB@5.~P@@G@G@@@@@@@@@@@@@@@&&&#BJ:                     \n                   ^5##&&@@@@@@@@@@@@&@@@@@@5~!&::!!&@^Y!@@@@@@@@@@@@@@@@@@&&#BJ:                   \n                 .Y##&&@@@@@@@@@@@@@@&@@@@@@^.:P^~!^B&.:^G@@@@@@@@@@@@@@@@@@@&&#B7.                 \n                ~G#&&@@@@@@@@@@@@@@@@&@@@@@@7:^J:~!~P#^~~&@@@@@@@@@@@@@@@@@@@@@&&#P:                \n               ?##&@@@@@@@@@@@@@@@@@@5&@@@@&~.:..~~~!!~7!#@@@@@@@@@@@@@@@@@@@@@@@&#B~               \n             .Y#&&@@@@@@@@@@@@@@@@@@@.Y@@@&......::^^~~!!7&@@@@@@@@&@@@@@@@@@@@@@@&##7              \n             5#&&@@@@@@@@@@@@@@@@@@@7 !&@@@J.. .....:.::.J@@@@@@@@@&@@@@@@@@@@@@@@@&##!             \n            J#&@@@@@@@@@@@@@@@@@@@@B .!Y@@@@? ..::^~~!7!7@@@@@@@@@@#@@@@@@@@@@@@@@@@&#B^            \n           ~#&&@@@@@@@@@@@@@@@@@@@@: .!?G@@@Y :::^^~~!77J@@@@@@@@@@G@@@@@@@@@@@@@@@@@&#G.           \n          .G#&@@@@@@@@@@@@@@@@@@@@7 .:~??#@@Y.:^^^:~~!7?J@@@@@@@@@#:#@@@@@@@@@@@@@@@@@&#7           \n          ~#&@@@@@@@@@@@@@@@@@@@@5 ..:~!7J&@5.^^~~.^~!7?J@@@@@@@@@^.^G@@@@@@@@@@@@@@@@&#G.          \n          5#&@@@@@@@@@@@@@@@@@@@&:....^~~!Y@5.^~!!~~~~7?Y@@@@@@@@P ..7#@@@@@@@@@@@@@@@@&#~          \n         .B&@@@@@@@@@@@@@@@@@@@&@! ...:^:~B@5.~~!~.~~!!?Y@@@@&&@@: .:77&@@@@@@@@@@@@@@@&#J          \n         :#&@@@@@@@@@@@@@@@@@@Y?@#..:^~775@@5.~~!!!!~!7?J@@@@J5@&.:^^!!B@@@@@@@@@@@@@@@&#5          \n         :#&@@@@@@@@@@@@@@@@@#.:#&..:^~775@@P.^~!~~~~!7?J@@@#.^#&..:^~~5@@@@@@@@@@@@@@@&#P          \n         .B&@@@@@@@@@@@@&@@@@Y :YB..:~~7JY&#J^~J!~!J!!77J##&J.:7&7.^~!!@@@@@@@@@@@@@@@@&#5          \n          G&@@@@@@@@@@@@&@@@P~.::^^^~~~7J!~~!??YJ?J5??7?!~^~~^~!!^~!!!!G@@@@@@@@@@@@@@@&#J          \n          J&&@@@@@@@@@@@#@@@: ...::::^^^^:~~!77!777777!7!^.:::::::^^^^^!&@@&&@@@@@@@@@@&#~          \n          :#&@@@@@@@@@@&^&@@&7  ...:::::. .:~~~~!~^7~!!!~......:::::::^#@@@JY@@@@@@@@@@&G.          \n           Y&@@@@@@@@@@7.?@@@& ..:^^^^^!!: ^^:^!~^~77^^7!:::.:~~~~~~!!P@@@&.~#@@@@@@@@&#!           \n           .G&@@@@@@@@P :~P@@&...:::^^~!!: ^!~!!!!77777?!::::^~~~~~~!!G@@@^.!7&@@@@@@@&5            \n            :#&@@@@@@@~ ..~@@&....::^~~!!: :~:^:^^~~~~^!~:^::^^^~~~~!!G@@&..:.Y@@@@@@&G.            \n             ^#&@@@@@@?.^^7@@#....::^^~^~: .^.^.^:^^:^:~::::::^^~~~~!!5@@&:.~:P@@@@@&B.             \n              :B@@@@P:..:^~~?^.:.^:~~~!~~^:.~.^:^:^^^~:!^::^^:^^!~!~!~^!~...^^~~#@@&G.              \n               .5&@@G. ............:::::::..~:^^~~!!!7^!:........:::...    ....~#@&Y.               \n                 ~#@@# .::....::.::.::::::..~:~!!!!!77^~^.::::....:::::..  .^:7@@B~                 \n                  .?&&..^:..::::::^::^:^^^::~^!~.  .^!^~^^::::::::::::::.  .~^J#?.                  \n                    .!..^:...::::::::^:^^:!:^^~.     ~^^:!^^^:::::::::::.  .~^:.                    \n      ...              .^:.....::::^^^^^:^!.::^....  ::..~!^^^^:::::::...  .^:             ....     \n   ........            .::  ...::::^^^^:.7~...:. ..  ..  :7^^^^^^^^^^:..   .^:            ......... \n ..........            .::.  ...^^^^^^:.~7^^^^~^^^^^^^^:..!!^~~~~~~^^..    .^:.           .......... \n .........           ::^^~^.   ..~!~~~!~7!~777777777777!^.~!!!!!7777:..   .^~~~^           ......... \n  ......            .:::^::.    ..:^^:^~^^!77777777777!~^..^^^^!!!~^..    .:^^^~.            ....... \n                    ....::..  ...:^^^.:!^^!77777777777!!^:.~~::~~^::::.  ...:::^^                   \n       .::::::^^^^^^~~~~~~~~~~~!~~!!~^^!7!7777777777777!~:~!7~^!7!!!!!!!!~~~~~~~!~^^::::::::.       \n   ... .:^^^^~~~~~~~~~~~!!!!!!!!!!!~^:~~~!!!77777777777!~:^~~^^!!7777!!!!!!~~~~~~~~~~~^^^^^:.....   ");
		System.out.println("\n\n");
		System.out.println("Dans les profondeurs de la forêt, il y a un château sombre et sinistre où règne le Comte Dracula, un être sanguinaire et malveillant qui terrifie les habitants des villages environnants.");
		System.out.println("Mais un brave héros, muni de sa foi inébranlable, est prêt à entrer dans le château pour affronter les forces du mal et détrôner le vil Comte.\n");
		Heros heros = new Heros();
		System.out.println("Le héros "+ heros.getNom()+" entre dans le château de Dracula...\n\n\n");
		game.pause(3000);


		//Boucle principale du jeu
		Scene scene=new Scene();
		
		//TEST CHEMIN
		while(true){
		game.embranchement(game, heros);
		
		
		
		//SPAWN DEMON a 10 salles
		//\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@BBB#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&BBG&@@@@@ \n@@@@@&...~@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&@@@@@@P...J@@@@@ \n@@@@@#:..!@@@@&P!~~~~~~^B@@@@@@@@@@PG&&&&&@@@@@@@@@Y^^^^^^^~5&@@@B?~:J@@@@@ \n@@@&B?:..!@@&G5J:....:^^G@@@&&&&&&#P5PPP55#&&&@@@@@P!7777!:..~G@@#55Y:!B@@@ \n@@B557:..!@#555Y:.:!PBB#@@@&BB5PBGGP55555555GG#&&&@&#B#B555!...^##55Y:..~&@ \n@@P5P7:..!@G55PJ:.:7&@@@@@&&#B##B#&B555PGG5P&&#BPP@@@@@@555J:...B#55Y^...G@ \n@@P5P7...:75555Y~...~G@&&&#B5G&&&&&&##B5GGGG#&#BPPBB&@BP5555J7?5GP55Y:...B@ \n@@PPP57~^~7G&&GGGY?77B&&#B###BP&&&&&&&&#GPBPB&&###P5GBBGGGGGGB@&P555Y7!:.G@ \n@@#GPGGGGGG#@@@@@@@@@@@@&&&@#P:Y&@@&#&&#57!~!7?#@@#BB#&@@@@@@@@&55555Y?^7&@ \n@@@@&#BBBB@@@@@@@@@@@@@@@&~^::::755Y7J?7^:::::::!P&@@@@@@@@@@@@@@BPPP5P&@@@ \n@@@@@@@@@@@&&&&&&&@@@@@@@:::::::::::::::::::::::::~@@@@@@@#######@@@@@@@@@@ \n@@@@@&##BB&&@@@@&&@@@@@@B:.5&5^::::::::::::::^B&~.^&@@@@@&B#@@&&#GBBB#@@@@@ \n@@@@@@@@#BBB##@@@@&####BYYY&@@&5~^::::::::^~P&@@GYY5PPPP5&@@&BBGGG#&@@@@@@@ \n@@@@@@@@@@&#BGB#&&#BBBB#&&&@@&GB@&^:::::::G@G5@@PJJ?YP555BB55PGB&@@@@@@@@@@ \n@@@@@@@@@@@@G^G&@@&BB&@#BBB###BB#B^:::::::~!~~!!::::5&G5P&&BY^G@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@&#B##@&BBBBBBBBG^:::::::::::::::~B&^~JJ&@@@&@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@&BB@@#BBBBBBBG^:::::::::::::::5@&::YG@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@@&B@@#BBBBBBB5^::::::::::::^J&&@#75&@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@@@#@@&BBBB##G?!:::::^777~::^!G&@75@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@@@#@@#BB#&@@@@B:::::7&#&B5!::.B@~Y@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@@@#@@&BB@@B#&&G:::::!PPY:G@^:.B@~Y@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@@@##&@&#&&B#BGY:::::!GG5:75^!5B7:Y@&&@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@&&#####BB#@@&BB5B&&?::::7##G::^&&5^::^^^^!P&@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@&&#########BB#@@&G#&&GYYYY5PPP7~&G^:::^::::::~P&@@@@@@@@@@@@@ \n@@@@@@@@@@@@&################@@@&#@@@@@@@&B@@@#^:^^^^^^^^::::~!J&@@@@@@@@@@ \n@@@@@@@@@@&###################&@@@@@@@@@@@@@&G7^^^^^^^^^^^:^^^::^Y#&@@@@@@@ \n@@@@@@&&&#######################B&&&&&&&&&#PGG!^^^^^^^^^^:!555?~^::~?P@@@@@ \n@@@@@############################BBBBGGGGGGGGG7^^^^^^^^^^^~YP555?^::::#@&&& \n###################################BBBBBBBGGGB7^^^^^^^^^^^:7Y555P7::::^^^^^ \n###B###########################BB####BBBBBBBGY~^^^^^^^^^^^^:~?YPY!::::::::: \n##P7YBBBBB######BBBBBBBBBBBBBGY!?BBBBBBBBBGGY^^^^^^^^^^^^^^^^:~7~:::::::::: \n##5!77777JB#####?7777777777777!!!!!!?B#BB5~~~~~~~~~~~~^^^^^^^:^~^:^^^:::::: \n##BPP?!77J######777777777777!!!!!!!!YB###P7~~~~~~~~~~~~^^^^^~J5BY?^^^^^^^:: \n##&&&5JJY#&###&#JJJJJJJJJJJJJJJJJ???G####BJ77777777777777!?5B####B7!!!!!!!!"
		//SPAWN DRACULA a 30 salles
		//\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&#BBBB#####@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&#BPGBGBB#&#GGGGGGBBGGGGG#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&G5PPGB#&&&&@@@@&&&####BBB##&#BBB#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@@@@@@@@&GJY5GB###&&&&@@@@@&##BGGGGGBB#&&&&##B#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@@@@@@#Y7JPGGPPG##&&@@@@@@&###BGGP5PB#&&&&&&&BBB#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@@@@&P??5PP5JJ5G#&&@@@@@@&BBPPPPGB##BB#&&&&&&&&BBP#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@@@#JYJ5P55GBGBB#&&@@@@&##BGGP555PP#@&#&&&&@&&&&#BGG&@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@@BJ5Y5P5G#BGBBGB#&@@@&###BBGPPBBGGGB&@&&&&&&@&&&&#BP#@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@@G5PYGP5#&#BGB&&&&@@@&&&@@@&BPPP#&####&@@&&@&&@&&@&#BG#@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@@GGGJP55&&&PG&@@@@@@@@@@@@@@@@&GGG#@&&&&&&@&&@&&@&&@&#BG#@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@#G#?PP5&&#5B&@@@@@@@@@@@@@@@@@@@BBB&@&&&&&&@&&@&&@&&@&#BG&@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@#P@JJPY#&&?#@@@&&&@@@&&&G5?7!75B&@#B#@@&&&&&&@&@&&@&&&@&#BB#@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@&Y@#7PYB&&YP@@#BBBG5?!^..      .:7B@G##@@&&&&&&@&@&&@&&&@&BG#&&@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@G&@?55G#@#?@@BBG5?^.             .^B#B#@@&&&&&&&&@&&&@&&&@#BB##&@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@&P@G?PGB&&YY@#GY!:                  ~BG#@@&&@&&&&@&@&&@&&&&@&BGB#@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@G&@J5P#B@55P&Y~.                   .^BB#@@&@&&&&&&@&@&&@&&&&@&BGPG&@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@&G@GJY#P&GYP&&P~.               .^?G&&&@B&&@&&@&#&&&&@&&&@&&&&&&#GGG&@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@B#&JJGG#@JBB@@@@@#J~.      .^!5B&@@@@@@@B&&@@&&@&&&&@&@&&&@@&&&&&&BGGB&@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@P@&?5BG@PPB&@@@@&##@&5?.!5G&@@@@@BJG#@@@&B&&@&@&@&&&&&&@&&&@@&&&&&&#BBGB&@@@@@@@@@@@@@ \n@@@@@@@@@@@@@##@PJGP&G?##@&&@@&BB#@@@~:B&&@@@@@&#&&&#B#B#&&@&&&&&&&@&@@&&&&@@&&&&&##BGGB###@@@@@@@@@ \n@@@@@@@@@@@@@G@&?GP&GJBB&@&##&&&##GGG ^GP5?7!!!!!!^:^?G#B&#&@&&&&&&&@&@@@&&&&@@&&&&&##GB#B###&&&&&&@ \n@@@@@@@@@@@@@G@PPPBGPP#&@@#&#P?^...JY ?PJ^          .JB###&B@@&&&&&&&@&@@@&&&&@@@&&&&&&GGBB#&&@@@@@@ \n@@@@@@@@@@@@&B#JPP#G5##@@@G@#P!.   ?~ ?5!:         :JB##&B&&#@@&@&@&&@@&@@@&&@&@@@@&&@P!#####B#&@@@@ \n@@@@@@@@@@@&B#Y5P&GY&B@@@@G@&BP7:..Y  :~^.      .:?PBBB#&#B@B@@&@&&&&@@@&@@@&@@&@@@@&G~#@&&#BB###&@@ \n@@@@@@@@@@&BPY5B@B?&#@@@@@G@@&BP~..JY7B#G.      .:!YPBB#&#G@&&@@&@&@&&@@&&@@@&@&&@&G77P&&&&&#BB##B#& \n@@@@@@@@&B5Y5G&@#7##&@@@@@#&@@@G?7:.P&&P.       .5^^JG##BBB&@&&@@&@&@&@@&&@@@&@@#PJ?!#@&&#&&&#BB#&&& \n@@@@@@#PYYPB&@@&JB&&@@@@@@@B@@@&##PJYGP?YP?7!!~7Y&J.YB#GG##&@&@@@&@&@&@@&&@@@&#5?JYJG&@&@&G#&&#B##@& \n@@@@#YY5P#&@@@@YG@&@@@@@@@@@@@@@&#&@&&&B?PYBP##@B!.!PG5P&@#&@&@@@@&&&&@@@@@@GYJ5P?5#@#@@&@BG&&BB#B&@ \n@@&5J55B&@@@@@&P@&@@@@@@@@@@@@@@@@&#@&#G5GG#&#G!. ^YY5#@@&G@@&@@@@&@&&@@#BPYJGGPYP&@@#@@@@BG@@B##&@@ \n@&J5G#5&@@&@@@#&@&@@@@@@@@@@@@@@@@@&B#&&###B5!.  :JG&@@&B5&@@&@@@@&@&&#5J5GGPJYP&@@@@&&@@@&G&@#B&@@@ \n@&Y&P&B@@@&@@@&@@&@@@@@@@@@@@@@@@@&@&GJ::..    :?#@@&BYYP&@@@@@@@@&&G5JPBB5?YB&@@&@@@@#&@@@#B@&#@@@@ \n@@#B&G&&@@&&@@@@@&@@@@@@@@@@@@&##&@@@&B5J7^::!5&@@#YJ5B@@@@@@@@@@#5J5GBGY?Y#@@@@@&&@@@@#@@&@###&@@@@ \n@@@##&##&@@@@@@@@@@@@@@@@@@@@@@&P#@@@@@@&&&&&&&&&G!G&@@@@@@@@&#PJYPBBP5YG&@@@@@@@@@&@@@&&@@&&BPB@@@@ \n@@@@@&&&&&###&&&@@@@@@@@@@@@@@@@&BB@@@@@@@@&&&#&&P7@@@@@@@@&PJYPBBGPYP#@@@@@@@@@@@@@&&@@@&&&&##GG#@@ \n&&&&@@@@@#BB######&@@@@@@@@@@@@@@@#G@@@@@@@@&##BY?B@@@@@@@BJ5GBB555B&@@@@@@@@@@@@@@@@@&&@@&&&#BBBGBB \nB###&##&#B#####BBBBGB#&&@@@@@@@@@@@PB@@#BB&&&&J5B&@@@@@@#?YPBB5YG&@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&&&&& \n@&&&&###&&&&&&&@@@@&B5PB&&@@@@@@@@@&5@@@#J5G#JJ@@@@@@@@@7YBGPPG&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@&&&####&&&@@@@@@@&5P##&&@@@@@@@BG&@@@&#B7&@@@@&&@@#75Y5#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&& \n@@@@@@@&##GG##&@@@@@@@@#JG###&@@@@@@@GG@@&#&#5@&&#&@@&GJYG&@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&&&&&##BBBB \n&&&#BBBGB&PP##&&@@@@@@@@B5GG##&@@@@@@G#@@@@&PJ&&&@&@&7Y&@@@@@@@@@@@@@@@@@@&&&&&######&&@@@@@@&&&&@@@ \nBB##&&&@@@#PBB##&&@@@@@@@&B5B#&@@@@@@@@@&@@@&P@@&&&B5?&@@@@@@@@@&&&&&&&&#####B####&&@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@#5P###&@@@@@@@@#PB&@@@@@@@#GGGPPGB#&@&Y?#@@@@@@@&&&###########BGG#&&@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@&YG###&@@@@@@@@&B#@@@@@#P5B&GYJB&B&@YG@@@@@@@&&###########BPPG#@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@&GPBGG&&@@@@@@@#G@@@&GYP#&@&GP&&GB@@@@@@@@@&##########BBBB#@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@YPBB#&&@@@@@@@&@@#55B&@@&B&P&##5#@@@@@@&#######BGBB##&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@&P5B##&@@@@@@@@@BYP&&@&&BP&G&B@G5&@@@&#######BGG&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@@@@@@@@@@@@@@@@PYB&&@@@@@@@@BYG&&@&B&BP@&#5&&Y5#&#######BPG&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
		
		if (heros.getHP()<1){							//Gestion du GAMEOVER
			game.pause(3000);
			System.out.println("\n------------------------------------------------------------------\n                        GAME OVER\n------------------------------------------------------------------\n\n\n");
			}
			
		}
	}
}




	//////////////////////////////////////////////////
	///////			CODE DE TEST				//////
	//////////////////////////////////////////////////
	
	//TEST EQUIPEMENT ET GENERATION D'OBJET
		//heros.equip(new Stuff());
	
	//TEST GENERATION MOBS
		//System.out.println(new Creature());

	//LANCER UN COMBAT + LOOTING 
		//if( game.startCombat(heros,new Creature()) == true ){heros.equip(game.startLoot(heros);)}; 
	
	//LANCER UN LOOTING
		//heros.equip(game.startLoot(heros));

