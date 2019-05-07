package pkgGame;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eGameDifficulty;

public class SudokuGameDifficultyTest {

	@Test
	public void TestEnum() {

		eGameDifficulty eGD1 = eGameDifficulty.get(0);
		assertNull(eGD1);
		
		eGameDifficulty eGD2 =eGameDifficulty.get(100);
		assertEquals(eGameDifficulty.EASY, eGD2);
		
		eGameDifficulty eGD3=eGameDifficulty.get(499);
		assertEquals(eGameDifficulty.EASY, eGD3);
		
		eGameDifficulty eGD4=eGameDifficulty.get(500);
		assertEquals(eGameDifficulty.MEDIUM, eGD4);
		
		eGameDifficulty eGD5=eGameDifficulty.get(999);
		assertEquals(eGameDifficulty.MEDIUM, eGD5);
		
		eGameDifficulty eGD6=eGameDifficulty.get(1000);
		assertEquals(eGameDifficulty.HARD, eGD6);
		
		eGameDifficulty eGD7=eGameDifficulty.get(1001);
		assertEquals(eGameDifficulty.HARD, eGD7);

	}
}
