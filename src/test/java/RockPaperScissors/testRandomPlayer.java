package RockPaperScissors;

import static org.junit.Assert.*;

import org.junit.Test;

public class testRandomPlayer {

	@Test
	public void testInitialization() {
		RandomPlayer newRandomPlayer = new RandomPlayer("newRandomPlayer");
		assertEquals(newRandomPlayer.getName(),"newRandomPlayer");
	}
	
	@Test
	public void testnextMove() {
		RandomPlayer newRandomPlayer = new RandomPlayer("newRandomPlayer");
		assertEquals(3,EnumMoveChoice.values().length);
		EnumMoveChoice actual = newRandomPlayer.nextMove();
		
	}

}
