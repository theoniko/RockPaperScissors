package RockPaperScissors;

import static org.junit.Assert.*;

import org.junit.Test;

public class testGame {
	
	@Test
	public void testInitialization() {
		Game game=new Game();
        game.StartGame();
        assertEquals(game.getPlayerA().getName(),"PaperPlayer");
        assertEquals(game.getPlayerB().getName(),"RandomPlayer");
	}

	@Test(expected=NullPointerException.class)
	public void testNullPointerException() {
		Game game=new Game();
        game.setPlayerA(null);
        game.StartGame();
	}

}
