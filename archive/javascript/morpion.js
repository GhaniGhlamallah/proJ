
				document.body.querySelector("table").addEventListener('click',click_td);

				let joueur='X';
				function click_td(event) 
				{
				console.log('Click');
				if(event.target.textContent!=''){return;}
				event.target.textContent=joueur;
				if(joueur==='X'){joueur='O';}else{joueur='X';}
				}
	