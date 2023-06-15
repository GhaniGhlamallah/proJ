// Des raccourcis
const tux=document.getElementById('tux');
const spanEtape=document.getElementById('etape');
const spanScore=document.getElementById('score');
const spanTemps=document.getElementById('temps');




// Variables globales : L'état du jeu
let score=0;
let etape="debut";
let temps =-1;
let timer=window.setInterval(minuteur,1000);

  document.addEventListener('keydown',function(event){
  if(etape!=="jeu"){return};
  console.log('Touche enfoncée:',event.key);
  let rect=tux.getBoundingClientRect();
  console.log(rect);
  let d=100;
  let left=rect.left;
  let top=rect.top;
  if(event.key==='ArrowRight'){left+=d;}
  if(event.key==='ArrowLeft' ){left-=d;}
  if(event.key==='ArrowDown' ){top+=d;}
  if(event.key==='ArrowUp'   ){top-=d;}
  left=Math.max(10,left);
  top =Math.max(10,top);
  left=Math.min(1010-rect.width ,left);
  top =Math.min(510-rect.height,top);
  tux.style.left=left+"px";
  tux.style.top=top+"px";
}
);




document.addEventListener('click',function (event) 
{
  if(etape!=="jeu"){return};	
  // Petit détail: éviter la sélection 
  event.preventDefault();

  if(event.pageX-16<10 || 
     event.pageY-16<10 || 
     event.pageX-16+32>1000+10 || 
     event.pageY-16+40>500+10    ){return;} 

  let i=document.createElement('img');
  i.src='https://moodle.iutv.univ-paris13.fr/img/bjs/splat.png';
  i.className='splat';
  document.body.append(i);
  // Forcer le navigateur à prendre en compte la situation actuelle (position, scale).
  // Ceci permettra au navigateur de s'apercevoir d'un changement futur des propriétés CSS.
  window.getComputedStyle(i).top;
  // Changer les propriétés CSS qui transitionnent. 
  // Le navigateur s'aperçoit du changement et déclenche la transition.
  i.style.top =(event.pageY-16)+'px';
  i.style.left=(event.pageX-16)+'px'; 
  i.style.transform='scale(1)';
  setTimeout(function(){
	let rectTux=tux.getBoundingClientRect();
	let rectSplat=i.getBoundingClientRect();
	let touche=
		rectSplat.top +rectSplat.height >= rectTux.top                  &&
		rectSplat.top                   <  rectTux.top  +rectTux.height &&
		rectSplat.left+rectSplat.width  >= rectTux.left                 &&
		rectSplat.left                  <  rectTux.left +rectTux.width  ;
	if(touche){
	  i.src="https://moodle.iutv.univ-paris13.fr/img/bjs/splat2.png";
      getComputedStyle(i).top;
      i.style.opacity=0;
      setTimeout(function(){i.remove();},3000);
	  score+=5;
	}
	else
	{
	  i.style.zIndex=-1;
	  score-=1;
	}
    spanScore.textContent=score;
  },1000);
}
);
window.setInterval(function(){console.log;},1000);





document.getElementById("commencer").addEventListener("click",function()
{
	changer_etape("jeu");	
}
);

function changer_etape(nouvelleEtape){
	etape=nouvelleEtape;
	document.getElementById("etape").textContent=etape;
	if (nouvelleEtape=="jeu"){
		temps=10;
		document.getElementById("temps").textContent=temps;
		timer=window.setInterval(minuteur,1000);
		score=0;
		document.getElementById("score").textContent=score;
		document.querySelectorAll(".splat").forEach(splat=>splat.remove());
  		tux.style.left="500"+"px";
  		tux.style.top="250"+"px";
	};
};




function minuteur(){
	if (temps==-1){return;};
	if(temps==0){
		changer_etape("fin");
		timer=window.clearInterval(timer);
		document.getElementById("commencer").value="recommencer";
		document.getElementById("gameover").style.opacity=1;
		return;
	};
	temps-=1;
	document.getElementById("temps").textContent=temps;
};
