package RockPaperScissors;

public class PlayerA extends GeneralPlayer{
	
	PlayerA(String name){
		super(name);
	}
	
	public EnumMoveChoice nextMove() {
		return EnumMoveChoice.PAPER;
	}

}
