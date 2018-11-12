package RockPaperScissors;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class testEnumMoveChoice{

	@Test
	public void testWinCase() {
		assertTrue(EnumMoveChoice.ROCK.beats(EnumMoveChoice.SCISSORS));
		assertTrue(EnumMoveChoice.SCISSORS.beats(EnumMoveChoice.PAPER));
		assertTrue(EnumMoveChoice.PAPER.beats(EnumMoveChoice.ROCK));
	}
	
	@Test
	public void testLossCase() {
		assertFalse(EnumMoveChoice.ROCK.beats(EnumMoveChoice.PAPER));
		assertFalse(EnumMoveChoice.PAPER.beats(EnumMoveChoice.SCISSORS));
		assertFalse(EnumMoveChoice.SCISSORS.beats(EnumMoveChoice.ROCK));
	}
}
