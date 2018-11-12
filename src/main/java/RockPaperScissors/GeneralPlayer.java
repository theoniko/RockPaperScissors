package RockPaperScissors;

abstract public class GeneralPlayer {
	private String name;
	GeneralPlayer(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract public EnumMoveChoice nextMove();
}
