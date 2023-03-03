package model;

import interfaces.ListActions;

public class Pokemon implements ListActions{
	
	private String name;
	private int hp;
	//private float atk;
	private int atk;
	
	public Pokemon(String name, int hp, int atk) {
		
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}
	//////////functions sup.//////
	//var1
	/*public boolean isDead() {
		 boolean isDead = false;
		 
		 if(hp!= 0) {
			 System.out.println("Pokemon is not dead"); 
			 return isDead;
		 }
		
		return isDead= true;
	}*/
	
	//var2
	public boolean isDead() {
		return this.hp == 0;
	}

	// setter pour modifier la vie (hp) du pokemon
	public void setHp(int hp) {
			this.hp = hp;
	}
		
	// be friendly ????

	public void befriendly(Pokemon p) {
			 p.hp = (p.getHp() + this.atk);
			 
			 System.out.println("Pokemon" + p + " have " + hp); 
			return;
			
	}
	
	// attack
			//var1
	/*public float attack(float atk) {
		hp-= atk;
		System.out.println("Pockemon use " +  atk + " il reste " + hp );
		return hp;
	}
			//ou var2 (avec hp en protectid)
	public void attack(Pokemon p) {
		p.hp -= this.atk;
	}
		*/
			//var3(true!)
	 //attack(); p est un classe pokemon ennemi - instance de classe Pokemon
	 //	avec get() et set() :
		
	@Override
	public void attack(Pokemon p) {
		p.setHp(p.getHp() - this.atk);
	}
	
	
	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", hp=" + hp + ", atk=" + atk + "]";
	}

	

}
