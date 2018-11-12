package RockPaperScissors;
import java.util.Random;

public class RandomPlayer extends GeneralPlayer {
	RandomPlayer(String name){
		super(name);
	}
	
	public EnumMoveChoice nextMove() {
		Random rand = new Random();
		return EnumMoveChoice.values()[rand.nextInt(EnumMoveChoice.values().length)];
	}
}


