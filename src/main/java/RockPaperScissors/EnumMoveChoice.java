package RockPaperScissors;

public enum EnumMoveChoice {
	ROCK,PAPER,SCISSORS;
	
	boolean beats(EnumMoveChoice counter) {
			switch (this) {
	        case ROCK:
	            return (counter == SCISSORS);
	        case PAPER:
	            return (counter == ROCK);
	        case SCISSORS:
	            return (counter == PAPER);
	        default:
	         throw new IllegalStateException();
	    }
	}
}
