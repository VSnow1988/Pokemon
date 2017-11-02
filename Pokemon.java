public class Pokemon{
	static int count = 0;

	String name;
	double health;
	String type;
	
	public void setName(String name){
		this.name = name;
	}
	public void setHealth(double health){
		this.health = health;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getName(){
		return(this.name);
	}
	public double getHealth(){
		return(this.health);
	}
	public String getType(){
		return(this.type);
	}
	
	public Pokemon(String name, String type){
		Pokemon.count ++;
		this.name = name;
		this.type = type;
		this.health = (Math.floor(Math.random()*10)-1);
	}

	
}