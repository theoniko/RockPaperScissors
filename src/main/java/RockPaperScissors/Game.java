package RockPaperScissors;


public class Game {
	private  int NUMBER_OF_GAMES = 100;
	private PlayerA playerA;
	private RandomPlayer playerB;
	private int[] Score= {0,0,0};
	
	public PlayerA getPlayerA() {
		return playerA;
	}

	public void setPlayerA(PlayerA playerA) {
		this.playerA = playerA;
	}

	public RandomPlayer getPlayerB() {
		return playerB;
	}

	public void setPlayerB(RandomPlayer playerB) {
		this.playerB = playerB;
	}

	
	Game(){
		this.playerA= new PlayerA("PaperPlayer");
		this.playerB= new RandomPlayer("RandomPlayer");
	}
	
	public void StartGame() {
		for(int i=0;i<NUMBER_OF_GAMES;i++){
			evaluateResult();
		}
		printScore();
	}
	
	public void evaluateResult() {
		if (playerA.nextMove()==playerB.nextMove()) {
			Score[0]= Score[0]+1;
		}else
		 if(playerA.nextMove().beats(playerB.nextMove())) {
			Score[1]= Score[1]+1;
		}else{
			Score[2]= Score[2]+1;
		}
	}
	
	public void printScore() {
		System.out.println("Player A wins "+Score[1] +" of "+NUMBER_OF_GAMES+" games");
		System.out.println("Player B wins "+Score[2] +" of "+NUMBER_OF_GAMES+" games");
		System.out.println("Tie: "+Score[0]+" of "+NUMBER_OF_GAMES+" games");
	}
	
	public static void main(final String[] args) {
		
        Game game=new Game();
        game.StartGame();
        
	}
}
