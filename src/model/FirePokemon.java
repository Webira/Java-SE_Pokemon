package model;

import interfaces.ListActions;
import utils.Constants;

public class FirePokemon extends Pokemon {

	public FirePokemon(String name, int hp, int atk) {
		super(name, hp, atk);
		
	}

	@Override
	public void attack(Pokemon p) {
		// TODO Auto-generated method stub
		switch (p.getClass().getSimpleName()) {
		case "FirePokemon":
		case "WotterPokemon":
			p.setHp(p.getHp() - Math.round(this.getAtk() * Constants.ATK_LESS_FORCE));
		break;
		case "PlantPokemon":{
			p.setHp(p.getHp() - (this.getAtk() * Constants.ATK_FORCE));
			break;
		}
			
		}
		
	}
		
}

	// atkF = 2*atkP   atkF = 1/2atkE  atkF = 1/2atk;
	
	// atkP = 2atkE   atkP = 1/2atkF  atkP = 1/2atk;
	
	// atkE = 2*atkF    atkE = 1/2atkP  atkE = 1/2atk; 
	
	
	