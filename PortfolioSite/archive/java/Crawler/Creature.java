import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Creature {
	
	private String portrait; //Cette variable contiendra une seule ligne de plusieurs caractères suivis de \n qui, quand imprimés sur la console, créeront le visage de la créature en question
	private String nom; //Le nom de notre créature
	private int HP; //HEALTH POINTS, donne la résilience d'une créature face aux attaques
	private int STR; //ATTAQUE, donne la puissance de frappe d'une créature 
	private int SPD; //SPEED, donne la fréquence à laquelle une créature attaque
	private int LUK; //LUK, donne la fréquence à laquelle une créature LUKuive une attaque
	private Random random = new Random();


	private static ArrayList<ArrayList<Object>> AllMobs = new ArrayList<>();
static {
	//On a ici toutes les créatures du jeu divisées en différents sets d'ArrayList dans le but de former une table de rencontre. Ils sont classés par ordre de difficulté afin de faciliter leur réferencement et leur appel.
	//Par exemple,cela permet d'appeller des créatures aléatoirement dans les 10 premiers ennemis lorsque le joueur est dans les premières salles du château puis augmenter progressivement le challenge en allant plus profondément dans la table de rencontre. 
	//Une créature est composée des éléments listés ci-dessus, dans le même ordre de citation.
	
    ArrayList<Object> Squelette = new ArrayList<>();
	Squelette.add("\n       .........  ..........  ....................   ................      \n     :^^^^^^^^^^^^^^^^^^^^^^::7YYGBBBBBBBBBBBBBBB!:^^^^^^^^^^^^^^^^^^:     \n     :^^^^^^^^^^^^^^^^^^^^^JP5PBGB###############PPPJ::^^^^^^^^^^^^^^:     \n     :^^^^^^^^^^^^^^::~PGPP#&&###BBBBBBBBBB#######&&BPGJ::^^^^^^^^^^^:     \n     :^^^^^^^^^^^^^^?Y5########BBBBBBBBBBBBBGGG######@@G??!^^^^^^^^^^:     \n     :^^^^^^^^^^^^^^G&&##&&####BB#######BBBGGGGGGGGGB##&@@J:^^^^^^^^^:     \n     :^^^^^^^^^^^^^^P###GJJJJJB#########BGGGGGGGGGGGBBBB##?::^^^^^^^^:     \n     :^^^^^^^^^^^^^^P##&Y    .P#B#######BBBBBGGGGGGGGGGB##PYY^:^^^^^^:     \n     :^^^^^^^^^^^^^^P##&5 ....::Y###########BBBGGGGGGGGB#B#&#?77^^^^^:     \n     :^^^^^^^^^^^^^^P#5Y7...... !YYYYYYYY5#####GGGGGGGGB#B###@@&~^^^^:     \n     :^^^^^^^^^^^^^^P&~ .........    ... ~#####BBGGGBBBB#####@@&~^^^^:     \n     :^^^^^^^^^^^^^^G&!      ......      ^5PPPB##B#BB########@@&~^^^^:     \n     :^^^^^^^^^^^^^:?J^!!!!!!^ .. :!!!!!!!!~  Y##@@&B########@@&~^^^^:     \n     :^^^^^^^^^^^^^..75@@@@@@B?:.75@@@@@@@@&J~::J@@&B########J!!^^^^^:     \n     :^^^^^^^^^^^^^..G&@@@@@@&#~.B&@@@@@@@@@@Y  !&#BB#@@#B&@@7:^^^^^^:     \n     :^^^^^^^^^^^^^...~@@@@@@5....7@@@@@@@@@@Y .:~~GG#@@@@G77~^^^^^^^:     \n     :^^^^^^^^^^^^^5G.:Y#@@J7YB!. ^YP@@@@#YYY!  . .B#&@@@@P::^^^^^^^^:     \n     :^^^^^^^^^^^^^B@:  ^!~:B&@@P.. .!!~~^ .!7775BB@@@@@&&5:^^^^^^^^^:     \n     :^^^^^^^^^^^^^?Y?YJ.  :&@JB@#:.. .?JJJP@@@@@@@@@@@&~^^^^^^^^^^^^:     \n     :^^^^^^^^^^^^^::J555~ .!! ^7!.....5@&555&@@@@&5555Y^^^^^^^^^^^^^:     \n     :^^^^^^^^^^^^^^^:::&J...... ....^57@G  .#@@@@#!!^::^^^^^^^^^^^^^:     \n     :^^^^^^^^^^^^^^^^^^#@^5JB7B~#!JG!@PY?..:BBBBGB@@J!!^^^^^^^^^^^^^:     \n     :^^^^^^^^^^^^^^^^^^JY:?7Y!5~5~7Y.^.  ..^BGGPPB@@@@#^^^^^^^^^^^^^:     \n     :^^^^^^^^^^^^^^^^^^::YJ  . . .   ^JJYGGGBGGPPG@@@@#^^^^^^^^^^^^^:     \n     :^^^^^^^^^^^^^^^?5YYY&#.......~PPB###BBBPPP55PBB#&#555GBG~^^^^^^:     \n     :^^^^^^^^^^^::::YBBBBPP55PPPPPG###BBGGGGPPP55PPPPP5YJYB#B~:::::^:     \n     :^^^^^^^^^^7????PPYYY5PPPGPGGGBBBGGGGPPP55PPP5JJ??????GGGYYYYYY~.     \n     :^^^^^^^^^:YBGGGBY!!!JY5PPPPPPGBBGPPP55PPP5YYJ!!777JJJ5PP#&#&@@J:     \n     :^^^!!!!!!!5GGGGGGGY!!!Y555PPPGBBG5PP5P5Y5J!!!!7JJJ?????J5PPB##P~     \n     :^^~GGGGGGGGGGGGGGGGGJ!!755PPPPGGP55555?!!!!7JJJJJJ7!7!!!??????7:     \n     :^^!GGGGGGGGGGGGGGGGGGGJJPPPPPPPPPPP577!!!?JJJJJ777!!!!!!777!!!!:     \n     :^:~55555555555555555555555??????????!!!!!777777!!!!!!!!!~!!~~~!:");
	Squelette.add("[Squelette]");
    Squelette.add(6);
    Squelette.add(7);
    Squelette.add(8);
    Squelette.add(9);
	AllMobs.add(Squelette);
	
	ArrayList<Object> Werewolf = new ArrayList<>();
	Werewolf.add("\n@@@##########################################G55555555555P#######################################&@@ \n@@@#################################BJ??????J!:::::::::::~?????GBBBB#############################&@@ \n@@@##############################BBB5::::::::::::::::::::::::::^~~~~PBBB#########################&@@ \n@@@###########################BPY^^^^:^Y?:::::::::J~::::::::::::::::^^^~PPB##############&#######&@@ \n@@@#######################G5PP?::::::?#&~:::::::::P!::::::::::::::::::::::J555B########&@@#######&@@ \n@@@#####################BG?:::::::::Y@@B:::::::::7B~::::::::::::::::::::::::::7Y5B&&&@@@@&#######&@@ \n@@@####################P!::::::::::Y@@@@B?^:::::7G^:::::::::::::::::::::::::~~7JB@@@@@@@@&#######&@@ \n@@@#################577^:::::::::~5@@@@@@@#YJ~^:J#?^:::::::::::::::::!JGGGGB&&@@@@@@@@@&#########&@@ \n@@@################J!::::::::::::B@@@@@@@@@@@@B5Y@@B55PPPPPP??~^^^75#&@@@@@@@@@@&#B@@@&##########&@@ \n@@@#############G??::::::::::::::B@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&@@@@@@@@@@@@&B&G#@@@&##########&@@ \n@@@#############5::::::::^~!!::::B@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&##@@P&@@&###########&@@ \n@@@###########?!~:::::::::~YGGJ^:G@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&##&@@@P&@@@&##########&@@ \n@@@###########!::::::::::::::7P#5Y@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&#B&@@@##G#@@@@##########&@@ \n@@@#########?~~!!7??!::::::::::7B@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&##&@@#B##GG&@@@###########&@@ \n@@@#########!:^^^?G#&&G5?77?7^^::J@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&##&@&@@&&#BB&@@@&###########&@@ \n@@@#########!:::::::7P@@@@@@@&&BGG&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B&@@@@&&&&##B&@@@@&B##########&@@ \n@@@#########!:::::::::!P@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@&&##&#B&@@@@@&#&&#&&#####&@@ \n@@@#########!:::::::::7PGB@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&#####BB@@@@@@@&&&@@@@@&&##&@@ \n@@@#########7:::::::::77^:J#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@##&&##B&@@@@@@@@@@@@@@@@@@@&&@@ \n@@@#########7::::::::::::::~P@@@@@@@@@@@@@@@@@@@@@@@@&#@@@@@@@@@@@@@@@@@@@#&@@@@@@@@@@@@@@@@@@@&@&@@ \n@@@#########!:::::::::::^^!7?B@@@@@@@@@@@@@@@@@@@@&&#B#&#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&#&@@ \n@@@#########!:::::::::::!7JG&@@@@@@@@@@@@@@@@@@&#BBBBBB#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&@@ \n@@@#########!::^^^::~7J5B#####&@@@@@@@@@@@@@@@#GGGGG#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#########!:^!?GB#@@@@@@@@@&###&@@@@@@@@@@#GGGB#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#########!::::^7?JG@@@@@@@@@@&##&@@@@@@#GG#G&BG@@@&#&@@@@@@@@@@@@@&#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#########7:::::::::~JYJB&&&@@@@&#B#@@&BB&@@#&#&&##B##&@@@@@@&#BBBBB&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#########7::::::::::::YBJB@#@@@&&&@@@@@@@@@@&#BGBB#&@@@@&#GPPGGB###@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#########!::::::::::::Y!Y#7^BGB&@@@@@&&###&@&#######BGPPPPPPPGB##&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#########7~^:::::::::::~Y^:^G#@@@@&#BPGGBB###BGGPGGGGGGPPPPGBBGGGGB#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#########B#!::::::::::::::~P@@&BBPPPGP5P5P555555PPPG&@@@&#GPG&@#BGGGGG#@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@###########!::::::::::::^Y#@#GP555P555P5PPP55PGGGPP5P#@@@@@&BP#@@@@@&#GG&@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@###########!::::::::::^J#@@&GBGPPPPPP55BG55PG#@@&P555G@@@@@@@&BG&@@@@@@&B#@@@@@@@@@@@@@@@@@@@@@@@ \n@@@###########J?!::~7!77Y#@@@@@@@@G5PPPP5PPP5P&&@GB#PPG#&@@@@@@@@@B#@@##@#&@&@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#############J::!???JG#@@@@@&#G555PPPP5PPB@&PP5PGP#&&@@@@@@@@@@@B#@@BB&G#@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#############BGG?^:::::!5B&&BBB#B#BBBBB&@&BG55555GBB#&@@@@@@@@&@@BB@@BB#G&@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#################!:::::::^!YPB&&##BBBP5B&B5555G#&@@@@@@@@@@@@@&B&@BG&@#&B#@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#################GG~^::::::~^5#&##BGPPPGP55PB&@@@@@@@@@@@@@@@@@&B#&GG&@@@###&@@@@@@@@@@@@@@@@@@@@ \n@@@###################BY:::::::YP!&@@@#GGP5PG#&@@@@@@@@@@@@@@@@@&&#BGB#&@@@@@@&&&@@@@@@@@@@@@@@@@@@@ \n@@@####################BGG5::::J!~&@@@B5PPB&@@@@@@@@@@@@@@@@@@&#BGBB&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#######################BG!::::7B#&&&&&@@@@@@@@@@@@@@@@@@@@#GB#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#########################PPP7JPP#&&@@@@@@@@@@@@@@@@&&@@@&GB#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#############################BPB&B#@@@@@@@@@@@@@@@@@#@@#B&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#########################B######BBBB#@@@@@@@@@@&&@@@@##&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@#########################BBB#BBB####B#&@@@@@@@##@@#@@&@@@@&#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@############################BB#&&#B#&@##@@@@@#&@@@&B@@@@&B#&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@##########################BB#&&#B#&@&##&@@@@@&@@@@#BBB###&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n@@@########################BB#&&#B#&@&#&@@@@@@@@@@@@@5##GG&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	Werewolf.add("[Loup-Garou]");
    Werewolf.add(21);
    Werewolf.add(22);
    Werewolf.add(23);
    Werewolf.add(24);
	AllMobs.add(Werewolf);
	
	ArrayList<Object> Fantome = new ArrayList<>();
	Fantome.add("YYJ7~^:.....               .7G&@@@@@@@@@@@@@@#?.               ..:~!?JJJYYY \nYJJ7~:.    .             ^B@@@@@@@@@@@@@@@@@@@@@G:             ...^!?JJJYYY \nYYJ!^:..    .          :B@@@@@@@@@@@@@@@@@@@@@@@@@P.           ...^!7JJJYYY \nYYJ!^....   ..        !@@@@@@@@@@@@@@@@@@@@@@@@@@@@&^          ...:~7?JJYYY \nYYJ!^....            !@@@@@@@@&BG#@@@@@@@@@@@@@@@@@@@~         ...:^!7JJYYY \nYYJ!^:....          .&@@@@@@@J    P@@@@B^..~&@@@@@@@@@.        ...:^~7?JJYY \nYYJ7~:.....         7@@@@@@@Y     ~@@@&     .@@@@@@@@@P        ...::^!?JJYY \nYJ?!~:........      G@@@@@@@&~   ^&@@@#     :@@@@@@@@@&        ...::^~7?JYY \nYJ?!~::......       &@@@@@@@@@@&@@@@@@@#?~!Y@@@@@@@@@@&        ..::^~!7?JYY \nYJ?7~:..            &@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B        .:^~~~!7?JYY \nYYJ7~:.             P@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@^        .^~!!77?JJJY \nYYJ?!^.             ^@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@5        .:^~!77?JJJJY \nYYYJ7!^.             #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#         ..^~!7?JJJYYY \nYYYJJ?!~:.           ?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B           .:^~!?JJYYYY \nYYYYJJ?!^:.          .@@@@@@@@@@@@@@@@@@@@@@@@@@@@G            ..:^~7JJJYYY \nYYYYYJ?7~:..          G@@@@@@@@@@@@@@@@@@@@@@@@@@P             ..:^!7JJJYYY \nYYYYYJ?7~^:..         7@@@@@@@@@@@@@@@@@@@@@@@@@B             ..:^~!?JJJYYY \nYYYYJJ?7!~^:.         .@@@@@@@@@@@@@@@@@@@@@@@@@.             ..::^!?JJJJYY \nYYYYJJ?77!~^:.         &@@@@@@@@@@@@@@@@@@@@@@@5               ..:^~7?JJJYY \nYYYYJJ?77!!~^::..      B@&&@@@@@@@@@@@@@@@@@@@@!               ..::~7?JJJJY \nYYYYJ??777!!~~^:..     G@&&@@@@@@@@@@@@@@@@@@@@5                ..:~!?JJJJY \nYYYYJJ??777!!~~::..    B&&#@@@@@@@@@@&&@@@@&@@@@:               ..:~7?JJJYY \nYYYYJJ???777!!~^:.    .&&#B@@@@@@@@@&&&&@@&&&&@@&.              .:^!7?JJJJJ \nYYYYJJJ???777!!~:.    ?##GY@@@@@@@@@&#B&@@&###&&@#.            .:~!7?JJJJJY \nYYYYYJJJ????777!^:   ^5?#J~@@@@@@@@@&GPB&&&BBB#&&@&7          .^!7??JJJJYYY \nYYYYYJJJ?????77!~:. ^7 JB: &@@@@@@@@@PJ5#&&BPGB##&&&B^    .:^~!7???JJJJJYYY \nYYYYYJJJJJJ???7!~:.:.  BJ  G@@@&&@@@@G~~P&&BYJ5GB#&G7P5~..^~!77?????JJJJJYY \nYYYYYJJJJJJ???7!^:.   7G.  ~@@@&&&&&@&~ ^P&#J!7JPB#&Y .~7!!!!77?????JJJJJYY \nYYYYYJJJJJJJ??7!~:.  .G:    #@&&J7#&&&P. :P#P::^!JPB#P..:~!777?????JJJJJJYY \nYYYYYYYJJJJJJJJ?7!^..P~     !@&J  .5&&&7  .5#J  .:^75BB7^~!77?????JJJJJJYYY \nYYYYYYYYYYYJJJJJJJ775?~:.    ##     !B&&:   !B5.  ..:~JP5?777???JJJJJJJJYYY \nYYYYYYYYYYYYYYYYJJY5J??7~:.  !#      .J&#.    75~  .:^!7?YYJJJJJJJJJJJJYYYY \nYYYYYYYYYYYYYYYYYYYJJJJJ?7~:..G.       .PB.     ~?!~!7??JJJJJJJJJJJJJYYYYYY \nYYYYYYYYYYYYYYYYYYJYYYYYJJ?!^.7:         ^Y:  ..:~?JJJJJJJJJJJJJJJJJYYYYYYY \nYYYYYYYYYYYYYYYYYYYYYYYYYJJ?!^^:          .!^:^~!7?JJJJJJJJJJJJJJJYYYYYYYYY ");
	Fantome.add("[Fantôme]");
    Fantome.add(21);
    Fantome.add(22);
    Fantome.add(23);
    Fantome.add(24);
	AllMobs.add(Fantome);
	
	ArrayList<Object> Armure = new ArrayList<>();
	Armure.add("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGBBBBBGGGGGBBBBBGGGGGGGGGGGGGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGGGGGGGGGGGBBBGY!!^:.....::~?5GBBGGGGGGGGGGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGGGGGGGGBBGY?~:.     ...      .:?GBBGGGGGGGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGGGGGBBGJ^:::::...::::::^^^::..  .^5BGGGGGGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGGGGBG7..^!!~^^^~~~~^~!7!~^^^^:..  .7GBGGGGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGGGBJ. :?5J~!?JJJ?!!7JJ!~!77!^:::.. .~GGGGGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGBB~  :5G5?YJPGGJ7J55?!!77!!~!~~^:.. .7BGGGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGB!  .G#GG&BBBG5YY5J!!7?7~~!!!~:::..  :5BGGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGBJ   5&##&#BGGYP5J!~!!~~~~~!~^^^^:..  .7BBGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGBP   .#B5P5P5Y!777^^~~:^~~7~~!?J7~:..   .^YBGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGY~ ^J^                  .^~!7?PG!..    ^GGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGBBPP.                    .^^:~7?~.   ..PBGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGGGBB:    :.......::::::::.~~:.:..    .~BGGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGGBP.    ^!^!77^^::::.....~!~~^..      !BGGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGGGG~    ~!!?YJ~^:^:.....77~~^^:...    ^BGGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGGGBG.   !7?YP5!^^^.....7?!~^^::..      5BGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGGGGB?   !?J5PY~^^::::.~?!~~^:. :JJYJ!^:!BGGGGGGGGGGGGGGG \nGGGGGGGGGGGGGGGGGGGGGGBG.  7?JY5J!~~^::...        .GBBBBBBBBBBGGGGGGGGGGGGG \nGBGGGGGGGGGGGGGGGGGGGGGG.  !?JY?7~::.              :GBBGPY?7~7GGGGGGGGGGGGG \nGGGGGGGGGGGGGGBBGGGGGGGB5  ^!~~^.          ....     ^~:.     :BBBBBBBBBBBBG \nGGGGGGGGGGBBBBP5BBGGGGBY:  ..:          .:!?J?~:...           !7!!!!77?JY5P \nGGGGGGBBBG5?!:  ~GGBBBY.              ..:^7YJ7~:......                    . \nGGGGBBP?^.       .::??. .            .::^7YY!::^~~~::::....::::::....      \nGGBGJ^     .... .  .      ...  .... .....~7YPJ!!~^^!77~~~!!!!~~^^^^^::...  \nGBY:     .:^:::^    .         ......:~75B&BYY5Y?!!YJ77?JYPPGGPP55YJ?7!~^:.. \nG!     ..:^^:^~   ..  ...  .:^~!777?JPB#&@@@GJJ!~J5J777?G#B&@&@@@@&#BPY?!~^ \n~     .:^^^^^^    ........:^~!7???JYPG&@@@@@&&J^??!~~7?YPGB&&&@@@@@@@@&G5?! \n     .::^:::.    .......!5GBGPYJJY5GBP#&@@@@@#J^~~~^^~!?Y5PGB#&@@@@B@@@&GJ7 \n    ..::...     ...... :5GGPPJJJJJY55P#&&@@@#BJ^.:~!!~^~!?JYY5PG#&&#&&&#GJ! \n   ......      ...... .JYYYJ??JJY55YY5G#&@&&B5J~.  .~77~^~!7?JYY5PGGPPP5J7~ \n                ...   ^777??77??Y5YPP55G#&&#GJ7!~^    .:^^^^~~7?J??!??77~^^ \n  .                  .^^~~!!7!77JY7?Y5PPGBBPJ7!~^:^.      ..::^^^~!~!!~~^^: \n:?J                  :::::^^^^~!7?7~!J5PGGG5J!!~^:.:            ..^^~!~~^^: \nGB:                 .^::::.:::::^!!!~7?Y555J7~^^:.. .                  .... \nB!                  ::.::::....:::^^^~!???7!~~^:..                          ");
	Armure.add("[Armure Possédée]");
    Armure.add(21);
    Armure.add(22);
    Armure.add(23);
    Armure.add(24);
	AllMobs.add(Armure);
	
	ArrayList<Object> Diablotin = new ArrayList<>();
	Diablotin.add("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ \n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ \n:::^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^:^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ \n:^^^^^^^^^^^^^^^^^^^^^:^:::::::::::::::::::::::::^^^^^^^^^^^^^^^^^^^^^^^^^^ \n::^^^^^^^^^^^^::::::::::::::::::::::::::::::::::::::::::::::^^^^^^^^^^^^^^^ \n:::::::::::::::::::::::::...::...........::.....::::::::::::::::::::::::::^ \n:::::::::::::::::::.......5:.................~B......::::::::::::::::^^^^^^ \n:::::::::::::::...........#@G~ ........... :#@@..........:::::::::::::::::^ \n::::::::::::::..........  #@@B             :@@@. ..........:::::::::::::::: \n?777~:..............      #@@@?           :#@@@.      .............:~!77??J \n#@@@@@&BJ?^:              #@@@@Y         7@@@@@             .:^75B&@@@@@@PJ \n !@@@@@@@@@@#B?:.         B@@@@&         #@@@@@         .^YB#@@@@@@@@@@&^.. \n..:#@@@@@@@@@@@@@&Y?:.    #@@@@@#J#&&&&5B@@@@@&    :75G&@@@@@@@@@@@@@@&^..: \n....B@@@@@@@@@@@@@@@@@G.  7@@@@@@@@@@@@@@@@@@B.  7&@@@@@@@@@@@@@@@@@@#...:: \n... P@@@@@@@@@@@@@@@@@@@J  .#@@@@@@@@@@@@@@@5  .P@@@@@@@@@@@@@@@@@@@@P .::: \n... B@@@@@@@@@@@@@@@@@@@@^   ?@@JG@@@@&J&@@!  J@@@@@@@@@@@@@@@@@@@@@@G .::: \n...P@@@@@@@@@@@@@@&#&#&@@@&&&&@@&57PPY7#@@@&&&@@@@&#&&#&@@@@@@@@@@@@@@G:.:: \n..~@@@@@@@@@@@@@G^     ~G@@@@@@@@@@@@@@@@@@@@@@@G^     .7B@@@@@@@@@@@@@J.:: \n..~@@@BY5YP@@@5:          #@@@@@&@@@@@@@@@&@@@@7          :G@@@5YYYG@@@J.:: \n:.!@@?.    ^B#            B@@@&::B@@@@@@&Y G@@@.            B#^     !&@J.:: \n:.7&:...............      B@@@G^@@@@@@@@@@7J@@@.        ............ ~@J.:: \n:.7G....................  B@@@G^@@@@@@@@@@JJ@@@.    ..................7J.:: \n:::::::::::::............ B@@@P .7#@@@@@&Y.Y@@@. ............:::::::::::::: \n::::::::::::::............#@&J.   5@@@&?.  :#@@:..........::::::::::::::::: \n:::::::::::::::::.........#J. . :&@@&?. .....&@:.......:::::::::::::::::::^ \n:^^^^^^:^^:::::::::::::...#~....&@@@: .......~&:..::::::::::::^^^^^^^^^^^^^ \n::^^^^^^^^^::::::::::::::.:.....@@@@:....:::..::::::::::::::^^^^^^^^^^^^^^^ \n::::^^::::::::::::::::::::::::..P@@@:.::::::::::::::::::::::^^^^^::::^^^^^^ \n:^^^^^^^^^^^^^^^^^::::::::::::::.^#@^::::::::::::::::^^^^^^^^^^^^^^^^^^^^^^ \n:^^^^^^^^^^^^^^^^^:::::::::::::::.Y@^:::::::::::::^^^^^^^^^^^^^^^^^^^^^^^^^ \n:::^^^^^^^^^^^^^^^^^^^:::::::::::::&^:::::::::::^^^^^^^^^^^^^^^^^^:^^^^^^^^ \n:^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^:::~:::^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ \n:^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^:^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ \n:^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ \n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	Diablotin.add("[Diablotin]");
    Diablotin.add(21);
    Diablotin.add(22);
    Diablotin.add(23);
    Diablotin.add(24);
	AllMobs.add(Diablotin);
	}
	
	
	public Creature (){
		//Ce constructeur créera une créature aléatoire selon la progression actuelle de la partie.
		//On selectionne d'abord un set de stats aléatoriement dans la liste des mobs ci-dessus
        ArrayList<Object> selection = AllMobs.get(random.nextInt(AllMobs.size()));
		//construit un nouveau Creature avec
        this.portrait=(String)selection.get(0);
		this.nom=(String)selection.get(1);
		this.HP=(int)selection.get(2);		
		this.STR=(int)selection.get(3);
		this.SPD=(int)selection.get(4);
		this.LUK=(int)selection.get(5);
	}
	
	
	
	public Creature(String portrait, String nom, int HP, int STR, int SPD, int LUK){
		this.portrait=portrait;
		this.nom=nom;
		this.HP=HP;
		this.STR=STR;
		this.SPD=SPD;
		this.LUK=LUK;
	}
	

	
	
	
	
	public String getportrait(){
		return this.portrait;
	}
	
	public String getNom(){
		return this.nom;
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
	
	public void setportrait(String portrait){
		this.portrait=portrait;
	}
	
	public void setnom(String nom){
		this.nom=nom;
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
		return((this.getportrait()+ "\n" +this.getNom() + " " + " //" +"♥ = "+ this.getHP()+ " ⚔ = "+ this.getSTR()+ " 💨 = "+ this.getSPD()+ " ☘ = "+ this.getLUK()));
	}
		
}
