package model;

import interfaces.ListActions;
import utils.Constants;

public class PlantPokemon extends Pokemon {
	

	public PlantPokemon(String name, int hp, int atk) {
		super(name, hp, atk);
		
	}
	
	    // atkF = 2*atkP   atkF = 1/2atkE  atkF = 1/2atk;
	
		// atkP = 2atW   atkP = 1/2atkF  atkP = 1/2atk;
		
		// atkW = 2*atkF    atkW = 1/2atkP  atW = 1/2atk;
	
	
	@Override
	public void attack(Pokemon p) {
		switch (p.getClass().getSimpleName()) {
		case "PlantPokemon":
		case "FirePokemon":{
			//p.setHp(p.getHp() - Math.round(this.getAtk() * 0.5f));
			p.setHp(p.getHp() - Math.round(this.getAtk() * Constants.ATK_LESS_FORCE));
			break;
		}
		case "WaterPokemon":{
			p.setHp(p.getHp() - (this.getAtk()* Constants.ATK_FORCE));
			break;
		}
		default:
			super.attack(p);
		}
		
	}

}
