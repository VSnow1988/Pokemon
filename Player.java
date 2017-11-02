public abstract class Player{
	static Pokemon createPokemon(String name,String type){
		return(new Pokemon(name,type));
	}
	
	static void attackPokemon(Pokemon attacker,Pokemon opponent){
		double hit = (Math.floor(Math.random()*5)-0);
		opponent.health -= hit;
		if(hit == 0){
			System.out.println(attacker.name + " attacked " + opponent.name + " ,but it missed!");
		}
		else {
			System.out.println(attacker.name + " attacked " + opponent.name + " and did " + hit + " points of damage! ");
		}
	}
}