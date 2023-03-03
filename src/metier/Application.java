package metier;

import model.FirePokemon;
import model.Pokemon;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokemon pokemon = new Pokemon("Poc", 5, 5);
		Pokemon pac = new Pokemon("Pac",10, 8);
		
		System.out.println(pokemon.getName());
		System.out.println(pokemon.getAtk());
		System.out.println(pokemon.toString());
		
		System.out.println(pac.toString());
		System.out.println(pac.getAtk());
		
		pokemon.attack(pac);
		System.out.println(pac.toString());
		
		 FirePokemon pic= new FirePokemon("Pic",20, 17);
		 System.out.println(pic.toString());
		 
		 pic.befriendly(pac);
		 System.out.println(pac.toString());
		
		 pac.attack(pokemon);
			System.out.println(pokemon.toString());
			/*System.out.println(pac.getHp());
			System.out.println(pic.getAtk());
			
			pokemon.attack(pac);*/
			//System.out.println(pac.toString());
			

	}

}
