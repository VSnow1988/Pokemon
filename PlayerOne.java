public class PlayerOne extends Player{
	public static void main(String[] args){
	Pokemon Pkmn1 = new Pokemon("Purple Cat", "Espeon");
	Pokemon Pkmn2 = new Pokemon("Haunter", "Haunter");
	Pokemon Pkmn3 = new Pokemon("Snaky", "Seviper");

	System.out.println(Pokemon.count + " Pokemon were added to your team!");
	System.out.println("Your second Pokemon is a " + Pkmn2.type + " named " + Pkmn2.name + " with " + Pkmn1.health + " HP.");
	System.out.println("Your first Pokemon is a " + Pkmn1.type + " named " + Pkmn2.name + " with " + Pkmn2.health + " HP.");
	System.out.println("Your third Pokemon is a " + Pkmn3.type + " named " + Pkmn3.name + " with " + Pkmn3.health + " HP.");
	
	attackPokemon(Pkmn1,Pkmn2);
	}
}